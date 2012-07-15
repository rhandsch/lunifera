/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources partially based on org.eclipse.emf.ecore.xcore.scoping.XcoreScopeProvider
 * 
 * Contributors:
 * 		Hans Georg Glöckler - Initial implementation
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.scope;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember;

import com.google.inject.Inject;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
@SuppressWarnings("restriction")
public class EntityScopeProvider extends XbaseScopeProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public IScope getScope(final EObject context, EReference reference) {
		if (reference == EntitymodelPackage.Literals.LCONTAINS__OPPOSITE) {
			return new AbstractScope(IScope.NULLSCOPE, false) {
				@Override
				// springt zu EntityProposalProvider
				protected Iterable<IEObjectDescription> getAllLocalElements() {
					ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
					if (context instanceof LContains) {
						LContains reference = (LContains) context;
						LEntity type = reference.getType();
						if (type != null) {
							for (LEntityMember opposite : type
									.getEntityMembers()) {
								if (opposite instanceof LContainer) {
									String name = opposite.getName();
									if (name != null) {
										result.add(new EObjectDescription(
												qualifiedNameConverter
														.toQualifiedName(name),
												opposite, null));
									}
								}
							}
						}
					}
					return result;
				}
			};
		} else if (reference == EntitymodelPackage.Literals.LCONTAINER__OPPOSITE) {
			return new AbstractScope(IScope.NULLSCOPE, false) {
				@Override
				protected Iterable<IEObjectDescription> getAllLocalElements() {
					ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
					if (context instanceof LContainer) {
						LContainer reference = (LContainer) context;
						LEntity type = reference.getType();
						if (type != null) {
							for (LEntityMember opposite : type
									.getEntityMembers()) {
								if (opposite instanceof LContains) {
									String name = opposite.getName();
									if (name != null) {
										result.add(new EObjectDescription(
												qualifiedNameConverter
														.toQualifiedName(name),
												opposite, null));
									}
								}
							}
						}
					}
					return result;
				}
			};
		} else {
			return super.getScope(context, reference);
		}
	}

}
