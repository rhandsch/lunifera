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
package org.lunifera.metamodel.dsl.business.processes.tests.utils;

import org.lunifera.metamodel.dsl.business.processes.BpModelDslInjectorProvider;
import org.lunifera.metamodel.dsl.business.processes.BpModelDslStandaloneSetup;
import org.lunifera.metamodel.dsl.organization.en.OrganizationDslStandaloneSetup;

import com.google.inject.Injector;

public class CustomInjectorProvider extends BpModelDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {

		OrganizationDslStandaloneSetup.doSetup();
		BpModelDslStandaloneSetup.doSetup();

		return super.internalCreateInjector();
	}
}
