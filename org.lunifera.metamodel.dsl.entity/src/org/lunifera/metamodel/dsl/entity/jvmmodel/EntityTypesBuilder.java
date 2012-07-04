package org.lunifera.metamodel.dsl.entity.jvmmodel;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.impl.TypesFactoryImpl;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.metamodel.dsl.entity.lentity.LEntity;
import org.lunifera.metamodel.dsl.entity.lentity.LEntityMember;
import org.lunifera.metamodel.dsl.entity.lentity.LReference;
import org.lunifera.metamodel.dsl.entity.lentity.LentityPackage;

import com.google.inject.Inject;

public class EntityTypesBuilder {

	private static final Logger LOG = Logger.getLogger(JvmTypesBuilder.class);

	@Inject
	private TypesFactory typesFactory;

	@SuppressWarnings("restriction")
	@Inject
	private IJvmModelAssociator associator;
	
	protected EList<LEntityMember> members;


	EList<LEntityMember> getMembersForReference() {
		if (members == null)
		{
			members = new EObjectContainmentWithInverseEList.Resolving<LEntityMember>(LEntityMember.class, (InternalEObject) LEntityMember.class, LentityPackage.LENTITY__ENTITY_MEMBERS, LentityPackage.LENTITY_MEMBER);
		}
		return members;
	}
	
	@Nullable	
	public LReference toReference(@Nullable LEntity sourceElement, @Nullable String name, @Nullable Procedure1<? super LReference> initializer) {
		if(sourceElement == null || name == null) 
			return null;
		LReference result = (LReference) typesFactory.createJvmField();
		result.setName(name);
		associate(sourceElement, result);
		return initializeSafely(result, initializer);
	}
	
	@SuppressWarnings("restriction")
	@Nullable
	public LReference associate(@Nullable LEntity sourceElement, @Nullable LReference target) {
		if(sourceElement != null && target != null)
			associator.associate(sourceElement, target);
		return target;
	}
	
	protected <T extends EObject> T initializeSafely(@Nullable T targetElement, @Nullable Procedure1<? super T> initializer) {
		if(targetElement != null && initializer != null) {
			try {
				initializer.apply(targetElement);
			} catch (Exception e) {
				LOG.error("Error initializing JvmElement", e);
			}
		}
		return targetElement;
	}



}
