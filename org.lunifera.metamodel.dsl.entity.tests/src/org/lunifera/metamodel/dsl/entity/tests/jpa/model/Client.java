package org.lunifera.metamodel.dsl.entity.tests.jpa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Test 112233
 */
@Entity
public class Client {
	private boolean disposed;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	private String name;

	private boolean settingContracts;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private List<Contract> contracts;

	/**
	 * Returns true, if the object is disposed. Disposed means, that it is
	 * prepared for garbage collection and may not be used anymore. Accessing
	 * objects that are already disposed will cause runtime exceptions.
	 * 
	 * @return true if the object is disposed and false otherwise
	 */
	public boolean isDisposed() {
		return this.disposed;
	}

	/**
	 * Checks whether the object is disposed.
	 * 
	 * @throws RuntimeException
	 *             if the object is disposed.
	 * 
	 */
	private void checkDisposed() {
		if (isDisposed()) {
			throw new RuntimeException(String.format(
					"Object already disposed: {}", this.toString()));
		}

	}

	/**
	 * Calling dispose will destroy that instance. The internal state will be
	 * set to 'disposed' and methods of that object must not be used anymore.
	 * Each call will result in runtime exceptions.<br>
	 * If this object keeps containment references, these will be disposed too.
	 * So the whole containment tree will be disposed on calling this method.
	 * 
	 */
	public void dispose() {
		if (isDisposed()) {
			return;
		}

		try {
			// dispose all the containment references
			if (this.contracts != null) {
				for (Contract contract : this.contracts) {
					contract.dispose();
				}
				this.contracts = null;
			}
		} finally {
			disposed = true;
		}

	}

	/**
	 * Returns the id property or <code>null</code> if not present.
	 * 
	 * @return id
	 */
	public long getId() {
		checkDisposed();

		return this.id;
	}

	/**
	 * Sets the _id property to this instance.
	 * 
	 * @param _id
	 */
	public void setId(final long _id) {
		checkDisposed();

		this.id = _id;
	}

	/**
	 * Returns the name property or <code>null</code> if not present.
	 * 
	 * @return name
	 */
	public String getName() {
		checkDisposed();

		return this.name;
	}

	/**
	 * Sets the _name property to this instance.
	 * 
	 * @param _name
	 */
	public void setName(final String _name) {
		checkDisposed();

		this.name = _name;
	}

	/**
	 * Returns an unmodifiable list of contracts.
	 * 
	 * @return contracts
	 */
	public List<Contract> getContracts() {
		checkDisposed();

		ensureContracts();
		return java.util.Collections.unmodifiableList(this.contracts);
	}

	/**
	 * Adds the given _contracts to this object.
	 * <p>
	 * Since the reference is a containment reference, the opposite reference
	 * (Contract.client) of the _contracts will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Contract#setClient(Contract)}.
	 * 
	 * @param _contracts
	 */
	public void addContracts(final Contract _contracts) {
		checkDisposed();

		if (settingContracts) {
			// avoid loops
			return;
		}

		// If _contracts is null, we do not add it
		if (_contracts == null) {
			return;
		}

		try {
			settingContracts = true;

			ensureContracts();

			// Adds the parameter to the list
			if (!this.contracts.contains(_contracts)) {
				this.contracts.add(_contracts);

				// Set 'this' as the parent of the containment reference to the
				// _contracts
				_contracts.setClient(this);
			}
		} finally {
			settingContracts = false;
		}

	}

	/**
	 * Removes the given _contracts from this object.
	 * <p>
	 * Since the reference is a containment reference, the opposite reference
	 * (Contract.client) of the _contracts will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Contract#setClient(Contract)}.
	 * 
	 * @param _contracts
	 */
	public void removeContracts(final Contract _contracts) {
		checkDisposed();

		// If the parameter or the field are null, we can leave
		if (_contracts == null || contracts == null) {
			return;
		}

		// if the _contracts is not contained, then we can leave
		if (!this.contracts.contains(_contracts)) {
			return;
		}

		// Removes the parameter from the field
		this.contracts.remove(_contracts);
		// Unset the parent of the containment reference from the _contracts
		_contracts.setClient(null);

	}

	/**
	 * Ensures that the list of contracts is created. It will be instantiated
	 * lazy.
	 */
	private void ensureContracts() {
		if (this.contracts == null) {
			this.contracts = new java.util.ArrayList<Contract>();
		}
	}
}
