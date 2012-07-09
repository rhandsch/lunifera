package org.lunifera.metamodel.dsl.entity.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

public class EntityImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

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
}
