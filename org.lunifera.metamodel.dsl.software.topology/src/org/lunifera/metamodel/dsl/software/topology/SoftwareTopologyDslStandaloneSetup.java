
package org.lunifera.metamodel.dsl.software.topology;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SoftwareTopologyDslStandaloneSetup extends SoftwareTopologyDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SoftwareTopologyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

