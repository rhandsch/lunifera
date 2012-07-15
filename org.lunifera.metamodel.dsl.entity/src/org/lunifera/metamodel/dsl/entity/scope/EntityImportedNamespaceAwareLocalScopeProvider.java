package org.lunifera.metamodel.dsl.entity.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel;
import org.lunifera.metamodel.dsl.entity.entitymodel.LPackage;

import com.google.inject.Inject;

public class EntityImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	@Inject
	IQualifiedNameConverter qualifiedNameConverter;

	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> temp = new ArrayList<ImportNormalizer>();
		temp.add(new ImportNormalizer(QualifiedName.create("builtin", "types",
				"namespace"), true, ignoreCase));
		temp.add(new ImportNormalizer(QualifiedName.create("java.lang"), true,
				ignoreCase));
		temp.add(new ImportNormalizer(QualifiedName.create("java.util"), true,
				ignoreCase));

		return temp;
	}

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {
		List<ImportNormalizer> result = new ArrayList<ImportNormalizer>();
		result.addAll(super.internalGetImportedNamespaceResolvers(context,
				ignoreCase));
		if (context instanceof LEntityModel) {
			LPackage lPackage = ((LEntityModel) context).getPackage();
			if (lPackage != null) {
				result.add(createImportedNamespaceResolver(
						qualifiedNameConverter
								.toString(getQualifiedNameProvider()
										.getFullyQualifiedName(lPackage))
								+ ".*", ignoreCase));
			}
		}
		return result;

	}

}
