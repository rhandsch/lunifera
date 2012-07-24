
package org.lunifera.metamodel.dsl.software.library;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SoftwareLibraryDslStandaloneSetup extends SoftwareLibraryDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SoftwareLibraryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

