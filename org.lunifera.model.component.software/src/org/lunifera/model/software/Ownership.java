/**
 */
package org.lunifera.model.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ownership</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.lunifera.model.software.SoftwarePackage#getOwnership()
 * @model
 * @generated
 */
public enum Ownership implements Enumerator {
	/**
	 * The '<em><b>Internal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL(0, "Internal", "Internal"),

	/**
	 * The '<em><b>Third Made</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_MADE_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_MADE(1, "ThirdMade", "ThirdMade"),

	/**
	 * The '<em><b>Third Rent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_RENT_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_RENT(2, "ThirdRent", "ThirdRent");

	/**
	 * The '<em><b>Internal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Internal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL
	 * @model name="Internal"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VALUE = 0;

	/**
	 * The '<em><b>Third Made</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Third Made</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRD_MADE
	 * @model name="ThirdMade"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_MADE_VALUE = 1;

	/**
	 * The '<em><b>Third Rent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Third Rent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRD_RENT
	 * @model name="ThirdRent"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_RENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ownership</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Ownership[] VALUES_ARRAY =
		new Ownership[] {
			INTERNAL,
			THIRD_MADE,
			THIRD_RENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Ownership</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Ownership> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ownership</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ownership get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ownership result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ownership</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ownership getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ownership result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ownership</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ownership get(int value) {
		switch (value) {
			case INTERNAL_VALUE: return INTERNAL;
			case THIRD_MADE_VALUE: return THIRD_MADE;
			case THIRD_RENT_VALUE: return THIRD_RENT;
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
	private Ownership(int value, String name, String literal) {
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
	
} //Ownership
