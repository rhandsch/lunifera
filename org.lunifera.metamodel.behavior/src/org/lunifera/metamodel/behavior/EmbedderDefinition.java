/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedder Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getUsingSteps <em>Using Steps</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getStoriesToRun <em>Stories To Run</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isGenerateViewAfterStories <em>Generate View After Stories</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInStories <em>Ignore Failure In Stories</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInView <em>Ignore Failure In View</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isVerboseFailures <em>Verbose Failures</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getStoryTimeoutInSecs <em>Story Timeout In Secs</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getMetaFilters <em>Meta Filters</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition()
 * @model
 * @generated
 */
public interface EmbedderDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Using Steps</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.StepsImplementationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Steps</em>' reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_UsingSteps()
	 * @model
	 * @generated
	 */
	EList<StepsImplementationClass> getUsingSteps();

	/**
	 * Returns the value of the '<em><b>Stories To Run</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.metamodel.behavior.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories To Run</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories To Run</em>' reference list.
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_StoriesToRun()
	 * @model
	 * @generated
	 */
	EList<Story> getStoriesToRun();

	/**
	 * Returns the value of the '<em><b>Generate View After Stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate View After Stories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate View After Stories</em>' attribute.
	 * @see #setGenerateViewAfterStories(boolean)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_GenerateViewAfterStories()
	 * @model
	 * @generated
	 */
	boolean isGenerateViewAfterStories();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isGenerateViewAfterStories <em>Generate View After Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate View After Stories</em>' attribute.
	 * @see #isGenerateViewAfterStories()
	 * @generated
	 */
	void setGenerateViewAfterStories(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Failure In Stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Failure In Stories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Failure In Stories</em>' attribute.
	 * @see #setIgnoreFailureInStories(boolean)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_IgnoreFailureInStories()
	 * @model
	 * @generated
	 */
	boolean isIgnoreFailureInStories();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInStories <em>Ignore Failure In Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Failure In Stories</em>' attribute.
	 * @see #isIgnoreFailureInStories()
	 * @generated
	 */
	void setIgnoreFailureInStories(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Failure In View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Failure In View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Failure In View</em>' attribute.
	 * @see #setIgnoreFailureInView(boolean)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_IgnoreFailureInView()
	 * @model
	 * @generated
	 */
	boolean isIgnoreFailureInView();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInView <em>Ignore Failure In View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Failure In View</em>' attribute.
	 * @see #isIgnoreFailureInView()
	 * @generated
	 */
	void setIgnoreFailureInView(boolean value);

	/**
	 * Returns the value of the '<em><b>Verbose Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbose Failures</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose Failures</em>' attribute.
	 * @see #setVerboseFailures(boolean)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_VerboseFailures()
	 * @model
	 * @generated
	 */
	boolean isVerboseFailures();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isVerboseFailures <em>Verbose Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose Failures</em>' attribute.
	 * @see #isVerboseFailures()
	 * @generated
	 */
	void setVerboseFailures(boolean value);

	/**
	 * Returns the value of the '<em><b>Story Timeout In Secs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Timeout In Secs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Timeout In Secs</em>' attribute.
	 * @see #setStoryTimeoutInSecs(int)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_StoryTimeoutInSecs()
	 * @model
	 * @generated
	 */
	int getStoryTimeoutInSecs();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getStoryTimeoutInSecs <em>Story Timeout In Secs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Timeout In Secs</em>' attribute.
	 * @see #getStoryTimeoutInSecs()
	 * @generated
	 */
	void setStoryTimeoutInSecs(int value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' attribute.
	 * @see #setThreads(int)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_Threads()
	 * @model
	 * @generated
	 */
	int getThreads();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getThreads <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threads</em>' attribute.
	 * @see #getThreads()
	 * @generated
	 */
	void setThreads(int value);

	/**
	 * Returns the value of the '<em><b>Meta Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Filters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Filters</em>' attribute.
	 * @see #setMetaFilters(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_MetaFilters()
	 * @model
	 * @generated
	 */
	String getMetaFilters();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getMetaFilters <em>Meta Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Filters</em>' attribute.
	 * @see #getMetaFilters()
	 * @generated
	 */
	void setMetaFilters(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#getEmbedderDefinition_Id()
	 * @model id="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

} // EmbedderDefinition
