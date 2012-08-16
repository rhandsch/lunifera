/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext
 * 
 * Contributors:
 * 		Hans Georg Glöckler - Initial implementation
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity;

import org.eclipse.emf.ecore.EPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class EntityStandaloneSetup extends EntityStandaloneSetupGenerated {

	public static void doSetup() {
		new EntityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE
				.containsKey("http://www.lunifera.org/metamodel/dsl/entity/Entity")) {
			EPackage.Registry.INSTANCE.put(
					"http://www.lunifera.org/metamodel/dsl/entity/Entity",
					EntitymodelPackage.eINSTANCE);
		}

		super.register(injector);

	}
}
