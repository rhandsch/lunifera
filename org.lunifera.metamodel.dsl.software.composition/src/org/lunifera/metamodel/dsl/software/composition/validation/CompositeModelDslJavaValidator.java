/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.metamodel.dsl.software.composition.validation;

import javax.inject.Inject;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.AnalysisState;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.LinkType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.AbstractCompositionModelElementInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.CompositeModelDslPackage;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.ConstraintLinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;

public class CompositeModelDslJavaValidator extends
		AbstractCompositeModelDslJavaValidator {

	public final static String ERROR_LINK_NAME = "ERROR_LINK_NAME";
	public final static String ERROR_UNIT_NAME = "ERROR_UNIT_NAME";

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Check
	public void checkUnitInstance(UnitInstance elementInstance) {

		if (elementInstance.getSuperType() == null) {
			warning("A composite model element instance must have a superType defined.", elementInstance,
					CompositeModelDslPackage.Literals.ABSTRACT_COMPOSITION_MODEL_ELEMENT_INSTANCE__NAME,
					0);
		}
	}

	@Check
	public void checkElementInstance(
			AbstractCompositionModelElementInstance elementInstance) {

		QualifiedName fqn = qualifiedNameProvider
				.getFullyQualifiedName(elementInstance);

		if (!Character.isUpperCase(fqn.getLastSegment().charAt(0))) {
			error("Element name should start with a capital letter",
					CompositeModelDslPackage.Literals.ABSTRACT_COMPOSITION_MODEL_ELEMENT_INSTANCE__NAME);
		}
	}

	@Check
	public void checkLinkInstance(LinkInstance linkInstance) {
		// source and target units must be informed
		if (linkInstance.getLinkType() == null) {
			error("A link instance must have its superType defined.",
					CompositeModelDslPackage.Literals.LINK_INSTANCE, null, null);
		}

		if ((linkInstance.getLinkType().getAnalysisState() == AnalysisState.CONCRETE)
				&& (linkInstance.getSourceEndPoint() == null || linkInstance
						.getTargetEndPoint() == null)) {
			error("Link must have a source and target end points instances defined.",
					linkInstance,
					CompositeModelDslPackage.Literals.ABSTRACT_COMPOSITION_MODEL_ELEMENT_INSTANCE__NAME,
					null);
		} else {
			warning("The source or target end points was not defined.",
					linkInstance,
					CompositeModelDslPackage.Literals.ABSTRACT_COMPOSITION_MODEL_ELEMENT_INSTANCE__NAME,
					null);
		}

		// source and target units must be compatible
		ensureSourceTargeUnitsCompatibility(linkInstance.getLinkType(),
				linkInstance.getSourceEndPoint().getUnitInstance(),
				linkInstance.getTargetEndPoint().getUnitInstance());

		// check whether there exists links to and from the units

		// The requirements and capabilities of the units, the link type of
		// those requirements and capabilities, and the types of the
		// requirements and capabilities

		// The analysis state of the units

		// Any constraints in the topology
	}

	@Check
	public void checkConstraintLinkInstance(
			ConstraintLinkInstance ConstraintLinkInstance) {
		// source and target units must be informed
		if (ConstraintLinkInstance.getConstraintLinkType() == null) {
			error("A link instance must have its superType defined.",
					CompositeModelDslPackage.Literals.LINK_INSTANCE, null, null);
		}

		if (ConstraintLinkInstance.getSourceEndPoint() == null
				|| ConstraintLinkInstance.getTargetEndPoint() == null) {
			error("Link must have a source and target end points instances defined.",
					ConstraintLinkInstance, null, null);
		}

	}

	private void ensureSourceTargeCouldBeEqual(LinkType linkType,
			UnitType source, UnitType target) {

	}

	/**
	 * At least one requirement on the source unit has a corresponding
	 * capability on the target unit, and the corresponding requirement and
	 * capability meet the following criteria:
	 * 
	 * The requirement on the source unit has the link type set to either
	 * hosting or any. The capability on the target has the link type set to
	 * either hosting or any. The capability on the target unit is the same type
	 * or a subtype of the requirement on the source unit.
	 * 
	 * @param linkType
	 * @param unitInstance
	 * @param unitInstance2
	 */
	private void ensureSourceTargeUnitsCompatibility(LinkType linkType,
			UnitInstance unitInstance, UnitInstance unitInstance2) {
		// EList<UnitTypeRequiredCapability> reqCapabilities = source
		// .getRequiredCapabilities();
		// EList<UnitTypeProvidedCapability> provCapabilities = target
		// .getProvidedCapabilities();

	}

	/**
	 * The link does not violate any constraints in the topology:
	 * 
	 * The target unit satisfies any constraints on the source or target unit
	 * that affect hosting. Any constraints on the hosting link are satisfied.
	 * The link does not violate any constraint links. For example, the link
	 * does not cause two units that are connected by an anti-colocation
	 * constraint link to be hosted on the same unit or to be realized to the
	 * same unit.
	 */
	private void link() {

	}

	/**
	 * If the source unit is concrete, that unit is the source of only one
	 * hosting link, regardless of the number of hosting requirements on the
	 * unit. (Conceptual units can be the source of any number of hosting links,
	 * provided that the unit has at least one hosting requirement. A unit can
	 * be the target of any number of hosting links, provided that the unit has
	 * at least one hosting capability.)
	 */
	private void link2() {

	}

	/**
	 * The same unit is not both the source and the target of the same link.
	 * (Some other types of links can be created from a unit to itself, but not
	 * hosting links.)
	 */
	private void link3() {

	}

	/**
	 * The unit or units to which the source unit is realized could also be the
	 * source of a hosting link to the target unit. For example, if unit A has a
	 * realization link to unit B, you cannot create a hosting link from unit A
	 * to unit C unless a hosting link would be valid from unit B to unit C (if
	 * such a link were created). In short, for a unit to be hosted, the
	 * realization target or targets of that unit must also be able to be
	 * hosted.
	 */
	private void link4() {

	}


}
