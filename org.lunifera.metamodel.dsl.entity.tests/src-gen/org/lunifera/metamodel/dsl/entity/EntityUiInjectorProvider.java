/*
* generated by Xtext
*/
package org.lunifera.metamodel.dsl.entity;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EntityUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.lunifera.metamodel.dsl.entity.ui.internal.EntityActivator.getInstance().getInjector("org.lunifera.metamodel.dsl.entity.Entity");
	}
	
}
