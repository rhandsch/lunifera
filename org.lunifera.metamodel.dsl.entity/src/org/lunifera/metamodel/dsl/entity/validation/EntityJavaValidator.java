/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;
import org.lunifera.metamodel.dsl.entity.extensions.EntityBounds;
import org.lunifera.metamodel.dsl.entity.extensions.ModelExtensions;
import org.lunifera.metamodel.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.entity.entitymodel.LContainer;
import org.lunifera.metamodel.entity.entitymodel.LContains;
import org.lunifera.metamodel.entity.entitymodel.LEmbedds;
import org.lunifera.metamodel.entity.entitymodel.LEntity;
import org.lunifera.metamodel.entity.entitymodel.LEntityMember;
import org.lunifera.metamodel.entity.entitymodel.LProperty;
import org.lunifera.metamodel.entity.entitymodel.LReference;
import org.lunifera.metamodel.entity.entitymodel.LRefers;

import com.google.inject.Inject;

public class EntityJavaValidator extends AbstractEntityJavaValidator {

	private static final Set<String> javakeywords = new HashSet<String>();
	static {
		javakeywords.add("abstract");
		javakeywords.add("assert");
		javakeywords.add("boolean");
		javakeywords.add("break");
		javakeywords.add("byte");
		javakeywords.add("case");
		javakeywords.add("catch");
		javakeywords.add("char");
		javakeywords.add("class");
		javakeywords.add("const");
		javakeywords.add("continue");
		javakeywords.add("default");
		javakeywords.add("double");
		javakeywords.add("do");
		javakeywords.add("else");
		javakeywords.add("enum");
		javakeywords.add("extends");
		javakeywords.add("false");
		javakeywords.add("final");
		javakeywords.add("finally");
		javakeywords.add("float");
		javakeywords.add("for");
		javakeywords.add("goto");
		javakeywords.add("if");
		javakeywords.add("implements");
		javakeywords.add("import");
		javakeywords.add("instanceof");
		javakeywords.add("int");
		javakeywords.add("interface");
		javakeywords.add("native");
		javakeywords.add("new");
		javakeywords.add("null");
		javakeywords.add("package");
		javakeywords.add("private");
		javakeywords.add("protected");
		javakeywords.add("public");
		javakeywords.add("return");
		javakeywords.add("short");
		javakeywords.add("static");
		javakeywords.add("strictfp");
		javakeywords.add("super");
		javakeywords.add("switch");
		javakeywords.add("synchronized");
		javakeywords.add("this");
		javakeywords.add("throw");
		javakeywords.add("throws");
		javakeywords.add("transient");
		javakeywords.add("true");
		javakeywords.add("try");
		javakeywords.add("void");
		javakeywords.add("volatile");
		javakeywords.add("while");
	}

	@Inject
	IQualifiedNameProvider qnp;
	@Inject
	ModelExtensions extensions;

	@Check
	public void checkLEmbeddsHasNoOppositeReferences(LEmbedds lEmbedds) {
		for (LEntityMember m : lEmbedds.getType().getEntityMembers()) {
			if (m instanceof LContains) {
				LContains c = (LContains) m;
				error(String.format(
						"Can not embedd an entity with a containment reference. Only simple references are allowed. "
								+ "\nPlease check the references of %s!",
						qnp.getFullyQualifiedName(c.getType())),
						EntitymodelPackage.Literals.LEMBEDDS__TYPE);
			} else if (m instanceof LContainer) {
				LContainer c = (LContainer) m;
				error(String.format(
						"Can not embedd an entity with a container reference. Please check the references of %s!",
						qnp.getFullyQualifiedName((LEntity) c.eContainer())),
						EntitymodelPackage.Literals.LEMBEDDS__TYPE);
			}
		}
	}

	@Check
	public void checkJPA_ContainsHasOppositeReference(LContains contains) {
		if (contains.getOpposite() == null) {
			warning("A containment reference should have an opposite reference too. Otherwise the 'mappedBy-attribute' can not be applied to the JPA annotation.",
					EntitymodelPackage.Literals.LCONTAINS__OPPOSITE);
		}
	}

	@Check
	public void checkJPA_ContainsHasOppositeReference(LContainer container) {
		if (container.getOpposite() == null) {
			warning("A container reference should have an opposite reference too. Otherwise the annotation type (ManyToOne or OneToOne) can not be determined!",
					EntitymodelPackage.Literals.LCONTAINER__OPPOSITE);
		}
	}

	@Check
	public void checkJPA_NotNull_LRefernce_OneToMany_NotNull_NotAllowed(
			LReference lReference) {

		if (lReference instanceof LRefers) {
			LRefers lRefers = (LRefers) lReference;
			if (lRefers.isNotnull()) {
				EntityBounds bounds = EntityBounds.createFor(lRefers
						.getMultiplicity());
				if (bounds.isToMany()) {
					error("Modifier 'notnull' is not allowed for references with upper bound GREATER ONE",
							EntitymodelPackage.Literals.LREFERS__NOTNULL);
				}
			}
		} else if (lReference instanceof LContains) {
			LContains lContains = (LContains) lReference;
			if (lContains.isNotnull()) {
				EntityBounds bounds = EntityBounds.createFor(lContains
						.getMultiplicity());
				if (bounds.isToMany()) {
					error("Modifier 'notnull' is not allowed for containment references with upper bound GREATER ONE",
							EntitymodelPackage.Literals.LCONTAINS__NOTNULL);
				}
			}
		}
	}

	@Check
	public void checkJPA_ID_LEntityHasOnlyOneId(LEntity lEntity) {
		int idCount = 0;
		int memberIndex = -1;
		int firstIdIndex = -1;
		for (LEntityMember m : lEntity.getEntityMembers()) {
			memberIndex++;
			if (m instanceof LProperty) {
				LProperty p = (LProperty) m;
				if (p.isId()) {
					idCount++;
					if (firstIdIndex == -1) {
						firstIdIndex = memberIndex;
					}
				}
			}
		}

		boolean embeddable = lEntity.isEmbeddable();
		if (!embeddable) {
			if (idCount == 0) {
				if (lEntity.getSuperType() == null) {
					// only check jpa model
					if (extensions.compilesToJPAModel(lEntity)) {
						warning("An entity should have an ID property",
								EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS);
					}
				}
			} else if (idCount > 1) {
				error("An entity must only have one ID property",
						EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS,
						memberIndex);
			}
		} else {
			if (idCount > 0) {
				// Not used yet! Seems to be problematic
				// warning("An embeddable entity should not have an ID property",
				// EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS,
				// firstIdIndex);
			}
		}

	}

	@Check
	public void checkJPA_ID_SpecifiedBySuperclass(LEntity lEntity) {
		// only check jpa model
		if (!extensions.compilesToJPAModel(lEntity)) {
			return;
		}

		LEntity superType = lEntity.getSuperType();
		if (superType == null) {
			return;
		}

		boolean idFoundForSuperType = doesSupertypeContainIdProperty(lEntity);

		// lookup if an id property exists in the entity
		int memberIndex = -1;
		boolean idFound = false;
		for (LEntityMember m : lEntity.getEntityMembers()) {
			memberIndex++;
			if (m instanceof LProperty) {
				LProperty p = (LProperty) m;
				if (p.isId()) {
					idFound = true;
					break;
				}
			}
		}

		if (idFoundForSuperType && !idFound) {
			// nothing to do!
		}

		if (idFoundForSuperType && idFound) {
			warning("A id property was already defined by the super type. You should remove it here.",
					EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS,
					memberIndex);
		}

		if (!idFoundForSuperType && !idFound) {
			warning("Nor the entity or one of its super types define an id property. Check the type hierarchy.",
					EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS);
		}
	}

	/**
	 * Returns true, if any of the supertypes contains an id property.
	 * 
	 * @param superType
	 * @return
	 */
	private boolean doesSupertypeContainIdProperty(LEntity type) {
		LEntity superType = type.getSuperType();
		if (superType == null) {
			return false;
		}
		boolean idFoundForSuperType = false;
		for (LEntityMember m : superType.getEntityMembers()) {
			if (m instanceof LProperty) {
				LProperty p = (LProperty) m;
				if (p.isId()) {
					idFoundForSuperType = true;
					break;
				}
			}
		}

		if (!idFoundForSuperType) {
			idFoundForSuperType = doesSupertypeContainIdProperty(superType);
		}

		return idFoundForSuperType;
	}

	/**
	 * Returns true, if any of the supertypes contains an id property.
	 * 
	 * @param superType
	 * @return
	 */
	private boolean doesSupertypeContainVersionProperty(LEntity type) {
		LEntity superType = type.getSuperType();
		if (superType == null) {
			return false;
		}
		boolean versionFoundForSuperType = false;
		for (LEntityMember m : superType.getEntityMembers()) {
			if (m instanceof LProperty) {
				LProperty p = (LProperty) m;
				if (p.isVersion()) {
					versionFoundForSuperType = true;
					break;
				}
			}
		}

		if (!versionFoundForSuperType) {
			versionFoundForSuperType = doesSupertypeContainVersionProperty(superType);
		}

		return versionFoundForSuperType;
	}

	@Check
	public void checkJPA_Version_SpecifiedBySuperclass(LEntity lEntity) {
		if (lEntity.getSuperType() == null) {
			return;
		}

		boolean versionContainedInSuperType = doesSupertypeContainVersionProperty(lEntity);

		int memberIndex = -1;
		boolean versionFound = false;
		for (LEntityMember m : lEntity.getEntityMembers()) {
			memberIndex++;
			if (m instanceof LProperty) {
				LProperty p = (LProperty) m;
				if (p.isVersion()) {
					versionFound = true;
					break;
				}
			}
		}

		if (versionContainedInSuperType && versionFound) {
			warning("A version property was already defined in one of the super types.",
					EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS,
					memberIndex);
		}
	}

	@Check
	public void checkJPA_Version_LEntityHasOnlyOneVersion(LEntity lEntity) {
		int versionCount = 0;
		int memberIndex = -1;
		for (LEntityMember m : lEntity.getEntityMembers()) {
			memberIndex++;
			if (m instanceof LProperty) {
				LProperty p = (LProperty) m;
				if (p.isVersion()) {
					versionCount++;
				}
			}
		}

		if (versionCount > 1) {
			error("An entity must only have one version property",
					EntitymodelPackage.Literals.LENTITY__ENTITY_MEMBERS,
					memberIndex);
		}
	}

	@Check
	public void checkEmbedd_TypeMustBeEmbeddable(LEmbedds lEmbedds) {
		if (lEmbedds.getType() != null && !lEmbedds.getType().isEmbeddable()) {
			warning("Only embeddable entities should be embedded!",
					EntitymodelPackage.Literals.LEMBEDDS__TYPE);
		}
	}

	@Check
	public void checkSingluarName(LContains lContains) {
		if (lContains == null) {
			return;
		}

		if (!EntityBounds.createFor(
				extensions.getMulitiplicitySetting(lContains)).isToMany()) {
			if (isStringValid(lContains.getSingularName())) {
				error("Singluar reference names can only be specified for multiplicities with upper bound > 1!",
						EntitymodelPackage.Literals.LCONTAINS__SINGULAR_NAME);
			}
		} else {
			if (isStringValid(lContains.getSingularName())) {
				String name = extensions
						.toGeneratorDefaultMethodParamName(lContains);
				if (lContains.getSingularName().equals(name)) {
					warning("The singluar name equals the generator default. Maybe not required.",
							EntitymodelPackage.Literals.LCONTAINS__SINGULAR_NAME);
				}
			}
		}
	}

	@Check
	public void checkSingluarName(LRefers lRefers) {
		if (lRefers == null) {
			return;
		}

		if (!EntityBounds
				.createFor(extensions.getMulitiplicitySetting(lRefers))
				.isToMany()) {
			if (isStringValid(lRefers.getSingularName())) {
				error("Singluar reference names can only be specified for multiplicities with upper bound > 1!",
						EntitymodelPackage.Literals.LREFERS__SINGULAR_NAME);
			}
		} else {
			if (isStringValid(lRefers.getSingularName())) {
				String name = extensions
						.toGeneratorDefaultMethodParamName(lRefers);
				if (lRefers.getSingularName().equals(name)) {
					warning("The singluar name equals the generator default. Maybe not required.",
							EntitymodelPackage.Literals.LREFERS__SINGULAR_NAME);
				}
			}
		}
	}

	@Check
	public void checkSingluarName(LProperty lProperty) {
		if (lProperty == null) {
			return;
		}

		if (!EntityBounds.createFor(
				extensions.getMulitiplicitySetting(lProperty)).isToMany()) {
			if (isStringValid(lProperty.getSingularName())) {
				error("Singluar property names can only be specified for multiplicities with upper bound > 1!",
						EntitymodelPackage.Literals.LPROPERTY__SINGULAR_NAME);
			}
		} else {
			if (isStringValid(lProperty.getSingularName())) {
				String name = extensions
						.toGeneratorDefaultMethodParamName(lProperty);
				if (lProperty.getSingularName().equals(name)) {
					warning("The singluar name equals the generator default. Maybe not required.",
							EntitymodelPackage.Literals.LPROPERTY__SINGULAR_NAME);
				}
			}
		}
	}

	private boolean isStringValid(String value) {
		return value != null && !value.equals("");
	}

	@Check
	public void checkProperties_JavaKeyWord(LProperty lprop) {
		if (javakeywords.contains(lprop.getName())) {
			error("The name of the property is an java keyword and not allowed!",
					EntitymodelPackage.Literals.LPROPERTY__NAME);
		}
	}

	@Check
	public void checkReferences_JavaKeyWord(LReference lref) {
		if (javakeywords.contains(lref.getName())) {
			error("The name of the reference is an java keyword and not allowed!",
					EntitymodelPackage.Literals.LREFERENCE__NAME);
		}
	}

	@Check
	public void checkEmbedds_JavaKeyWord(LEmbedds lembedds) {
		if (javakeywords.contains(lembedds.getName())) {
			error("The name of the embedds is an java keyword and not allowed!",
					EntitymodelPackage.Literals.LEMBEDDS__NAME);
		}
	}
}
