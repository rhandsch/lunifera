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
/*
 * generated by Xtext
 */
package org.lunifera.metamodel.dsl.component.template.library;

import java.util.TimeZone;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.lunifera.metamodel.dsl.component.template.library.converter.ComponentLibraryBuilderDslValueConverterService;
import org.lunifera.metamodel.dsl.component.template.library.naming.ComponentTemplateLibraryDslQualifiedNameProvider;
import org.lunifera.metamodel.dsl.component.template.library.utils.ComponentTemplateLibraryDslModelUtility;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ComponentTemplateLibraryDslRuntimeModule extends org.lunifera.metamodel.dsl.component.template.library.AbstractComponentTemplateLibraryDslRuntimeModule {
	/**
	 * Bind the custom QualifiedNameProvider.
	 */
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {

		return ComponentTemplateLibraryDslQualifiedNameProvider.class;
	}

	/**
	 * Bind the helper class
	 * 
	 * @return
	 */
	@org.eclipse.xtext.service.SingletonBinding(eager = true)
	public Class<? extends ComponentTemplateLibraryDslModelUtility> bindComponentTemplateUtilitiesService() {
		return ComponentTemplateLibraryDslModelUtility.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return ComponentLibraryBuilderDslValueConverterService.class;
	}

	public void configureDateFormat(Binder binder) {

		binder.bind(String.class).annotatedWith(Names.named("dateFormat"))
				.toInstance("dd/MM/yyyy");
	}

	public void configureTimeZoneFormat(Binder binder) {
		
		binder.bind(String.class).annotatedWith(Names.named("timeZoneFormat"))
		.toInstance(TimeZone.getDefault().getID());
	}
}