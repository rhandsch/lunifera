/*
 * generated by Xtext
 */
package org.lunifera.metamodel.dsl.entity.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.lunifera.metamodel.dsl.entity.ui.internal.EntityActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntityExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EntityActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EntityActivator.getInstance().getInjector(EntityActivator.ORG_LUNIFERA_METAMODEL_DSL_ENTITY_ENTITY);
	}
	
}
