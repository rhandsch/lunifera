/**
 */
package org.lunifera.model.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.lunifera.model.software.SoftwarePackage#getSoftwareStatus()
 * @model
 * @generated
 */
public enum SoftwareStatus implements Enumerator {
	/**
	 * The '<em><b>Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT(0, "Development", "Development"),

	/**
	 * The '<em><b>Production</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTION(1, "Production", "Production"),

	/**
	 * The '<em><b>Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(2, "Maintenance", "Maintenance"),

	/**
	 * The '<em><b>Inactive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(3, "Inactive", "Inactive");

	/**
	 * The '<em><b>Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Development</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT
	 * @model name="Development"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_VALUE = 0;

	/**
	 * The '<em><b>Production</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Production</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION
	 * @model name="Production"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTION_VALUE = 1;

	/**
	 * The '<em><b>Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model name="Maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 2;

	/**
	 * The '<em><b>Inactive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inactive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INACTIVE
	 * @model name="Inactive"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SoftwareStatus[] VALUES_ARRAY =
		new SoftwareStatus[] {
			DEVELOPMENT,
			PRODUCTION,
			MAINTENANCE,
			INACTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SoftwareStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoftwareStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoftwareStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareStatus get(int value) {
		switch (value) {
			case DEVELOPMENT_VALUE: return DEVELOPMENT;
			case PRODUCTION_VALUE: return PRODUCTION;
			case MAINTENANCE_VALUE: return MAINTENANCE;
			case INACTIVE_VALUE: return INACTIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SoftwareStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SoftwareStatus
