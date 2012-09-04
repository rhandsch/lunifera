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

package org.lunifera.metamodel.dsl.component.template.library;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ComponentTemplateLibraryDslStandaloneSetup extends ComponentTemplateLibraryDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ComponentTemplateLibraryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

