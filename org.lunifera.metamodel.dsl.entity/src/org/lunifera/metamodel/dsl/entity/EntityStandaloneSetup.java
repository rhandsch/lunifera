
package org.lunifera.metamodel.dsl.entity;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EntityStandaloneSetup extends EntityStandaloneSetupGenerated{

	public static void doSetup() {
		new EntityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

