package org.lunifera.metamodel.dsl.entity.tests.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Developer {
	private boolean disposed;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	private String name;

	@ManyToOne
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
	 * Returns the project reference or <code>null</code> if not present.
	 * 
	 * @return project
	 */
	public Project getProject() {
		checkDisposed();

		return this.project;
	}

	/**
	 * Sets the _project reference to this instance.
	 * 
	 * @param _project
	 */
	public void setProject(final Project _project) {
		checkDisposed();

		this.project = _project;
	}
}
