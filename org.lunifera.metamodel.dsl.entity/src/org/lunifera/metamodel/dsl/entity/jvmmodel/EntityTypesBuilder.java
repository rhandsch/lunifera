package org.lunifera.metamodel.dsl.entity.jvmmodel;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;
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
import org.lunifera.metamodel.dsl.entity.lentity.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.lentity.LReference;

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
	public JvmOperation toGetter(@Nullable LReference sourceElement) {
		return toGetter(sourceElement, null);
	}

	/**
	 * Same as {@link #toGetter(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toGetter(@Nullable LReference sourceElement,
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
				result = toGetter(sourceElement, sourceElement.getName(),
						entityTypeReference);
			} else {
				JvmTypeReference ref = newTypeRef(sourceElement, List.class,
						entityTypeReference);
				result = toGetter(sourceElement, sourceElement.getName(), ref);
			}
			associate(sourceElement, result);
		}
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toSetter(@Nullable LReference sourceElement) {
		return toSetter(sourceElement, null);
	}

	/**
	 * Same as {@link #toSetter(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toSetter(@Nullable LReference sourceElement,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		EntityBounds bounds = getBounds(sourceElement.getMultiplicity());
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		if (!bounds.isToMany()) {
			result = toSetter(sourceElement, sourceElement.getName(),
					entityTypeReference);
		} else {
			JvmTypeReference ref = newTypeRef(sourceElement, List.class,
					entityTypeReference);
			result = toSetter(sourceElement, sourceElement.getName(), ref);
		}

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toAdder(@Nullable LReference sourceElement) {
		return toAdder(sourceElement, null);
	}

	/**
	 * Same as {@link #toAdder(EObject, String, LReference)} but with an
	 * initializer passed as the last argument.
	 */
	@Nullable
	public JvmOperation toAdder(@Nullable LReference sourceElement,
			@Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null) {
			return null;
		}

		JvmOperation result = null;
		JvmTypeReference entityTypeReference = newTypeRef(sourceElement,
				fqnProvider.getFullyQualifiedName(sourceElement.getType())
						.toString(), (JvmTypeReference[]) null);
		result = toAdder(sourceElement,
				StringExtensions
						.toFirstLower(sourceElement.getType().getName()),
				sourceElement.getName(), entityTypeReference);

		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}

	@Nullable
	public JvmOperation toAdder(@Nullable final EObject sourceElement,
			@Nullable final String propertyName,
			@Nullable final String fieldName, @Nullable JvmTypeReference typeRef) {
		if (sourceElement == null || propertyName == null || fieldName == null)
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references
				.getTypeForName(Void.TYPE, sourceElement));
		result.setSimpleName("add" + Strings.toFirstUpper(propertyName));
		result.getParameters().add(
				toParameter(sourceElement, propertyName,
						cloneWithProxies(typeRef)));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if (p != null) {
					p = p.trace(sourceElement);
					p.increaseIndentation().increaseIndentation();
					p.append(String.format("if(%s==null){", propertyName))
							.newLine();
					p.decreaseIndentation().decreaseIndentation();
					p.append("return;").newLine();
					p.append("}").newLine();
					p.newLine();
					p.increaseIndentation().increaseIndentation();
					p.append(
							String.format("if(!this.%s.contains(%s)){",
									fieldName, propertyName)).newLine();
					p.decreaseIndentation().decreaseIndentation();
					p.append(
							String.format("this.%s.add(%s);", fieldName,
									propertyName)).newLine();
					p.append("}");
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
