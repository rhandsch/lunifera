package org.lunifera.metamodel.dsl.software.topology.validation;

import org.eclipse.xtext.validation.Check;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.LinkType;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.software.topology.softwareTopologyDsl.LinkInstance;
import org.lunifera.metamodel.dsl.software.topology.softwareTopologyDsl.SoftwareTopologyDslPackage;
import org.lunifera.metamodel.dsl.software.topology.softwareTopologyDsl.UnitInstance;

public class SoftwareTopologyDslJavaValidator extends
		AbstractSoftwareTopologyDslJavaValidator {

	public final static String ERROR_LINK_NAME = "ERROR_LINK_NAME";
	public final static String ERROR_UNIT_NAME = "ERROR_UNIT_NAME";

	@Check
	public void checkUnitInstance(UnitInstance unitInstance) {
		if (!Character.isUpperCase(unitInstance.getName().charAt(0))) {
			error("Unit name should start with a capital letter",
					SoftwareTopologyDslPackage.Literals.UNIT_INSTANCE__NAME,
					ERROR_UNIT_NAME);
		}

	}

	@Check
	public void checkLinkInstance(LinkInstance linkInstance) {
		if (!Character.isUpperCase(linkInstance.getName().charAt(0))) {
			error("Link name should start with a capital letter",
					SoftwareTopologyDslPackage.Literals.LINK_INSTANCE__NAME,
					ERROR_LINK_NAME);
		}

		// source and target units must be compatible
		ensureSourceTargeUnitsCompatibility(linkInstance.getSuperType(),
				linkInstance.getSourceUnit().getSuperType(), linkInstance
						.getTargetUnit().getSuperType());

		// check whether there exists links to and from the units

		// The requirements and capabilities of the units, the link type of those requirements and capabilities, and the types of the requirements and capabilities
		
		// The analysis state of the units
		
		// Any constraints in the topology
	}

	private void ensureSourceTargeUnitsCompatibility(LinkType linkType,
			UnitType source, UnitType target) {

	}


}
