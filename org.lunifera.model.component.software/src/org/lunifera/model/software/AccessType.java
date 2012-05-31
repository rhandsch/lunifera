/**
 */
package org.lunifera.model.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.lunifera.model.software.SoftwarePackage#getAccessType()
 * @model
 * @generated
 */
public enum AccessType implements Enumerator {
	/**
	 * The '<em><b>Web Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_SERVICE(0, "WebService", "WebService"),

	/**
	 * The '<em><b>OS Gi Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_GI_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	OS_GI_SERVICE(1, "OSGiService", "OSGiService"),

	/**
	 * The '<em><b>RCP Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCP_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	RCP_CALL(2, "RCPCall", "RCPCall");

	/**
	 * The '<em><b>Web Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE
	 * @model name="WebService"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>OS Gi Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS Gi Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_GI_SERVICE
	 * @model name="OSGiService"
	 * @generated
	 * @ordered
	 */
	public static final int OS_GI_SERVICE_VALUE = 1;

	/**
	 * The '<em><b>RCP Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RCP Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RCP_CALL
	 * @model name="RCPCall"
	 * @generated
	 * @ordered
	 */
	public static final int RCP_CALL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Access Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessType[] VALUES_ARRAY =
		new AccessType[] {
			WEB_SERVICE,
			OS_GI_SERVICE,
			RCP_CALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessType get(int value) {
		switch (value) {
			case WEB_SERVICE_VALUE: return WEB_SERVICE;
			case OS_GI_SERVICE_VALUE: return OS_GI_SERVICE;
			case RCP_CALL_VALUE: return RCP_CALL;
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
	private AccessType(int value, String name, String literal) {
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
	
} //AccessType
