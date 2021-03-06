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

import org.eclipse.xtext.scoping.IScopeProvider;
import org.lunifera.metamodel.dsl.entity.extensions.Constants;
import org.lunifera.metamodel.dsl.entity.jvmmodel.DelegatingAnnotationCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.DelegatingOperationContentCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.EntityJvmModelGenerator;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IAnnotationCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IEntityJvmModelInferrerDelegate;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IOperationContentCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity.PojoAnnotationCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity.PojoJvmModelInferrerDelegate;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity.PojoOperationsGenerator;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.jpa.JPAAnnotationCompiler;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.jpa.JPAJvmModelInferrerDelegate;
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.jpa.JPAOperationsGenerator;
import org.lunifera.metamodel.dsl.entity.scope.EntityImportedNamespaceAwareLocalScopeProvider;
import org.lunifera.metamodel.dsl.entity.scope.EntityScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class EntityRuntimeModule extends
		org.lunifera.metamodel.dsl.entity.AbstractEntityRuntimeModule {

	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.lunifera.metamodel.dsl.entity.valueconverter.EntityQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return EntityScopeProvider.class;
	}

	@Override
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate"))
				.to(EntityImportedNamespaceAwareLocalScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return EntityJvmModelGenerator.class;
	}

	/**
	 * The modelInferrer delegate to be used for entity compiles.
	 * 
	 * @param binder
	 */
	public void configurePojoJvmModelInferrerDelegate(
			com.google.inject.Binder binder) {
		binder.bind(IEntityJvmModelInferrerDelegate.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(Constants.POJO_COMPILER_FQN))
				.to(PojoJvmModelInferrerDelegate.class);
	}

	/**
	 * The modelInferrer delegate to be used for JPA compiles.
	 * 
	 * @param binder
	 */
	public void configureJPAJvmModelInferrerDelegate(
			com.google.inject.Binder binder) {
		binder.bind(IEntityJvmModelInferrerDelegate.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(Constants.JPA_COMPILER_FQN))
				.to(JPAJvmModelInferrerDelegate.class);
	}

	/**
	 * The operationsContentCompiler to be used to dispatch the calles.
	 * 
	 * @param binder
	 */
	public void configureDelegateOperationsCompiler(
			com.google.inject.Binder binder) {
		binder.bind(IOperationContentCompiler.class)
				.annotatedWith(
						com.google.inject.name.Names.named(Constants.DELEGATE))
				.to(DelegatingOperationContentCompiler.class);
	}

	/**
	 * The operationsContentCompiler to be used for entity compiles.
	 * 
	 * @param binder
	 */
	public void configurePojoOperationsCompiler(
			com.google.inject.Binder binder) {
		binder.bind(IOperationContentCompiler.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(Constants.POJO_COMPILER_FQN))
				.to(PojoOperationsGenerator.class);
	}

	/**
	 * The operationsContentCompiler to be used for JPA compiles.
	 * 
	 * @param binder
	 */
	public void configureJPAOperationsCompiler(com.google.inject.Binder binder) {
		binder.bind(IOperationContentCompiler.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(Constants.JPA_COMPILER_FQN))
				.to(JPAOperationsGenerator.class);
	}

	/**
	 * The annotationCompiler to be used to dispatch the calles.
	 * 
	 * @param binder
	 */
	public void configureDelegateAnnotationCompiler(
			com.google.inject.Binder binder) {
		binder.bind(IAnnotationCompiler.class)
				.annotatedWith(
						com.google.inject.name.Names.named(Constants.DELEGATE))
				.to(DelegatingAnnotationCompiler.class);
	}

	/**
	 * The annotationCompiler to be used for pojo compiles.
	 * 
	 * @param binder
	 */
	public void configurePojoAnnotationCompiler(
			com.google.inject.Binder binder) {
		binder.bind(IAnnotationCompiler.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(Constants.POJO_COMPILER_FQN))
				.to(PojoAnnotationCompiler.class);
	}

	/**
	 * The annotationCompiler to be used for jpa compiles.
	 * 
	 * @param binder
	 */
	public void configureJPAAnnotationCompiler(com.google.inject.Binder binder) {
		binder.bind(IAnnotationCompiler.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(Constants.JPA_COMPILER_FQN))
				.to(JPAAnnotationCompiler.class);
	}

}
