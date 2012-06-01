/**
 */
package com.c4biz.hawdev.model.organization;

import org.eclipse.emf.common.util.EList;

import org.lunifera.model.common.AbsNamedClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all Hawkdev classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.c4biz.hawdev.model.organization.Unit#getOrganization <em>Organization</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Unit#getParentUnit <em>Parent Unit</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Unit#getSubUnits <em>Sub Units</em>}</li>
 *   <li>{@link com.c4biz.hawdev.model.organization.Unit#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends AbsNamedClass {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Organization#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getUnit_Organization()
	 * @see com.c4biz.hawdev.model.organization.Organization#getUnits
	 * @model opposite="units" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Unit#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Parent Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Unit#getSubUnits <em>Sub Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Unit</em>' container reference.
	 * @see #setParentUnit(Unit)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getUnit_ParentUnit()
	 * @see com.c4biz.hawdev.model.organization.Unit#getSubUnits
	 * @model opposite="subUnits" transient="false"
	 * @generated
	 */
	Unit getParentUnit();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Unit#getParentUnit <em>Parent Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Unit</em>' container reference.
	 * @see #getParentUnit()
	 * @generated
	 */
	void setParentUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Sub Units</b></em>' containment reference list.
	 * The list contents are of type {@link com.c4biz.hawdev.model.organization.Unit}.
	 * It is bidirectional and its opposite is '{@link com.c4biz.hawdev.model.organization.Unit#getParentUnit <em>Parent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Units</em>' containment reference list.
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getUnit_SubUnits()
	 * @see com.c4biz.hawdev.model.organization.Unit#getParentUnit
	 * @model opposite="parentUnit" containment="true"
	 * @generated
	 */
	EList<Unit> getSubUnits();

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' reference.
	 * @see #setUnitType(UnitType)
	 * @see com.c4biz.hawdev.model.organization.OrganizationPackage#getUnit_UnitType()
	 * @model
	 * @generated
	 */
	UnitType getUnitType();

	/**
	 * Sets the value of the '{@link com.c4biz.hawdev.model.organization.Unit#getUnitType <em>Unit Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' reference.
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(UnitType value);

} // Unit
