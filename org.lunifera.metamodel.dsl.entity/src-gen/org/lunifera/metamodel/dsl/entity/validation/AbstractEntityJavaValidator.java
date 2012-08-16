package org.lunifera.metamodel.dsl.entity.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;

public class AbstractEntityJavaValidator extends XbaseWithAnnotationsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.lunifera.org/metamodel/dsl/entity/Entity"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/Xbase/XAnnotations"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xbase"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/common/JavaVMTypes"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xtype"));
		return result;
	}

}
