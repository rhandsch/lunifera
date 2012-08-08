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
package org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.metamodel.dsl.entity.entitymodel.LAnnotationDef;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel;
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LOperation;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference;
import org.lunifera.metamodel.dsl.entity.entitymodel.LRefers;
import org.lunifera.metamodel.dsl.entity.extensions.Constants;
import org.lunifera.metamodel.dsl.entity.extensions.EntityBounds;
import org.lunifera.metamodel.dsl.entity.extensions.ModelExtensions;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IAnnotationCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IOperationContentCompiler;

import com.google.inject.Inject;
import com.google.inject.name.Named;

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
	@Named(Constants.DELEGATE)
	private IOperationContentCompiler operationsGenerator;

	@Inject
	@Named(Constants.DELEGATE)
	private IAnnotationCompiler annotationCompiler;

	@Inject
	private ModelExtensions modelExtensions;

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
		if (!modelExtensions.isToMany(sourceElement)) {
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
	
	
	public JvmTypeReference toTypeReference(@Nullable LEmbedds sourceElement) {
		return toTypeReference(sourceElement, null);
	}

	/**
	 * Same as {@link #toTypeReference(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmTypeReference toTypeReference(@Nullable LEmbedds sourceElement,
			@Nullable Procedure1<? super JvmTypeReference> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmTypeReference ref = newTypeRef(sourceElement, fqnProvider
				.getFullyQualifiedName(sourceElement.getType()).toString(),
				(JvmTypeReference[]) null);

		return initializeSafely(ref, initializer);
	}
	
	public JvmTypeReference toTypeReference(@Nullable LProperty sourceElement) {
		return toTypeReference(sourceElement, null);
	}

	/**
	 * Same as {@link #toTypeReference(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmTypeReference toTypeReference(@Nullable LProperty sourceElement,
			@Nullable Procedure1<? super JvmTypeReference> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmTypeReference ref = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		if (!bounds.isToMany()) {
			ref = sourceElement.getType();
		} else {
			JvmTypeReference genericParam = sourceElement.getType();
			if (genericParam != null) {
				ref = newTypeRef(sourceElement, List.class, genericParam);
			}
		}

		return initializeSafely(ref, initializer);
	}


	@Nullable
	public JvmField toField(@Nullable LEntityMember sourceElement,
			@Nullable String name, @Nullable JvmTypeReference typeRef) {
		return toField(sourceElement, name, typeRef, null);
	}

	@Nullable
	public JvmField toField(@Nullable LEntityMember sourceElement,
			@Nullable String name, @Nullable JvmTypeReference typeRef,
			@Nullable Procedure1<? super JvmField> initializer) {
		if (sourceElement == null || name == null)
			return null;
		JvmField result = typesFactory.createJvmField();
		result.setSimpleName(name);
		result.setVisibility(JvmVisibility.PRIVATE);
		result.setType(cloneWithProxies(typeRef));
		associate(sourceElement, result);

		if (annotationCompiler != null) {
			LEntity lEntity = (LEntity) sourceElement.eContainer();
			LEntityModel lModel = (LEntityModel) lEntity.eContainer();
			annotationCompiler.processAnnotation(sourceElement, result,
					lModel.getGenSettings());
		}

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
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (entityTypeReference != null) {
			if (!modelExtensions.isToMany(sourceElement)) {
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

	@Nullable
	public JvmOperation toGetter(@Nullable LEmbedds sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting) {
		return toGetter(sourceElement, name, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	@Nullable
	public JvmOperation toGetter(@Nullable LEmbedds sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (entityTypeReference != null) {
			result = toGetter(sourceElement, name, entityTypeReference, setting);
			setDocumentation(
					result,
					operationsGenerator.get_toOne_Embedds_Documentantion(
							sourceElement, name, setting).toString());
			associate(sourceElement, result);
		}
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toGetter(@Nullable LProperty sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting) {
		return toGetter(sourceElement, name, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	@Nullable
	public JvmOperation toGetter(@Nullable LProperty sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		JvmTypeReference typeReference = sourceElement.getType();
		if (typeReference != null) {
			if (!bounds.isToMany()) {
				result = toGetter(sourceElement, name, typeReference, setting);
				setDocumentation(
						result,
						operationsGenerator.get_toOne_Property_Documentantion(
								sourceElement, name, setting).toString());
			} else {
				JvmTypeReference ref = newTypeRef(sourceElement, List.class,
						typeReference);
				result = toZeroToManyGetter(sourceElement, name, ref, setting);
				setDocumentation(
						result,
						operationsGenerator.get_toMany_Property_Documentantion(
								sourceElement, name, setting).toString());
			}
			associate(sourceElement, result);
		}
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toGetter(@Nullable final LEntityMember sourceElement,
			@Nullable final String propertyName,
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
										propertyName, setting));
					} else if (sourceElement instanceof LEmbedds) {
						p.append(operationsGenerator
								.get_toOne_Embedds_OperationContent(
										(LEmbedds) sourceElement, propertyName,
										setting));
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
		} else if (sourceElement instanceof LEmbedds) {
			setDocumentation(
					result,
					operationsGenerator.get_toOne_Embedds_Documentantion(
							(LEmbedds) sourceElement, propertyName, setting)
							.toString());
		}
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toIsDisposed(@Nullable final LEntity sourceElement) {
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setSimpleName("isDisposed");
		result.setReturnType(references.getTypeForName(Boolean.TYPE,
				sourceElement, (JvmTypeReference[]) null));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.isDisposed_OperationContent(sourceElement));
				}
			}
		});
		setDocumentation(result,
				operationsGenerator.isDisposed_Documentantion(sourceElement)
						.toString());
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toCheckDisposed(@Nullable final LEntity sourceElement) {
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
							.checkDisposed_OperationContent(sourceElement));
				}
			}
		});
		setDocumentation(result, operationsGenerator
				.checkDisposed_Documentantion(sourceElement).toString());
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
		setDocumentation(result,
				operationsGenerator.dispose_Documentantion(sourceElement)
						.toString());
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toMethod(@Nullable LOperation sourceElement, @Nullable String name, @Nullable JvmTypeReference returnType,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if(sourceElement == null || name == null) 
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setSimpleName(name);
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(cloneWithProxies(returnType));
		
		associate(sourceElement, result);
		
		if (annotationCompiler != null) {
			LEntity lEntity = (LEntity) sourceElement.eContainer();
			LEntityModel lModel = (LEntityModel) lEntity.eContainer();
			annotationCompiler.processAnnotation(sourceElement, result,
					lModel.getGenSettings());
		}
		
		return initializeSafely(result, initializer);
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

	@Nullable
	public JvmOperation toZeroToManyGetter(
			@Nullable final LProperty sourceElement,
			@Nullable final String fieldName,
			@Nullable final JvmTypeReference typeRef,
			@Nullable final LGenSettings setting) {
		if (sourceElement == null || fieldName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		String prefix = "get";
		if (typeRef != null && !typeRef.eIsProxy()
				&& !typeRef.getType().eIsProxy()
				&& "boolean".equals(typeRef.getType().getIdentifier())) {
			prefix = "is";
		}
		result.setSimpleName(prefix + Strings.toFirstUpper(fieldName));
		result.setReturnType(cloneWithProxies(typeRef));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.get_toMany_Property_OperationContent(
									sourceElement, fieldName, typeRef, setting));
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
	public JvmGenericType toEntityClass(@Nullable LEntity sourceElement,
			@Nullable QualifiedName name, @Nullable LGenSettings lSettings) {
		return toEntityClass(sourceElement, name != null ? name.toString()
				: null, lSettings, null);
	}

	@Nullable
	public JvmGenericType toEntityClass(@Nullable LEntity sourceElement,
			@Nullable String name, @Nullable LGenSettings lSettings) {
		return toEntityClass(sourceElement, name, lSettings, null);
	}

	@Nullable
	public JvmGenericType toEntityClass(@Nullable LEntity sourceElement,
			@Nullable QualifiedName name, @Nullable LGenSettings lSettings,
			@Nullable Procedure1<? super JvmGenericType> initializer) {
		return toEntityClass(sourceElement, name != null ? name.toString()
				: null, lSettings, initializer);
	}

	@Nullable
	public JvmGenericType toEntityClass(@Nullable LEntity sourceElement,
			@Nullable String name, @Nullable LGenSettings lSettings,
			@Nullable Procedure1<? super JvmGenericType> initializer) {
		final JvmGenericType result = createJvmGenericType(sourceElement, name);
		if (result == null)
			return null;
		associate(sourceElement, result);

		annotationCompiler.processAnnotation(sourceElement, result, lSettings);

		return initializeSafely(result, initializer);
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
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (modelExtensions.isToMany(sourceElement)) {
			throw new RuntimeException(
					"toMany-References not allowed for setters!");
		}

		result = toSetter(sourceElement, name, name,
				modelExtensions.toMethodParamName(sourceElement),
				entityTypeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable final LReference sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final String localVarName,
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
				toParameter(sourceElement, localVarName,
						cloneWithProxies(typeRef)));
		if (sourceElement instanceof LContainer) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Container_Documentantion(
							(LContainer) sourceElement, localVarName,
							fieldName, typeRef, setting).toString());
		} else if (sourceElement instanceof LContains) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Containment_Documentantion(
							(LContains) sourceElement, localVarName, fieldName,
							typeRef, setting).toString());
		} else if (sourceElement instanceof LRefers) {
			setDocumentation(
					result,
					operationsGenerator.set_toOne_Refers_Documentantion(
							(LRefers) sourceElement, localVarName, fieldName,
							typeRef, setting).toString());
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
												localVarName, fieldName,
												typeRef, setting)).toString();
					} else if (sourceElement instanceof LContains) {
						p.append(
								operationsGenerator
										.set_toOne_Containment_OperationContent(
												(LContains) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					} else if (sourceElement instanceof LRefers) {
						p.append(
								operationsGenerator
										.set_toOne_Refers_OperationContent(
												(LRefers) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					}
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable LEmbedds sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting) {
		return toSetter(sourceElement, name, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	/**
	 * Same as {@link #toSetter(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toSetter(@Nullable LEmbedds sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (modelExtensions.isToMany(sourceElement)) {
			throw new RuntimeException(
					"toMany-Embedds not allowed for setters!");
		}

		result = toSetter(sourceElement, name, name,
				modelExtensions.toMethodParamName(sourceElement),
				entityTypeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable final LEmbedds sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final String localVarName,
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
				toParameter(sourceElement, localVarName,
						cloneWithProxies(typeRef)));
		setDocumentation(
				result,
				operationsGenerator.set_toOne_Embedds_Documentantion(
						sourceElement, localVarName, fieldName, typeRef,
						setting).toString());

		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(
							operationsGenerator
									.set_toOne_Embedds_OperationContent(
											sourceElement, localVarName,
											fieldName, typeRef, setting))
							.toString();
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable LProperty sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting) {
		return toSetter(sourceElement, name, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	/**
	 * Same as {@link #toSetter(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toSetter(@Nullable LProperty sourceElement,
			@Nullable final String name, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		JvmTypeReference typeReference = sourceElement.getType();
		if (bounds.isToMany()) {
			throw new RuntimeException(
					"toMany-References not allowed for setters!");
		}

		result = toSetter(sourceElement, name, name,
				modelExtensions.toMethodParamName(sourceElement),
				typeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable final LProperty sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName,
			@Nullable final String localVarName,
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
				toParameter(sourceElement, localVarName,
						cloneWithProxies(typeRef)));
		setDocumentation(
				result,
				operationsGenerator.set_toOne_Property_Documentantion(
						sourceElement, localVarName, fieldName, typeRef,
						setting).toString());

		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(
							operationsGenerator
									.set_toOne_Property_OperationContent(
											sourceElement, localVarName,
											fieldName, typeRef, setting))
							.toString();
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
				modelExtensions.toMethodParamName(sourceElement),
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
		} else if (sourceElement instanceof LRefers) {
			setDocumentation(
					result,
					operationsGenerator.add_toMany_Refers_Documentantion(
							(LRefers) sourceElement, localVarName, fieldName,
							typeRef, setting).toString());
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
					} else if (sourceElement instanceof LRefers) {
						p.append(
								operationsGenerator
										.add_toMany_Refers_OperationContent(
												(LRefers) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					}
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toAdder(@Nullable LProperty sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting) {
		return toAdder(sourceElement, propertyName, setting,
				(Procedure1<? super JvmOperation>) null);
	}

	/**
	 * Same as {@link #toAdder(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toAdder(@Nullable LProperty sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null || propertyName == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference typeReference = sourceElement.getType();
		result = toAdder(sourceElement,
				StringExtensions.toFirstLower(propertyName), propertyName,
				modelExtensions.toMethodParamName(sourceElement),
				typeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toAdder(@Nullable final LProperty sourceElement,
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
		setDocumentation(
				result,
				operationsGenerator.add_toMany_Property_Documentantion(
						sourceElement, localVarName, fieldName, typeRef,
						setting).toString());
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(
							operationsGenerator
									.add_toMany_Property_OperationContent(
											sourceElement, localVarName,
											fieldName, typeRef, setting))
							.toString();
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

		setDocumentation(
				result,
				operationsGenerator
						.createLazy_toMany_ReferenceContainer_Documentantion(
								sourceElement).toString());
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.createLazy_toMany_ReferenceContainer_Content(
									sourceElement, fieldName));
				}
			}
		});
		return associate(sourceElement, result);
	}

	@Nullable
	public JvmOperation toEnsureReferenceList(
			@Nullable LProperty sourceElement, @Nullable String name) {
		return toEnsureReferenceList(sourceElement, name,
				(Procedure1<? super JvmOperation>) null);
	}

	@Nullable
	public JvmOperation toEnsureReferenceList(
			@Nullable LProperty sourceElement, @Nullable String name,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = sourceElement.getType();
		result = toEnsureReferenceList(sourceElement,
				StringExtensions.toFirstLower(name), entityTypeReference);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toEnsureReferenceList(
			@Nullable final LProperty sourceElement,
			@Nullable final String fieldName,
			@Nullable final JvmTypeReference typeRef) {
		if (sourceElement == null || fieldName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PRIVATE);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("ensure" + Strings.toFirstUpper(fieldName));

		setDocumentation(
				result,
				operationsGenerator
						.createLazy_toMany_PropertyContainer_Documentantion(
								sourceElement).toString());
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(operationsGenerator
							.createLazy_toMany_PropertyContainer_Content(
									sourceElement, fieldName));
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
				modelExtensions.toMethodParamName(sourceElement),
				entityTypeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toRemover(@Nullable final LReference sourceElement,
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
		} else if (sourceElement instanceof LRefers) {
			setDocumentation(
					result,
					operationsGenerator.remove_toMany_Refers_Documentantion(
							(LRefers) sourceElement, localVarName, fieldName,
							typeRef, setting).toString());
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
					} else if (sourceElement instanceof LRefers) {
						p.append(
								operationsGenerator
										.remove_toMany_Refers_OperationContent(
												(LRefers) sourceElement,
												localVarName, fieldName,
												typeRef, setting)).toString();
					}
				}
			}
		});
		return associate(sourceElement, result);
	}

	public JvmOperation toRemover(@Nullable LProperty sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting) {
		return toRemover(sourceElement, propertyName, setting, null);
	}

	@Nullable
	public JvmOperation toRemover(@Nullable LProperty sourceElement,
			@Nullable String propertyName, @Nullable LGenSettings setting,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference typeReference = sourceElement.getType();
		result = toRemover(sourceElement,
				StringExtensions.toFirstLower(propertyName), propertyName,
				modelExtensions.toMethodParamName(sourceElement),
				typeReference, setting);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toRemover(@Nullable final LProperty sourceElement,
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
		setDocumentation(
				result,
				operationsGenerator.remove_toMany_Property_Documentantion(
						sourceElement, localVarName, fieldName, typeRef,
						setting).toString());
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.append(
							operationsGenerator
									.remove_toMany_Property_OperationContent(
											sourceElement, localVarName,
											fieldName, typeRef, setting))
							.toString();
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

	public void translateAnnotationDefTo(@Nullable LAnnotationDef annotationDef,
			@Nullable JvmAnnotationTarget target) {
		if (annotationDef == null || target == null)
			return;
		JvmAnnotationReference annotationReference = getJvmAnnotationReference(annotationDef.getAnnotation());
		if (annotationReference != null)
			target.getAnnotations().add(annotationReference);
	}
}
