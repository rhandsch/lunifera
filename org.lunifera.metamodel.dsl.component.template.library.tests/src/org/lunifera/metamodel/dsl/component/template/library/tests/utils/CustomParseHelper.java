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
package org.lunifera.metamodel.dsl.component.template.library.tests.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;

// TODO must be removed as soon as ParseHelper official got updated. 

public class CustomParseHelper<T extends EObject> extends ParseHelper<T> {

	@Inject
	private IResourceFactory resourceFactory;
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@SuppressWarnings("unchecked")
	public T parse(InputStream in, URI uriToUse, Map<?, ?> options,
			ResourceSet resourceSet) {
		Resource resource = resourceFactory.createResource(uriToUse);
		resourceSet.getResources().add(resource);
		try {
			resource.load(in, options);
			final T root = (T) (resource.getContents().isEmpty() ? null
					: resource.getContents().get(0));
			return root;
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
	
	public List<Diagnostic> parseToError(InputStream in, URI uriToUse, Map<?, ?> options, ResourceSet resourceSet) {
		Resource resource = resourceFactory.createResource(uriToUse);
		resourceSet.getResources().add(resource);
		try {
			resource.load(in, options);
			if (resource.getErrors().size() > 0) {
				return resource.getErrors();
			}
			throw new IllegalStateException();
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
	
	public List<Diagnostic> parseToError(CharSequence text) throws Exception {
		return parseToError(text, resourceSetProvider.get());
	}

	public List<Diagnostic> parseToError(CharSequence text, ResourceSet resourceSetToUse) throws Exception {
		return parseToError(getAsStream(text), computeUnusedUri(resourceSetToUse), null, resourceSetToUse);
	}

	public List<Diagnostic> parseToError(CharSequence text, URI uriToUse, ResourceSet resourceSetToUse) throws Exception {
		return parseToError(getAsStream(text), uriToUse, null, resourceSetToUse);
	}
}
