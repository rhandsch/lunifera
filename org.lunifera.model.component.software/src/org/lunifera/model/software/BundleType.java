/**
 */
package org.lunifera.model.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bundle Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.lunifera.model.software.SoftwarePackage#getBundleType()
 * @model
 * @generated
 */
public enum BundleType implements Enumerator {
	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(0, "CONFIGURATION", "configuration"),

	/**
	 * The '<em><b>PERSISTENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENCE(1, "PERSISTENCE", "persistence"),

	/**
	 * The '<em><b>BUSINESSPROCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESSPROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESSPROCESS(2, "BUSINESSPROCESS", "businessProcess"),

	/**
	 * The '<em><b>BUSINESSRULES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESSRULES_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESSRULES(3, "BUSINESSRULES", "businessRules"),

	/**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(4, "SERVICE", "service"),

	/**
	 * The '<em><b>UI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UI_VALUE
	 * @generated
	 * @ordered
	 */
	UI(5, "UI", "ui");

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIGURATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION
	 * @model literal="configuration"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 0;

	/**
	 * The '<em><b>PERSISTENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERSISTENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSISTENCE
	 * @model literal="persistence"
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENCE_VALUE = 1;

	/**
	 * The '<em><b>BUSINESSPROCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSINESSPROCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESSPROCESS
	 * @model literal="businessProcess"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESSPROCESS_VALUE = 2;

	/**
	 * The '<em><b>BUSINESSRULES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSINESSRULES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESSRULES
	 * @model literal="businessRules"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESSRULES_VALUE = 3;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model literal="service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 4;

	/**
	 * The '<em><b>UI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UI
	 * @model literal="ui"
	 * @generated
	 * @ordered
	 */
	public static final int UI_VALUE = 5;

	/**
	 * An array of all the '<em><b>Bundle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BundleType[] VALUES_ARRAY =
		new BundleType[] {
			CONFIGURATION,
			PERSISTENCE,
			BUSINESSPROCESS,
			BUSINESSRULES,
			SERVICE,
			UI,
		};

	/**
	 * A public read-only list of all the '<em><b>Bundle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BundleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bundle Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BundleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BundleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bundle Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BundleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BundleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bundle Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BundleType get(int value) {
		switch (value) {
			case CONFIGURATION_VALUE: return CONFIGURATION;
			case PERSISTENCE_VALUE: return PERSISTENCE;
			case BUSINESSPROCESS_VALUE: return BUSINESSPROCESS;
			case BUSINESSRULES_VALUE: return BUSINESSRULES;
			case SERVICE_VALUE: return SERVICE;
			case UI_VALUE: return UI;
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
	private BundleType(int value, String name, String literal) {
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
	
} //BundleType
