package org.lunifera.metamodel.dsl.entity.valueconverter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.metamodel.dsl.entity.entity.EntityModel;
import org.lunifera.metamodel.dsl.entity.entity.Entity;
import org.lunifera.metamodel.dsl.entity.entity.Package;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class EntityQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Entity) {
			EntityModel model = (EntityModel) obj.eContainer();
			Package pkg = model.getPackage();
			final String qualifiedName = String.format("%s.%s", pkg.getName(),
					((Entity) obj).getName());
			if (qualifiedName == null)
				return null;
			return qualifiedNameConverter.toQualifiedName(qualifiedName);
		}
		return super.getFullyQualifiedName(obj);
	}
}
