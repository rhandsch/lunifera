/*
* generated by Xtext
*/
package org.lunifera.metamodel.dsl.jpa;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class JpaUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.lunifera.metamodel.dsl.jpa.ui.internal.JpaActivator.getInstance().getInjector("org.lunifera.metamodel.dsl.jpa.Jpa");
	}
	
}
