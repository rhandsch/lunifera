package org.lunifera.metamodel.dsl.entity.tests.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Project {
	private boolean disposed;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	private String name;

	private boolean settingContract;

	@OneToOne(optional = false)
	private Contract contract;

	@OneToMany(mappedBy = "project")
	private List<Developer> developers;

	@ManyToOne
	private Manager manager;

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

		disposed = true;

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
	 * Returns the contract reference or <code>null</code> if not present.
	 * 
	 * @return contract
	 */
	public Contract getContract() {
		checkDisposed();

		return this.contract;
	}

	/**
	 * Sets the contract reference to this instance.
	 * 
	 * Since the reference is a container reference, the opposite reference
	 * (Contract.project) of the _contract will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Contract#setProject(Contract)}.
	 * 
	 * @param _contract
	 */
	public void setContract(final Contract _contract) {
		checkDisposed();

		if (settingContract) {
			// avoid loops
			return;
		}

		Contract oldContract = this.contract;

		// if the parent does not change, we can leave
		if (oldContract == _contract) {
			return;
		}

		try {
			// avoid loops
			settingContract = true;
			// First remove the element
			if (oldContract != null) {
				oldContract.setProject(null);
			}

			// Then assign the new value
			this.contract = _contract;

			// Then add 'this' to the new value
			if (this.contract != null) {
				this.contract.setProject(this);
			}
		} finally {
			settingContract = false;
		}

	}

	/**
	 * Returns an unmodifiable list of developers.
	 * 
	 * @return developers
	 */
	public List<Developer> getDevelopers() {
		checkDisposed();

		ensureDevelopers();
		return java.util.Collections.unmodifiableList(this.developers);
	}

	/**
	 * Adds the given _developers to this object.
	 * <p>
	 * 
	 * @param _developers
	 */
	public void addDevelopers(final Developer _developers) {
		checkDisposed();

		// If _developers is null, we do not add it
		if (_developers == null) {
			return;
		}

		ensureDevelopers();

		// Adds the parameter to the list
		if (!this.developers.contains(_developers)) {
			this.developers.add(_developers);
		}
	}

	/**
	 * Removes the given _developers from this object.
	 * 
	 * @param _developers
	 */
	public void removeDevelopers(final Developer _developers) {
		checkDisposed();

		// If _developers or the developers are null, we can leave
		if (_developers == null || developers == null) {
			return;
		}

		this.developers.remove(_developers);
	}

	/**
	 * Ensures that the list of developers is created. It will be instantiated
	 * lazy.
	 */
	private void ensureDevelopers() {
		if (this.developers == null) {
			this.developers = new java.util.ArrayList<Developer>();
		}
	}

	/**
	 * Returns the manager reference or <code>null</code> if not present.
	 * 
	 * @return manager
	 */
	public Manager getManager() {
		checkDisposed();

		return this.manager;
	}

	/**
	 * Sets the _manager reference to this instance.
	 * 
	 * @param _manager
	 */
	public void setManager(final Manager _manager) {
		checkDisposed();

		this.manager = _manager;
	}
}
