/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.metamodel.dsl.software.composition.tests.utils;

import org.lunifera.metamodel.dsl.component.template.library.ComponentTemplateLibraryDslStandaloneSetup;
import org.lunifera.metamodel.dsl.organization.en.OrganizationDslStandaloneSetup;
import org.lunifera.metamodel.dsl.software.composition.CompositeModelDslInjectorProvider;
import org.lunifera.metamodel.dsl.software.composition.CompositeModelDslStandaloneSetup;

import com.google.inject.Injector;

public class CustomInjectorProvider extends
		CompositeModelDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		OrganizationDslStandaloneSetup.doSetup();
		CompositeModelDslStandaloneSetup.doSetup();
		ComponentTemplateLibraryDslStandaloneSetup.doSetup();
		return super.internalCreateInjector();
	}
}
