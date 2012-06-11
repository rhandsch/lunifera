
package org.lunifera.metamodel.dsl.jpa;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JpaStandaloneSetup extends JpaStandaloneSetupGenerated{

	public static void doSetup() {
		new JpaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

