/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Hans Georg Glöckler - Initial implementation
 *  		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.entitymodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelFactory;
import org.lunifera.metamodel.dsl.entity.entitymodel.EntitymodelPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LAnnotationDef;
import org.lunifera.metamodel.dsl.entity.entitymodel.LCompilerType;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityModel;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEnum;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral;
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings;
import org.lunifera.metamodel.dsl.entity.entitymodel.LImport;
import org.lunifera.metamodel.dsl.entity.entitymodel.LModifier;
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LOperation;
import org.lunifera.metamodel.dsl.entity.entitymodel.LPackage;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;
import org.lunifera.metamodel.dsl.entity.entitymodel.LRefers;
import org.lunifera.metamodel.dsl.entity.entitymodel.LVisibility;
import org.lunifera.metamodel.dsl.entity.entitymodel.LowerBound;
import org.lunifera.metamodel.dsl.entity.entitymodel.UpperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntitymodelFactoryImpl extends EFactoryImpl implements EntitymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntitymodelFactory init() {
		try {
			EntitymodelFactory theEntitymodelFactory = (EntitymodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lunifera.org/metamodel/dsl/entity/Entity"); 
			if (theEntitymodelFactory != null) {
				return theEntitymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EntitymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EntitymodelPackage.LENTITY_MODEL: return createLEntityModel();
			case EntitymodelPackage.LPACKAGE: return createLPackage();
			case EntitymodelPackage.LIMPORT: return createLImport();
			case EntitymodelPackage.LGEN_SETTINGS: return createLGenSettings();
			case EntitymodelPackage.LCOMPILER_TYPE: return createLCompilerType();
			case EntitymodelPackage.LENTITY: return createLEntity();
			case EntitymodelPackage.LENTITY_MEMBER: return createLEntityMember();
			case EntitymodelPackage.LPROPERTY: return createLProperty();
			case EntitymodelPackage.LREFERS: return createLRefers();
			case EntitymodelPackage.LCONTAINS: return createLContains();
			case EntitymodelPackage.LCONTAINER: return createLContainer();
			case EntitymodelPackage.LEMBEDDS: return createLEmbedds();
			case EntitymodelPackage.LOPERATION: return createLOperation();
			case EntitymodelPackage.LMODIFIER: return createLModifier();
			case EntitymodelPackage.LENUM: return createLEnum();
			case EntitymodelPackage.LENUM_LITERAL: return createLEnumLiteral();
			case EntitymodelPackage.LANNOTATION_DEF: return createLAnnotationDef();
			case EntitymodelPackage.LMULTIPLICITY: return createLMultiplicity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EntitymodelPackage.LVISIBILITY:
				return createLVisibilityFromString(eDataType, initialValue);
			case EntitymodelPackage.LOWER_BOUND:
				return createLowerBoundFromString(eDataType, initialValue);
			case EntitymodelPackage.UPPER_BOUND:
				return createUpperBoundFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EntitymodelPackage.LVISIBILITY:
				return convertLVisibilityToString(eDataType, instanceValue);
			case EntitymodelPackage.LOWER_BOUND:
				return convertLowerBoundToString(eDataType, instanceValue);
			case EntitymodelPackage.UPPER_BOUND:
				return convertUpperBoundToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEntityModel createLEntityModel() {
		LEntityModelImpl lEntityModel = new LEntityModelImpl();
		return lEntityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPackage createLPackage() {
		LPackageImpl lPackage = new LPackageImpl();
		return lPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LImport createLImport() {
		LImportImpl lImport = new LImportImpl();
		return lImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LGenSettings createLGenSettings() {
		LGenSettingsImpl lGenSettings = new LGenSettingsImpl();
		return lGenSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCompilerType createLCompilerType() {
		LCompilerTypeImpl lCompilerType = new LCompilerTypeImpl();
		return lCompilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEntity createLEntity() {
		LEntityImpl lEntity = new LEntityImpl();
		return lEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEntityMember createLEntityMember() {
		LEntityMemberImpl lEntityMember = new LEntityMemberImpl();
		return lEntityMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LProperty createLProperty() {
		LPropertyImpl lProperty = new LPropertyImpl();
		return lProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRefers createLRefers() {
		LRefersImpl lRefers = new LRefersImpl();
		return lRefers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LContains createLContains() {
		LContainsImpl lContains = new LContainsImpl();
		return lContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LContainer createLContainer() {
		LContainerImpl lContainer = new LContainerImpl();
		return lContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEmbedds createLEmbedds() {
		LEmbeddsImpl lEmbedds = new LEmbeddsImpl();
		return lEmbedds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOperation createLOperation() {
		LOperationImpl lOperation = new LOperationImpl();
		return lOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LModifier createLModifier() {
		LModifierImpl lModifier = new LModifierImpl();
		return lModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEnum createLEnum() {
		LEnumImpl lEnum = new LEnumImpl();
		return lEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEnumLiteral createLEnumLiteral() {
		LEnumLiteralImpl lEnumLiteral = new LEnumLiteralImpl();
		return lEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LAnnotationDef createLAnnotationDef() {
		LAnnotationDefImpl lAnnotationDef = new LAnnotationDefImpl();
		return lAnnotationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LMultiplicity createLMultiplicity() {
		LMultiplicityImpl lMultiplicity = new LMultiplicityImpl();
		return lMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LVisibility createLVisibilityFromString(EDataType eDataType, String initialValue) {
		LVisibility result = LVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBound createLowerBoundFromString(EDataType eDataType, String initialValue) {
		LowerBound result = LowerBound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowerBoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBound createUpperBoundFromString(EDataType eDataType, String initialValue) {
		UpperBound result = UpperBound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitymodelPackage getEntitymodelPackage() {
		return (EntitymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EntitymodelPackage getPackage() {
		return EntitymodelPackage.eINSTANCE;
	}

} //EntitymodelFactoryImpl
