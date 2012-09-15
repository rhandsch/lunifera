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
package org.lunifera.metamodel.dsl.organization.en.naming;

import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.OrganizationDslPackage;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.OrganizationUnitSet;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.Partnership;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.PartnershipSet;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.PersonSet;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.RoleSet;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.Worker;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.WorkerSet;

import com.google.inject.Inject;

public class OrganizationDslQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;


	protected QualifiedName qualifiedName(Worker e) {

		String name = null;

		List<INode> nodes = NodeModelUtils.findNodesForFeature(e,
				OrganizationDslPackage.Literals.WORKER__PERSON);

		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			name = NodeModelUtils.getTokenText(first);
			QualifiedName qualifiedNameFromConverter = converter
					.toQualifiedName(name);

			if (e.eContainer() != null) {
				QualifiedName parentsQualifiedName = getFullyQualifiedName(e
						.eContainer());
				if (parentsQualifiedName != null) {
					return parentsQualifiedName
							.append(qualifiedNameFromConverter.getLastSegment());
				} else
					return qualifiedNameFromConverter;
			}
		}
		return super.qualifiedName(e);
	}
	
	protected QualifiedName qualifiedName(Partnership e) {
		
		String name = null;
		
		List<INode> nodes = NodeModelUtils.findNodesForFeature(e,
				OrganizationDslPackage.Literals.PARTNERSHIP__COMPANY);
		
		if (!nodes.isEmpty()) {
			INode first = nodes.get(0);
			name = NodeModelUtils.getTokenText(first);
			QualifiedName qualifiedNameFromConverter = converter
					.toQualifiedName(name);
			
			if (e.eContainer() != null) {
				QualifiedName parentsQualifiedName = getFullyQualifiedName(e
						.eContainer());
				if (parentsQualifiedName != null) {
					return parentsQualifiedName
							.append(qualifiedNameFromConverter);
				} else
					return qualifiedNameFromConverter;
			}
		}
		return super.qualifiedName(e);
	}
	
	protected QualifiedName qualifiedName(OrganizationUnitSet e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".units"));
		return qualifiedNameFromConverter;

	}

	
	protected QualifiedName qualifiedName(PersonSet e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".people"));
		return qualifiedNameFromConverter;
	}
	
	protected QualifiedName qualifiedName(WorkerSet e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".workers"));
		return qualifiedNameFromConverter;
	}
	
	protected QualifiedName qualifiedName(PartnershipSet e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".partners"));
		return qualifiedNameFromConverter;
	}
	protected QualifiedName qualifiedName(RoleSet e) {
		QualifiedName qualifiedNameFromConverter = null;
		String containerQN = qualifiedNameProvider
				.getFullyQualifiedName(e.eContainer()).toString().toLowerCase();
		qualifiedNameFromConverter = converter.toQualifiedName(containerQN
				.concat(".roles"));
		return qualifiedNameFromConverter;
	}
	

}
