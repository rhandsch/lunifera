/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.ExampleTableCell;
import org.lunifera.metamodel.behavior.ExamplesTable;
import org.lunifera.metamodel.behavior.ExamplesTableRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examples Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ExamplesTableRowImpl#getExampleTable <em>Example Table</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.ExamplesTableRowImpl#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExamplesTableRowImpl extends EObjectImpl implements ExamplesTableRow {
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleTableCell> cells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamplesTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.EXAMPLES_TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTable getExampleTable() {
		if (eContainerFeatureID() != BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE) return null;
		return (ExamplesTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleTable(ExamplesTable newExampleTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExampleTable, BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleTable(ExamplesTable newExampleTable) {
		if (newExampleTable != eInternalContainer() || (eContainerFeatureID() != BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE && newExampleTable != null)) {
			if (EcoreUtil.isAncestor(this, newExampleTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExampleTable != null)
				msgs = ((InternalEObject)newExampleTable).eInverseAdd(this, BehaviorPackage.EXAMPLES_TABLE__ROWS, ExamplesTable.class, msgs);
			msgs = basicSetExampleTable(newExampleTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE, newExampleTable, newExampleTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleTableCell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentWithInverseEList<ExampleTableCell>(ExampleTableCell.class, this, BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS, BehaviorPackage.EXAMPLE_TABLE_CELL__ROW);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExampleTable((ExamplesTable)otherEnd, msgs);
			case BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCells()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				return basicSetExampleTable(null, msgs);
			case BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				return eInternalContainer().eInverseRemove(this, BehaviorPackage.EXAMPLES_TABLE__ROWS, ExamplesTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				return getExampleTable();
			case BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS:
				return getCells();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				setExampleTable((ExamplesTable)newValue);
				return;
			case BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends ExampleTableCell>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				setExampleTable((ExamplesTable)null);
				return;
			case BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS:
				getCells().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.EXAMPLES_TABLE_ROW__EXAMPLE_TABLE:
				return getExampleTable() != null;
			case BehaviorPackage.EXAMPLES_TABLE_ROW__CELLS:
				return cells != null && !cells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExamplesTableRowImpl
