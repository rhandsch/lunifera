/*
 * generated by Xtext
 */
package org.lunifera.metamodel.dsl.entity.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntityExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.lunifera.metamodel.dsl.entity.ui.internal.EntityActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.lunifera.metamodel.dsl.entity.ui.internal.EntityActivator.getInstance().getInjector("org.lunifera.metamodel.dsl.entity.Entity");
	}
	
}
