/**
 */
package org.lunifera.metamodel.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phone Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.lunifera.metamodel.common.CommonPackage#getPhoneType()
 * @model
 * @generated
 */
public enum PhoneType implements Enumerator {
	/**
	 * The '<em><b>Home</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(0, "home", "home"),

	/**
	 * The '<em><b>Work</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORK_VALUE
	 * @generated
	 * @ordered
	 */
	WORK(1, "work", "work"),

	/**
	 * The '<em><b>Cell Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_PERSON(2, "cellPerson", "cellPerson"),

	/**
	 * The '<em><b>Cell Work</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELL_WORK_VALUE
	 * @generated
	 * @ordered
	 */
	CELL_WORK(3, "cellWork", "cellWork");

	/**
	 * The '<em><b>Home</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Home</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOME
	 * @model name="home"
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 0;

	/**
	 * The '<em><b>Work</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Work</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORK
	 * @model name="work"
	 * @generated
	 * @ordered
	 */
	public static final int WORK_VALUE = 1;

	/**
	 * The '<em><b>Cell Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Person</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_PERSON
	 * @model name="cellPerson"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_PERSON_VALUE = 2;

	/**
	 * The '<em><b>Cell Work</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cell Work</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELL_WORK
	 * @model name="cellWork"
	 * @generated
	 * @ordered
	 */
	public static final int CELL_WORK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Phone Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhoneType[] VALUES_ARRAY =
		new PhoneType[] {
			HOME,
			WORK,
			CELL_PERSON,
			CELL_WORK,
		};

	/**
	 * A public read-only list of all the '<em><b>Phone Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhoneType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Phone Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhoneType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhoneType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phone Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhoneType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhoneType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phone Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhoneType get(int value) {
		switch (value) {
			case HOME_VALUE: return HOME;
			case WORK_VALUE: return WORK;
			case CELL_PERSON_VALUE: return CELL_PERSON;
			case CELL_WORK_VALUE: return CELL_WORK;
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
	private PhoneType(int value, String name, String literal) {
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
	
} //PhoneType
