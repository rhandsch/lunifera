/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Source partially based on org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.jvmmodel;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral;
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class EntityTypesBuilder extends JvmTypesBuilder {

	@Inject
	private IQualifiedNameProvider fqnProvider;

	@Inject
	private TypesFactory typesFactory;

	@Inject
	private TypeReferences references;

	@Inject
	private Primitives primitives;

	@Inject
	private OperationsGenerator operationsGenerator;

	/**
	 * Returns true if the upper bound of the reference is many.
	 * 
	 * @param multiplicity
	 * @return
	 */
	public boolean isMany(LReference reference) {
		if (reference == null) {
			return false;
		}
		return EntityBounds.createFor(reference.getMultiplicity()).isToMany();
	}

	/**
	 * Returns true if the lower bound of the reference is 1.
	 * 
	 * @param multiplicity
	 * @return
	 */
	public boolean isRequired(LReference reference) {
		if (reference == null) {
			return false;
		}
		return EntityBounds.createFor(reference.getMultiplicity()).isRequired();
	}

	/**
	 * Returns true if the lower bound of the reference is 0.
	 * 
	 * @param multiplicity
	 * @return
	 */
	public boolean isOptional(LReference reference) {
		if (reference == null) {
			return false;
		}
		return EntityBounds.createFor(reference.getMultiplicity()).isOptional();
	}

	/**
	 * Returns the bounds of the given multiplicity.
	 * 
	 * @param multiplicity
	 * @return
	 */
	public EntityBounds getBounds(LMultiplicity multiplicity) {
		return EntityBounds.createFor(multiplicity);
	}

	public JvmTypeReference toTypeReference(@Nullable LReference sourceElement) {
		return toTypeReference(sourceElement, null);
	}

	/**
	 * Same as {@link #toTypeReference(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmTypeReference toTypeReference(@Nullable LReference sourceElement,
			@Nullable Procedure1<? super JvmTypeReference> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmTypeReference ref = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		if (!bounds.isToMany()) {
			ref = newTypeRef(sourceElement,
					fqnProvider.getFullyQualifiedName(sourceElement.getType())
							.toString(), (JvmTypeReference[]) null);
		} else {
			JvmTypeReference genericParam = newTypeRef(sourceElement,
					fqnProvider.getFullyQualifiedName(sourceElement.getType())
							.toString(), (JvmTypeReference[]) null);
			if (genericParam != null) {
				ref = newTypeRef(sourceElement, List.class, genericParam);
			}
		}

		return initializeSafely(ref, initializer);
	}

	@Nullable 
	public JvmEnumerationLiteral toEnumerationLiteral(@Nullable LEnumLiteral sourceElement, @Nullable String name, 
			@Nullable Procedure1<? super JvmEnumerationLiteral> initializer) {
		if (sourceElement == null || name == null)
			return null;
		JvmEnumerationLiteral result = typesFactory.createJvmEnumerationLiteral();
		result.setSimpleName(name);
		result.setVisibility(JvmVisibility.PUBLIC);
		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}
	
	@Nullable
	public JvmOperation toGetter(@Nullable LReference sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting) {
		return toGetter(sourceElement, name, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	@Nullable
	public JvmOperation toGetter(@Nullable LReference sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (entityTypeReference != null) {
			if (!bounds.isToMany()) {
				result = toGetter(sourceElement, name, entityTypeReference,
						setting);
				setDocumentation(
						result,
						operationsGenerator.get_toOne_Reference_Documentantion(
								sourceElement, name, setting).toString());
			} else {
				JvmTypeReference ref = newTypeRef(sourceElement, List.class,
						entityTypeReference);
				result = toZeroToManyGetter(sourceElement, name, ref, setting);
				setDocumentation(
						result,
						operationsGenerator
								.get_toMany_Reference_Documentantion(
										sourceElement, name, setting)
								.toString());
			}
			associate(sourceElement, result);
		}
		return initializeSafely(result, initializer);
	}

	/**
	 * shorthand for <code>toGetter(sourceElement, name, name, typeRef)</code>.
	 */
	@Nullable
	public JvmOperation toGetter(@Nullable final EObject sourceElement,
			@Nullable final String name, @Nullable JvmTypeReference typeRef,
			@Nullable LGenSettings setting) {
		return toGetter(sourceElement, name, name, typeRef, setting);
	}

	@Nullable
	public JvmOperation toGetter(@Nullable final EObject sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable JvmTypeReference typeRef,
			@Nullable final LGenSettings setting) {

		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		String prefix = "get";
		if (typeRef != null && !typeRef.eIsProxy()
				&& !typeRef.getType().eIsProxy()
				&& "boolean".equals(typeRef.getType().getIdentifier())) {
			prefix = "is";
		}
		result.setSimpleName(prefix + Strings.toFirstUpper(propertyName));
		result.setReturnType(cloneWithProxies(typeRef));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					if (sourceElement instanceof LProperty) {
						p.append(operationsGenerator
								.get_toOne_Property_OperationContent(
										(LProperty) sourceElement,
										propertyName, setting));
					} else if (sourceElement instanceof LReference) {
						p.append(operationsGenerator
								.get_toOne_Reference_OperationContent(
										(LReference) sourceElement,
										propertyName, fieldName, setting));
					}
				}
			}
		});

		if (sourceElement instanceof LProperty) {
			setDocumentation(
					result,
					operationsGenerator.get_toOne_Property_Documentantion(
							(LProperty) sourceElement, propertyName, setting)
							.toString());
		} else if (sourceElement instanceof LReference) {
			setDocumentation(
					result,
					operationsGenerator.get_toOne_Reference_Documentantion(
							(LReference) sourceElement, propertyName, setting)
							.toString());
		}
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toIsDisposed(@Nullable final EObject sourceElement) {
		JvmOperation operation = super.toGetter(
				sourceElement,
				"disposed",
				newTypeRef(sourceElement, Boolean.TYPE,
						(JvmTypeReference[]) null));
		setDocumentation(operation, operationsGenerator
				.isDisposed_Documentantion().toString());
		return operation;
	}

	@Nullable
	public JvmOperation toCheckDisposed(@Nullable final EObject sourceElement) {
		if (sourceElement == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PRIVATE);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("checkDisposed");
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.checkDisposed_OperationContent());
				}
			}
		});
		setDocumentation(result, operationsGenerator
				.checkDisposed_Documentantion().toString());
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toDispose(@Nullable final LEntity sourceElement) {
		if (sourceElement == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("dispose");
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.dispose_OperationContent(sourceElement));
				}
			}
		});
		setDocumentation(result, operationsGenerator.dispose_Documentantion()
				.toString());
		return associate(sourceElement, result);
	}

	/**
	 * shorthand for <code>toSetter(sourceElement, name, name, typeRef)</code>
	 */
	@Nullable
	public JvmOperation toSetter(@Nullable final EObject sourceElement,
			@Nullable final String name, @Nullable JvmTypeReference typeRef,
			@Nullable LGenSettings setting) {
		return toSetter(sourceElement, name, name, typeRef, setting);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable final EObject sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final JvmTypeReference typeRef,
			@Nullable final LGenSettings setting) {
		if (sourceElement == null || propertyName == null || fieldName == null)
			return null;

		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("set" + Strings.toFirstUpper(propertyName));
		result.getParameters().add(
				toParameter(sourceElement, propertyName,
						cloneWithProxies(typeRef)));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.set_toOne_Property_OperationContent(
									(LProperty) sourceElement, propertyName,
									fieldName, setting));
				}
			}
		});

		// just apply the documentation
		if (sourceElement instanceof LProperty) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Property_Documentantion(
							(LProperty) sourceElement, propertyName, setting)
							.toString());
		}
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toZeroToManyGetter(
			@Nullable final LReference sourceElement,
			@Nullable final String propertyName,
			@Nullable final JvmTypeReference typeRef,
			@Nullable final LGenSettings setting) {
		if (sourceElement == null || propertyName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		String prefix = "get";
		if (typeRef != null && !typeRef.eIsProxy()
				&& !typeRef.getType().eIsProxy()
				&& "boolean".equals(typeRef.getType().getIdentifier())) {
			prefix = "is";
		}
		result.setSimpleName(prefix + Strings.toFirstUpper(propertyName));
		result.setReturnType(cloneWithProxies(typeRef));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.get_toMany_Reference_OperationContent(
									sourceElement, propertyName, typeRef,
									setting));
				}
			}
		});
		return associate(sourceElement, result);
	}

	/**
	 * Returns a list parameterized with the type.
	 * 
	 * @param source
	 * @param type
	 * @return
	 */
	public JvmTypeReference toArrayListTypeReference(EObject source,
			JvmType type) {
		JvmTypeReference entityTypeReference = newTypeRef(source, fqnProvider
				.getFullyQualifiedName(type).toString(),
				(JvmTypeReference[]) null);
		return newTypeRef(source, ArrayList.class, entityTypeReference);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable LReference sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting) {
		return toSetter(sourceElement, name, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	/**
	 * Same as {@link #toSetter(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toSetter(@Nullable LReference sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (bounds.isToMany()) {
			throw new RuntimeException(
					"toMany-References not allowed for setters!");
		}

		result = toSetter(sourceElement, name, name, entityTypeReference,
				setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable final LReference sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final JvmTypeReference typeRef,
			final @Nullable LGenSettings setting) {
		if (sourceElement == null || propertyName == null || fieldName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("set" + Strings.toFirstUpper(propertyName));
		result.getParameters().add(
				toParameter(sourceElement, propertyName,
						cloneWithProxies(typeRef)));
		if (sourceElement instanceof LContainer) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Container_Documentantion(
							(LContainer) sourceElement, propertyName,
							fieldName, typeRef, setting).toString());
		} else if (sourceElement instanceof LContains) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Containment_Documentantion(
							(LContains) sourceElement, propertyName, fieldName,
							typeRef, setting).toString());
		} else if (sourceElement instanceof LReference) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Reference_Documentantion(
							(LReference) sourceElement, propertyName,
							fieldName, typeRef, setting).toString());
		}

		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					if (sourceElement instanceof LContainer) {
						p.append(
								operationsGenerator
										.set_toOne_Container_OperationContent(
												(LContainer) sourceElement,
												fieldName, propertyName,
												typeRef, setting)).toString();
					} else if (sourceElement instanceof LContains) {
						p.append(
								operationsGenerator
										.set_toOne_Containment_OperationContent(
												(LContains) sourceElement,
												fieldName, propertyName,
												typeRef, setting)).toString();
					} else if (sourceElement instanceof LReference) {
						p.append(
								operationsGenerator
										.set_toOne_Reference_OperationContent(
												(LReference) sourceElement,
												fieldName, propertyName,
												typeRef, setting)).toString();
					}
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toAdder(@Nullable LReference sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting) {
		return toAdder(sourceElement, propertyName, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	/**
	 * Same as {@link #toAdder(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toAdder(@Nullable LReference sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null || propertyName == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		result = toAdder(sourceElement,
				StringExtensions.toFirstLower(propertyName), propertyName,
				StringExtensions
						.toFirstLower(sourceElement.getType().getName()),
				entityTypeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toAdder(@Nullable final LReference sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final String localVarName,
			@Nullable final JvmTypeReference typeRef,
			@Nullable final LGenSettings setting) {
		if (sourceElement == null || propertyName == null || fieldName == null
				|| localVarName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("add" + Strings.toFirstUpper(propertyName));
		result.getParameters().add(
				toParameter(sourceElement, localVarName,
						cloneWithProxies(typeRef)));
		if (sourceElement instanceof LContains) {
			setDocumentation(
					result,
					operationsGenerator.add_toMany_Containmant_Documentantion(
							(LContains) sourceElement, localVarName, fieldName,
							typeRef, setting).toString());
		} else if (sourceElement instanceof LReference) {
			setDocumentation(
					result,
					operationsGenerator.add_toMany_Reference_Documentantion(
							(LReference) sourceElement, localVarName,
							fieldName, typeRef, setting).toString());
		}
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					if (sourceElement instanceof LContains) {
						p.append(
								operationsGenerator
										.add_toMany_Containmant_OperationContent(
												(LContains) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					} else if (sourceElement instanceof LReference) {
						p.append(
								operationsGenerator
										.add_toMany_Reference_OperationContent(
												(LReference) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					}
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toEnsureReferenceList(
			@Nullable LReference sourceElement, @Nullable String name) {
		return toEnsureReferenceList(sourceElement, name,
				(Procedure1<? super JvmOperation>) null);
	}

	/**
	 * Same as {@link #toAdder(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toEnsureReferenceList(
			@Nullable LReference sourceElement, @Nullable String name,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		result = toEnsureReferenceList(sourceElement,
				StringExtensions.toFirstLower(name), entityTypeReference);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toEnsureReferenceList(
			@Nullable final LReference sourceElement,
			@Nullable final String fieldName,
			@Nullable final JvmTypeReference typeRef) {
		if (sourceElement == null || fieldName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PRIVATE);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("ensure" + Strings.toFirstUpper(fieldName));

		setDocumentation(result, operationsGenerator
				.ensureReferenceDocumentantion(sourceElement).toString());
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.ensureReferenceOperationContent(sourceElement,
									fieldName));
				}
			}
		});
		return associate(sourceElement, result);
	}

	public JvmOperation toRemover(@Nullable LReference sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting) {
		return toRemover(sourceElement, propertyName, setting, null);
	}

	@Nullable
	public JvmOperation toRemover(@Nullable LReference sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		result = toRemover(sourceElement,
				StringExtensions.toFirstLower(propertyName), propertyName,
				StringExtensions
						.toFirstLower(sourceElement.getType().getName()),
				entityTypeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toRemover(@Nullable final EObject sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final String localVarName,
			@Nullable final JvmTypeReference typeRef,
			@Nullable final LGenSettings setting) {
		if (sourceElement == null || propertyName == null || fieldName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("remove" + Strings.toFirstUpper(propertyName));
		if (typeRef != null) {
			result.getParameters().add(
					toParameter(sourceElement, localVarName,
							cloneWithProxies(typeRef)));
		}
		if (sourceElement instanceof LContains) {
			setDocumentation(
					result,
					operationsGenerator
							.remove_toMany_Containmant_Documentantion(
									(LContains) sourceElement, localVarName,
									fieldName, typeRef, setting).toString());
		} else if (sourceElement instanceof LReference) {
			setDocumentation(
					result,
					operationsGenerator.remove_toMany_Reference_Documentantion(
							(LReference) sourceElement, localVarName,
							fieldName, typeRef, setting).toString());
		}
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					if (sourceElement instanceof LContains) {
						p.append(
								operationsGenerator
										.remove_toMany_Containmant_OperationContent(
												(LContains) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					} else if (sourceElement instanceof LReference) {
						p.append(
								operationsGenerator
										.remove_toMany_Reference_OperationContent(
												(LReference) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					}
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmField toPrimitiveTypeField(@Nullable EObject sourceElement,
			@Nullable String name, @Nullable Class<?> primitiveType) {
		return toPrimitiveTypeField(sourceElement, name, primitiveType, null);
	}

	@Nullable
	public JvmField toPrimitiveTypeField(@Nullable EObject sourceElement,
			@Nullable String name, @Nullable Class<?> primitiveType,
			@Nullable Procedure1<? super JvmField> initializer) {
		if (sourceElement == null || name == null)
			return null;

		JvmTypeReference typeRef = newTypeRef(sourceElement, primitiveType,
				(JvmTypeReference[]) null);
		JvmField result = typesFactory.createJvmField();
		result.setSimpleName(name);
		result.setVisibility(JvmVisibility.PRIVATE);
		result.setType(cloneWithProxies(typeRef));
		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}
}
