package org.lunifera.metamodel.dsl.software.topology.scoping;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.AbstractLibraryElement;
import org.lunifera.metamodel.dsl.software.library.softwareLibraryDsl.SoftwareLibraryDslPackage;

public class SoftwareLibraryAwareResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {

	public static final String IS_ABSTRACT = "IS_ABSTRACT";

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof AbstractLibraryElement) {
			return createStateDescriptions((AbstractLibraryElement) eObject,
					acceptor);
		}
		return super.createEObjectDescriptions(eObject, acceptor);
	}

	public boolean createStateDescriptions(AbstractLibraryElement state,
			IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null)
			return false;
		try {
			QualifiedName qualifiedName = getQualifiedNameProvider()
					.getFullyQualifiedName(state);
			if (qualifiedName != null) {
				Map<String, String> data = new HashMap<String, String>();
				data.put(
						IS_ABSTRACT,
						Boolean.toString(NodeModelUtils
								.findNodesForFeature(
										state,
										SoftwareLibraryDslPackage.Literals.ABSTRACT_LIBRARY_ELEMENT__ABSTRACT)
								.size() > 0));
				acceptor.accept(EObjectDescription.create(qualifiedName, state,
						data));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return true;
	}
}
