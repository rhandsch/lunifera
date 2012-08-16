package org.lunifera.metamodel.dsl.entity.tests.jpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Contract {
	private boolean disposed;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	private String name;

	private boolean settingClient;

	@ManyToOne(optional = false)
	private Client client;

	private boolean settingProject;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "contract")
	private Project project;

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
			if (this.project != null) {
				this.project.dispose();
				this.project = null;
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
	 * Returns the client reference or <code>null</code> if not present.
	 * 
	 * @return client
	 */
	public Client getClient() {
		checkDisposed();

		return this.client;
	}

	/**
	 * Sets the client reference to this instance.
	 * 
	 * Since the reference is a container reference, the opposite reference
	 * (Client.contracts) of the _client will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Client#setContracts(Client)}.
	 * 
	 * @param _client
	 */
	public void setClient(final Client _client) {
		checkDisposed();

		if (settingClient) {
			// avoid loops
			return;
		}

		Client oldClient = this.client;

		// if the parent does not change, we can leave
		if (oldClient == _client) {
			return;
		}

		try {
			// avoid loops
			settingClient = true;
			// First remove the element
			if (oldClient != null) {
				oldClient.removeContracts(this);
			}

			// Then assign the new value
			this.client = _client;

			// Then add 'this' to the new value
			if (this.client != null) {
				this.client.addContracts(this);
			}
		} finally {
			settingClient = false;
		}

	}

	/**
	 * Returns the project reference or <code>null</code> if not present.
	 * 
	 * @return project
	 */
	public Project getProject() {
		checkDisposed();

		return this.project;
	}

	/**
	 * Sets the project reference to this instance.
	 * 
	 * Since the reference is a containment reference, the opposite reference
	 * (Project.contract) of the _project will be handled automatically and no
	 * further coding is required to keep them in sync. See
	 * {@link Project#setContract(Project)}.
	 * 
	 * @param _project
	 */
	public void setProject(final Project _project) {
		checkDisposed();

		if (settingProject) {
			// avoid loops
			return;
		}

		Project oldProject = this.project;

		// if the parent does not change, we can leave
		if (oldProject == _project) {
			return;
		}

		try {
			// avoid loops
			settingProject = true;

			// First remove the element
			if (oldProject != null) {
				oldProject.setContract(null);
			}

			// Then assign the new value
			this.project = _project;

			// Then add 'this' to the new value
			if (this.project != null) {
				this.project.setContract(this);
			}
		} finally {
			settingProject = false;
		}

	}
}
