package org.lunifera.metamodel.dsl.entity.tests.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manager {
	private boolean disposed;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;

	private String name;

	@OneToMany(mappedBy = "manager")
	private List<Project> projects;

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
	 * Returns an unmodifiable list of projects.
	 * 
	 * @return projects
	 */
	public List<Project> getProjects() {
		checkDisposed();

		ensureProjects();
		return java.util.Collections.unmodifiableList(this.projects);
	}

	/**
	 * Adds the given _projects to this object.
	 * <p>
	 * 
	 * @param _projects
	 */
	public void addProjects(final Project _projects) {
		checkDisposed();

		// If _projects is null, we do not add it
		if (_projects == null) {
			return;
		}

		ensureProjects();

		// Adds the parameter to the list
		if (!this.projects.contains(_projects)) {
			this.projects.add(_projects);
		}
	}

	/**
	 * Removes the given _projects from this object.
	 * 
	 * @param _projects
	 */
	public void removeProjects(final Project _projects) {
		checkDisposed();

		// If _projects or the projects are null, we can leave
		if (_projects == null || projects == null) {
			return;
		}

		this.projects.remove(_projects);
	}

	/**
	 * Ensures that the list of projects is created. It will be instantiated
	 * lazy.
	 */
	private void ensureProjects() {
		if (this.projects == null) {
			this.projects = new java.util.ArrayList<Project>();
		}
	}

	public int getProjectsCount() {
		List<Project> _projects = this.getProjects();
		return _projects.size();
	}
}
