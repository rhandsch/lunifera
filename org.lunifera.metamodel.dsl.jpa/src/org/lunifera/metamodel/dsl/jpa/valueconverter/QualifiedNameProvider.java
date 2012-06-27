package org.lunifera.metamodel.dsl.jpa.valueconverter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.metamodel.dsl.entity.entity.Entity;
import org.lunifera.metamodel.dsl.entity.entity.EntityModel;
import org.lunifera.metamodel.dsl.entity.entity.Package;
import org.lunifera.metamodel.dsl.jpa.jpa.JModel;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class QualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

//	@Override
//	public QualifiedName getFullyQualifiedName(EObject obj) {
//		if (obj instanceof Entity) {
//			Entity e = (Entity) obj.eContainer();
//			Package p = (Package) obj.eContainer();
//			String qn = QualifiedName.create(p.getName(), e.getName())
//					.toString();
//			return qualifiedNameConverter.toQualifiedName(qn);
//		}
//		return super.getFullyQualifiedName(obj);
//	}
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Entity) {
			EntityModel model = (EntityModel) obj.eContainer();
			Package pkg = model.getPackage();
			final String qualifiedName =  QualifiedName.create(pkg.getName(),
					((Entity) obj).getName()).toString();
			if (qualifiedName == null)
				return null;
			return qualifiedNameConverter.toQualifiedName(qualifiedName);
		}
		return super.getFullyQualifiedName(obj);
	}

}
