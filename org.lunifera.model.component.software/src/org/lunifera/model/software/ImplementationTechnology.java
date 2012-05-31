/**
 */
package org.lunifera.model.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Implementation Technology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.lunifera.model.software.SoftwarePackage#getImplementationTechnology()
 * @model
 * @generated
 */
public enum ImplementationTechnology implements Enumerator {
	/**
	 * The '<em><b>Equinox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUINOX_VALUE
	 * @generated
	 * @ordered
	 */
	EQUINOX(0, "Equinox", "Equinox"),

	/**
	 * The '<em><b>RCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCP_VALUE
	 * @generated
	 * @ordered
	 */
	RCP(1, "RCP", "RCP"),

	/**
	 * The '<em><b>Vaadin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAADIN_VALUE
	 * @generated
	 * @ordered
	 */
	VAADIN(2, "Vaadin", "Vaadin"),

	/**
	 * The '<em><b>Android</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDROID_VALUE
	 * @generated
	 * @ordered
	 */
	ANDROID(3, "Android", "Android"),

	/**
	 * The '<em><b>IOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOS_VALUE
	 * @generated
	 * @ordered
	 */
	IOS(4, "IOS", "IOS");

	/**
	 * The '<em><b>Equinox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equinox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUINOX
	 * @model name="Equinox"
	 * @generated
	 * @ordered
	 */
	public static final int EQUINOX_VALUE = 0;

	/**
	 * The '<em><b>RCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RCP_VALUE = 1;

	/**
	 * The '<em><b>Vaadin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vaadin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAADIN
	 * @model name="Vaadin"
	 * @generated
	 * @ordered
	 */
	public static final int VAADIN_VALUE = 2;

	/**
	 * The '<em><b>Android</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Android</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANDROID
	 * @model name="Android"
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_VALUE = 3;

	/**
	 * The '<em><b>IOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IOS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Implementation Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImplementationTechnology[] VALUES_ARRAY =
		new ImplementationTechnology[] {
			EQUINOX,
			RCP,
			VAADIN,
			ANDROID,
			IOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Implementation Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImplementationTechnology> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Implementation Technology</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationTechnology get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImplementationTechnology result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Implementation Technology</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationTechnology getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImplementationTechnology result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Implementation Technology</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationTechnology get(int value) {
		switch (value) {
			case EQUINOX_VALUE: return EQUINOX;
			case RCP_VALUE: return RCP;
			case VAADIN_VALUE: return VAADIN;
			case ANDROID_VALUE: return ANDROID;
			case IOS_VALUE: return IOS;
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
	private ImplementationTechnology(int value, String name, String literal) {
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
	
} //ImplementationTechnology
