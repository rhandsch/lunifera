/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Hans Georg Glöckler - Initial implementation
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.valueconverter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel;
import org.lunifera.metamodel.dsl.entity.entitymodel.LPackage;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class EntityQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj == null) {
			return QualifiedName.create("");
		}

		if (obj instanceof LEntity) {
			LEntityModel model = (LEntityModel) obj.eContainer();
			if (model != null) {
				LPackage pkg = model.getPackage();
				final String qualifiedName = String.format("%s.%s",
						pkg.getName(), ((LEntity) obj).getName());
				if (qualifiedName == null)
					return null;
				return qualifiedNameConverter.toQualifiedName(qualifiedName);
			} else {
				return QualifiedName.create("");
			}
		}
		return super.getFullyQualifiedName(obj);
	}
}
