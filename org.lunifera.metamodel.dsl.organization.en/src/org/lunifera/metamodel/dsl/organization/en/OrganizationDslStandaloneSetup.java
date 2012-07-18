
package org.lunifera.metamodel.dsl.organization.en;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OrganizationDslStandaloneSetup extends OrganizationDslStandaloneSetupGenerated{

	public static void doSetup() {
		new OrganizationDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

