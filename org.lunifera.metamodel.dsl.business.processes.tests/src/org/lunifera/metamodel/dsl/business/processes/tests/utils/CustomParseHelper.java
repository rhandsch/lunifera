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

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.xtext.junit4.util.ParseHelper;

// TODO must be removed as soon as ParseHelper official got updated. 

public class CustomParseHelper<T extends EObject> extends ParseHelper<T> {

	@SuppressWarnings("unchecked")
	public T parse(InputStream in, URI uriToUse, Map<?, ?> options,
			ResourceSet resourceSet) {
		Resource resource = resourceSet.createResource(uriToUse);
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

}
