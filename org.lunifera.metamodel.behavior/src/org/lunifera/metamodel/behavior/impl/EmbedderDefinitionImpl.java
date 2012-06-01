/**
 */
package org.lunifera.metamodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.EmbedderDefinition;
import org.lunifera.metamodel.behavior.StepsImplementationClass;
import org.lunifera.metamodel.behavior.Story;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedder Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getUsingSteps <em>Using Steps</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getStoriesToRun <em>Stories To Run</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#isGenerateViewAfterStories <em>Generate View After Stories</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#isIgnoreFailureInStories <em>Ignore Failure In Stories</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#isIgnoreFailureInView <em>Ignore Failure In View</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#isVerboseFailures <em>Verbose Failures</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getStoryTimeoutInSecs <em>Story Timeout In Secs</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getMetaFilters <em>Meta Filters</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbedderDefinitionImpl extends EObjectImpl implements EmbedderDefinition {
	/**
	 * The cached value of the '{@link #getUsingSteps() <em>Using Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<StepsImplementationClass> usingSteps;

	/**
	 * The cached value of the '{@link #getStoriesToRun() <em>Stories To Run</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoriesToRun()
	 * @generated
	 * @ordered
	 */
	protected EList<Story> storiesToRun;

	/**
	 * The default value of the '{@link #isGenerateViewAfterStories() <em>Generate View After Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateViewAfterStories()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_VIEW_AFTER_STORIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateViewAfterStories() <em>Generate View After Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateViewAfterStories()
	 * @generated
	 * @ordered
	 */
	protected boolean generateViewAfterStories = GENERATE_VIEW_AFTER_STORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnoreFailureInStories() <em>Ignore Failure In Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreFailureInStories()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_FAILURE_IN_STORIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreFailureInStories() <em>Ignore Failure In Stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreFailureInStories()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreFailureInStories = IGNORE_FAILURE_IN_STORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnoreFailureInView() <em>Ignore Failure In View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreFailureInView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_FAILURE_IN_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreFailureInView() <em>Ignore Failure In View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreFailureInView()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreFailureInView = IGNORE_FAILURE_IN_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerboseFailures() <em>Verbose Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerboseFailures()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERBOSE_FAILURES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerboseFailures() <em>Verbose Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerboseFailures()
	 * @generated
	 * @ordered
	 */
	protected boolean verboseFailures = VERBOSE_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoryTimeoutInSecs() <em>Story Timeout In Secs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryTimeoutInSecs()
	 * @generated
	 * @ordered
	 */
	protected static final int STORY_TIMEOUT_IN_SECS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStoryTimeoutInSecs() <em>Story Timeout In Secs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryTimeoutInSecs()
	 * @generated
	 * @ordered
	 */
	protected int storyTimeoutInSecs = STORY_TIMEOUT_IN_SECS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreads() <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int THREADS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected int threads = THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaFilters() <em>Meta Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaFilters()
	 * @generated
	 * @ordered
	 */
	protected static final String META_FILTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaFilters() <em>Meta Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaFilters()
	 * @generated
	 * @ordered
	 */
	protected String metaFilters = META_FILTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbedderDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.EMBEDDER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepsImplementationClass> getUsingSteps() {
		if (usingSteps == null) {
			usingSteps = new EObjectResolvingEList<StepsImplementationClass>(StepsImplementationClass.class, this, BehaviorPackage.EMBEDDER_DEFINITION__USING_STEPS);
		}
		return usingSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Story> getStoriesToRun() {
		if (storiesToRun == null) {
			storiesToRun = new EObjectResolvingEList<Story>(Story.class, this, BehaviorPackage.EMBEDDER_DEFINITION__STORIES_TO_RUN);
		}
		return storiesToRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateViewAfterStories() {
		return generateViewAfterStories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateViewAfterStories(boolean newGenerateViewAfterStories) {
		boolean oldGenerateViewAfterStories = generateViewAfterStories;
		generateViewAfterStories = newGenerateViewAfterStories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES, oldGenerateViewAfterStories, generateViewAfterStories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreFailureInStories() {
		return ignoreFailureInStories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreFailureInStories(boolean newIgnoreFailureInStories) {
		boolean oldIgnoreFailureInStories = ignoreFailureInStories;
		ignoreFailureInStories = newIgnoreFailureInStories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES, oldIgnoreFailureInStories, ignoreFailureInStories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreFailureInView() {
		return ignoreFailureInView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreFailureInView(boolean newIgnoreFailureInView) {
		boolean oldIgnoreFailureInView = ignoreFailureInView;
		ignoreFailureInView = newIgnoreFailureInView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW, oldIgnoreFailureInView, ignoreFailureInView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerboseFailures() {
		return verboseFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerboseFailures(boolean newVerboseFailures) {
		boolean oldVerboseFailures = verboseFailures;
		verboseFailures = newVerboseFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__VERBOSE_FAILURES, oldVerboseFailures, verboseFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStoryTimeoutInSecs() {
		return storyTimeoutInSecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryTimeoutInSecs(int newStoryTimeoutInSecs) {
		int oldStoryTimeoutInSecs = storyTimeoutInSecs;
		storyTimeoutInSecs = newStoryTimeoutInSecs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS, oldStoryTimeoutInSecs, storyTimeoutInSecs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreads() {
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreads(int newThreads) {
		int oldThreads = threads;
		threads = newThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__THREADS, oldThreads, threads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaFilters() {
		return metaFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaFilters(String newMetaFilters) {
		String oldMetaFilters = metaFilters;
		metaFilters = newMetaFilters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__META_FILTERS, oldMetaFilters, metaFilters));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Long newId) {
		Long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.EMBEDDER_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.EMBEDDER_DEFINITION__USING_STEPS:
				return getUsingSteps();
			case BehaviorPackage.EMBEDDER_DEFINITION__STORIES_TO_RUN:
				return getStoriesToRun();
			case BehaviorPackage.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES:
				return isGenerateViewAfterStories();
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES:
				return isIgnoreFailureInStories();
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW:
				return isIgnoreFailureInView();
			case BehaviorPackage.EMBEDDER_DEFINITION__VERBOSE_FAILURES:
				return isVerboseFailures();
			case BehaviorPackage.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS:
				return getStoryTimeoutInSecs();
			case BehaviorPackage.EMBEDDER_DEFINITION__THREADS:
				return getThreads();
			case BehaviorPackage.EMBEDDER_DEFINITION__META_FILTERS:
				return getMetaFilters();
			case BehaviorPackage.EMBEDDER_DEFINITION__NAME:
				return getName();
			case BehaviorPackage.EMBEDDER_DEFINITION__ID:
				return getId();
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
			case BehaviorPackage.EMBEDDER_DEFINITION__USING_STEPS:
				getUsingSteps().clear();
				getUsingSteps().addAll((Collection<? extends StepsImplementationClass>)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__STORIES_TO_RUN:
				getStoriesToRun().clear();
				getStoriesToRun().addAll((Collection<? extends Story>)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES:
				setGenerateViewAfterStories((Boolean)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES:
				setIgnoreFailureInStories((Boolean)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW:
				setIgnoreFailureInView((Boolean)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__VERBOSE_FAILURES:
				setVerboseFailures((Boolean)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS:
				setStoryTimeoutInSecs((Integer)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__THREADS:
				setThreads((Integer)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__META_FILTERS:
				setMetaFilters((String)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__ID:
				setId((Long)newValue);
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
			case BehaviorPackage.EMBEDDER_DEFINITION__USING_STEPS:
				getUsingSteps().clear();
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__STORIES_TO_RUN:
				getStoriesToRun().clear();
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES:
				setGenerateViewAfterStories(GENERATE_VIEW_AFTER_STORIES_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES:
				setIgnoreFailureInStories(IGNORE_FAILURE_IN_STORIES_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW:
				setIgnoreFailureInView(IGNORE_FAILURE_IN_VIEW_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__VERBOSE_FAILURES:
				setVerboseFailures(VERBOSE_FAILURES_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS:
				setStoryTimeoutInSecs(STORY_TIMEOUT_IN_SECS_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__THREADS:
				setThreads(THREADS_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__META_FILTERS:
				setMetaFilters(META_FILTERS_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.EMBEDDER_DEFINITION__ID:
				setId(ID_EDEFAULT);
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
			case BehaviorPackage.EMBEDDER_DEFINITION__USING_STEPS:
				return usingSteps != null && !usingSteps.isEmpty();
			case BehaviorPackage.EMBEDDER_DEFINITION__STORIES_TO_RUN:
				return storiesToRun != null && !storiesToRun.isEmpty();
			case BehaviorPackage.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES:
				return generateViewAfterStories != GENERATE_VIEW_AFTER_STORIES_EDEFAULT;
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES:
				return ignoreFailureInStories != IGNORE_FAILURE_IN_STORIES_EDEFAULT;
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW:
				return ignoreFailureInView != IGNORE_FAILURE_IN_VIEW_EDEFAULT;
			case BehaviorPackage.EMBEDDER_DEFINITION__VERBOSE_FAILURES:
				return verboseFailures != VERBOSE_FAILURES_EDEFAULT;
			case BehaviorPackage.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS:
				return storyTimeoutInSecs != STORY_TIMEOUT_IN_SECS_EDEFAULT;
			case BehaviorPackage.EMBEDDER_DEFINITION__THREADS:
				return threads != THREADS_EDEFAULT;
			case BehaviorPackage.EMBEDDER_DEFINITION__META_FILTERS:
				return META_FILTERS_EDEFAULT == null ? metaFilters != null : !META_FILTERS_EDEFAULT.equals(metaFilters);
			case BehaviorPackage.EMBEDDER_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.EMBEDDER_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generateViewAfterStories: ");
		result.append(generateViewAfterStories);
		result.append(", ignoreFailureInStories: ");
		result.append(ignoreFailureInStories);
		result.append(", ignoreFailureInView: ");
		result.append(ignoreFailureInView);
		result.append(", verboseFailures: ");
		result.append(verboseFailures);
		result.append(", storyTimeoutInSecs: ");
		result.append(storyTimeoutInSecs);
		result.append(", threads: ");
		result.append(threads);
		result.append(", metaFilters: ");
		result.append(metaFilters);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EmbedderDefinitionImpl
