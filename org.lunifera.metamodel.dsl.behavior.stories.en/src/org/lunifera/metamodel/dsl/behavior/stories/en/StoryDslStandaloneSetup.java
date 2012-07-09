
package org.lunifera.metamodel.dsl.behavior.stories.en;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StoryDslStandaloneSetup extends StoryDslStandaloneSetupGenerated{

	public static void doSetup() {
		new StoryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

