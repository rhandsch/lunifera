/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.validation;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;
import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember;

import com.google.inject.Inject;

public class EntityJavaValidator extends AbstractEntityJavaValidator {

	@Inject
	IQualifiedNameProvider qnp;

	@Check
	public void checkLEmbeddsHasNoOppositeReferences(LEmbedds lEmbessd) {
		for (LEntityMember m : lEmbessd.getType().getEntityMembers()) {
			if (m instanceof LContains) {
				LContains c = (LContains) m;
				error(String.format(
						"Can not embedd an entity with a containment reference. Only simple references are allowed. "
								+ "\nPlease check the references of %s!",
						qnp.getFullyQualifiedName(c.getType())),
						EntitymodelPackage.Literals.LEMBEDDS__TYPE);
			} else if (m instanceof LContainer) {
				LContainer c = (LContainer) m;
				error(String.format(
						"Can not embedd an entity with a container reference. Please check the references of %s!",
						qnp.getFullyQualifiedName((LEntity) c.eContainer())),
						EntitymodelPackage.Literals.LEMBEDDS__TYPE);
			}
		}
	}

}
