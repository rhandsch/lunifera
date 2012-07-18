package org.lunifera.metamodel.dsl.organization.en.naming;

import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.OrganizationDslPackage;
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.Worker;

import com.google.inject.Inject;

public class OrganizationDslQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

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
							.append(qualifiedNameFromConverter);
				} else
					return qualifiedNameFromConverter;
			}
		}
		return QualifiedName.create("No name");
	}

}
