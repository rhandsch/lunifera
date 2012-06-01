/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.KnowledgePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.behavior.BehaviorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.lunifera.metamodel'"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://c4biz.com/hawkdev/model/1.0/Behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl <em>Knowledge Container Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getKnowledgeContainerBehavior()
	 * @generated
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__NAME = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__DESCRIPTION = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Last Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__LAST_MODIFICATION = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__LAST_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__CREATION_DATE = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Project Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__PROJECT_CONTAINER = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__PROJECT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Tech Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__TECH_OWNER = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER__TECH_OWNER;

	/**
	 * The feature id for the '<em><b>Steps Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Embedders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behavior Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Knowledge Container Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_CONTAINER_BEHAVIOR_FEATURE_COUNT = KnowledgePackage.ABSTRACT_KNOWLEDGE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepsLibraryImpl <em>Steps Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepsLibraryImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepsLibrary()
	 * @generated
	 */
	int STEPS_LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_LIBRARY__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_LIBRARY__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_LIBRARY__IMPLEMENTATION_CLASSES = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_LIBRARY__STEPS = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Steps Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_LIBRARY_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.BehaviorBookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorBookImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getBehaviorBook()
	 * @generated
	 */
	int BEHAVIOR_BOOK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BOOK__NAME = CommonPackage.ABSTRACT_DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BOOK__DESCRIPTION = CommonPackage.ABSTRACT_DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Related Software Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BOOK__STORIES = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_BOOK_FEATURE_COUNT = CommonPackage.ABSTRACT_DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl <em>Embedder Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getEmbedderDefinition()
	 * @generated
	 */
	int EMBEDDER_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Using Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__USING_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Stories To Run</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__STORIES_TO_RUN = 1;

	/**
	 * The feature id for the '<em><b>Generate View After Stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES = 2;

	/**
	 * The feature id for the '<em><b>Ignore Failure In Stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES = 3;

	/**
	 * The feature id for the '<em><b>Ignore Failure In View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Verbose Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__VERBOSE_FAILURES = 5;

	/**
	 * The feature id for the '<em><b>Story Timeout In Secs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS = 6;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__THREADS = 7;

	/**
	 * The feature id for the '<em><b>Meta Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__META_FILTERS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__NAME = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION__ID = 10;

	/**
	 * The number of structural features of the '<em>Embedder Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_DEFINITION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl <em>Steps Implementation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepsImplementationClass()
	 * @generated
	 */
	int STEPS_IMPLEMENTATION_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_IMPLEMENTATION_CLASS__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_IMPLEMENTATION_CLASS__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_IMPLEMENTATION_CLASS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_IMPLEMENTATION_CLASS__ID = 4;

	/**
	 * The number of structural features of the '<em>Steps Implementation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_IMPLEMENTATION_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StoryImpl <em>Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StoryImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStory()
	 * @generated
	 */
	int STORY = 5;

	/**
	 * The feature id for the '<em><b>Behavior Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__BEHAVIOR_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Narrative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__NARRATIVE = 2;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__SCENARIOS = 3;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__META = 4;

	/**
	 * The feature id for the '<em><b>Import From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__IMPORT_FROM = 5;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__CREATION_DATE = 6;

	/**
	 * The number of structural features of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.MetaImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getMeta()
	 * @generated
	 */
	int META = 6;

	/**
	 * The feature id for the '<em><b>Meta Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__META_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.MetaPropertyImpl <em>Meta Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.MetaPropertyImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getMetaProperty()
	 * @generated
	 */
	int META_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meta Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.NarrativeImpl <em>Narrative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.NarrativeImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getNarrative()
	 * @generated
	 */
	int NARRATIVE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__ID = 0;

	/**
	 * The feature id for the '<em><b>As A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__AS_A = 1;

	/**
	 * The feature id for the '<em><b>IWant To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__IWANT_TO = 2;

	/**
	 * The feature id for the '<em><b>In Order To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__IN_ORDER_TO = 3;

	/**
	 * The number of structural features of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.InOrderToImpl <em>In Order To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.InOrderToImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getInOrderTo()
	 * @generated
	 */
	int IN_ORDER_TO = 9;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ORDER_TO__GOAL = 0;

	/**
	 * The number of structural features of the '<em>In Order To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ORDER_TO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.AsAImpl <em>As A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.AsAImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getAsA()
	 * @generated
	 */
	int AS_A = 10;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_A__BUSINESS_ROLES = 0;

	/**
	 * The number of structural features of the '<em>As A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_A_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.IWantToImpl <em>IWant To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.IWantToImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getIWantTo()
	 * @generated
	 */
	int IWANT_TO = 11;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWANT_TO__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>IWant To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWANT_TO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ScenarioImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 12;

	/**
	 * The feature id for the '<em><b>Story</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STORY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Given Stories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__GIVEN_STORIES = 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__EXAMPLES = 3;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEPS = 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.GivenStoriesImpl <em>Given Stories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.GivenStoriesImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getGivenStories()
	 * @generated
	 */
	int GIVEN_STORIES = 13;

	/**
	 * The feature id for the '<em><b>Story Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_STORIES__STORY_PATHS = 0;

	/**
	 * The number of structural features of the '<em>Given Stories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_STORIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StoryPathImpl <em>Story Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StoryPathImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStoryPath()
	 * @generated
	 */
	int STORY_PATH = 14;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATH__PATH = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATH__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Given Stories</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATH__GIVEN_STORIES = 2;

	/**
	 * The number of structural features of the '<em>Story Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableImpl <em>Examples Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTable()
	 * @generated
	 */
	int EXAMPLES_TABLE = 15;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE__ROWS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Examples Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableRowImpl <em>Examples Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableRowImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableRow()
	 * @generated
	 */
	int EXAMPLES_TABLE_ROW = 16;

	/**
	 * The feature id for the '<em><b>Example Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_ROW__EXAMPLE_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_ROW__CELLS = 1;

	/**
	 * The number of structural features of the '<em>Examples Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderImpl <em>Examples Table Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableHeader()
	 * @generated
	 */
	int EXAMPLES_TABLE_HEADER = 17;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_HEADER__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Examples Table Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_HEADER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExampleTableCellImpl <em>Example Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExampleTableCellImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExampleTableCell()
	 * @generated
	 */
	int EXAMPLE_TABLE_CELL = 18;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_CELL__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_CELL__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_CELL__ROW = 2;

	/**
	 * The number of structural features of the '<em>Example Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_CELL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SENTENCE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ANDS = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepSentenceImpl <em>Step Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepSentenceImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepSentence()
	 * @generated
	 */
	int STEP_SENTENCE = 20;

	/**
	 * The number of structural features of the '<em>Step Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_SENTENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ActionSentenceImpl <em>Action Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ActionSentenceImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getActionSentence()
	 * @generated
	 */
	int ACTION_SENTENCE = 21;

	/**
	 * The number of structural features of the '<em>Action Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SENTENCE_FEATURE_COUNT = STEP_SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ContextImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 22;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = STEP_SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExpectationImpl <em>Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExpectationImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExpectation()
	 * @generated
	 */
	int EXPECTATION = 23;

	/**
	 * The number of structural features of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_FEATURE_COUNT = STEP_SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.AndImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SENTENCE = STEP__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ANDS = STEP__ANDS;

	/**
	 * The feature id for the '<em><b>Step One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__STEP_ONE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.GivenImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getGiven()
	 * @generated
	 */
	int GIVEN = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__SENTENCE = STEP__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__ANDS = STEP__ANDS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__CONTEXT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.WhenImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__SENTENCE = STEP__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ANDS = STEP__ANDS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ACTION = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ThenImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getThen()
	 * @generated
	 */
	int THEN = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__SENTENCE = STEP__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__ANDS = STEP__ANDS;

	/**
	 * The feature id for the '<em><b>Expected Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__EXPECTED_OUTCOME = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepLinkImpl <em>Step Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepLinkImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepLink()
	 * @generated
	 */
	int STEP_LINK = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LINK__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LINK__SENTENCE = STEP__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LINK__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LINK__ANDS = STEP__ANDS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LINK__LINK = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LINK_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.GivenLinkImpl <em>Given Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.GivenLinkImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getGivenLink()
	 * @generated
	 */
	int GIVEN_LINK = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_LINK__NAME = STEP_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_LINK__SENTENCE = STEP_LINK__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_LINK__PARAMETERS = STEP_LINK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_LINK__ANDS = STEP_LINK__ANDS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_LINK__LINK = STEP_LINK__LINK;

	/**
	 * The number of structural features of the '<em>Given Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_LINK_FEATURE_COUNT = STEP_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.WhenLinkImpl <em>When Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.WhenLinkImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getWhenLink()
	 * @generated
	 */
	int WHEN_LINK = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__NAME = STEP_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__SENTENCE = STEP_LINK__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__PARAMETERS = STEP_LINK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__ANDS = STEP_LINK__ANDS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__LINK = STEP_LINK__LINK;

	/**
	 * The number of structural features of the '<em>When Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK_FEATURE_COUNT = STEP_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ThenLinkImpl <em>Then Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ThenLinkImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getThenLink()
	 * @generated
	 */
	int THEN_LINK = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_LINK__NAME = STEP_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_LINK__SENTENCE = STEP_LINK__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_LINK__PARAMETERS = STEP_LINK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_LINK__ANDS = STEP_LINK__ANDS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_LINK__LINK = STEP_LINK__LINK;

	/**
	 * The number of structural features of the '<em>Then Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_LINK_FEATURE_COUNT = STEP_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.AndLinkImpl <em>And Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.AndLinkImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getAndLink()
	 * @generated
	 */
	int AND_LINK = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_LINK__NAME = STEP_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_LINK__SENTENCE = STEP_LINK__SENTENCE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_LINK__PARAMETERS = STEP_LINK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_LINK__ANDS = STEP_LINK__ANDS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_LINK__LINK = STEP_LINK__LINK;

	/**
	 * The number of structural features of the '<em>And Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_LINK_FEATURE_COUNT = STEP_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StorySourceImpl <em>Story Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StorySourceImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStorySource()
	 * @generated
	 */
	int STORY_SOURCE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_SOURCE__URL = 1;

	/**
	 * The number of structural features of the '<em>Story Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepParameterImpl <em>Step Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepParameterImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepParameter()
	 * @generated
	 */
	int STEP_PARAMETER = 34;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Step Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.StepParameterKeyImpl <em>Step Parameter Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.StepParameterKeyImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepParameterKey()
	 * @generated
	 */
	int STEP_PARAMETER_KEY = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER_KEY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Step Parameter Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PARAMETER_KEY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableIgnorableSeparatorImpl <em>Examples Table Ignorable Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableIgnorableSeparatorImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableIgnorableSeparator()
	 * @generated
	 */
	int EXAMPLES_TABLE_IGNORABLE_SEPARATOR = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_IGNORABLE_SEPARATOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Examples Table Ignorable Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_IGNORABLE_SEPARATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableColumnSeparatorImpl <em>Examples Table Column Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableColumnSeparatorImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableColumnSeparator()
	 * @generated
	 */
	int EXAMPLES_TABLE_COLUMN_SEPARATOR = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_COLUMN_SEPARATOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Examples Table Column Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_COLUMN_SEPARATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableValueSeparatorImpl <em>Examples Table Value Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableValueSeparatorImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableValueSeparator()
	 * @generated
	 */
	int EXAMPLES_TABLE_VALUE_SEPARATOR = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_VALUE_SEPARATOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Examples Table Value Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_VALUE_SEPARATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderSeparatorImpl <em>Examples Table Header Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderSeparatorImpl
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableHeaderSeparator()
	 * @generated
	 */
	int EXAMPLES_TABLE_HEADER_SEPARATOR = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_HEADER_SEPARATOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Examples Table Header Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_TABLE_HEADER_SEPARATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.metamodel.behavior.ImplementationLanguage <em>Implementation Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.metamodel.behavior.ImplementationLanguage
	 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getImplementationLanguage()
	 * @generated
	 */
	int IMPLEMENTATION_LANGUAGE = 40;


	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior <em>Knowledge Container Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Container Behavior</em>'.
	 * @see org.lunifera.metamodel.behavior.KnowledgeContainerBehavior
	 * @generated
	 */
	EClass getKnowledgeContainerBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getStepsLibraries <em>Steps Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps Libraries</em>'.
	 * @see org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getStepsLibraries()
	 * @see #getKnowledgeContainerBehavior()
	 * @generated
	 */
	EReference getKnowledgeContainerBehavior_StepsLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getEmbedders <em>Embedders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedders</em>'.
	 * @see org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getEmbedders()
	 * @see #getKnowledgeContainerBehavior()
	 * @generated
	 */
	EReference getKnowledgeContainerBehavior_Embedders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getBehaviorBooks <em>Behavior Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Books</em>'.
	 * @see org.lunifera.metamodel.behavior.KnowledgeContainerBehavior#getBehaviorBooks()
	 * @see #getKnowledgeContainerBehavior()
	 * @generated
	 */
	EReference getKnowledgeContainerBehavior_BehaviorBooks();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StepsLibrary <em>Steps Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps Library</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsLibrary
	 * @generated
	 */
	EClass getStepsLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.StepsLibrary#getImplementationClasses <em>Implementation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Classes</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsLibrary#getImplementationClasses()
	 * @see #getStepsLibrary()
	 * @generated
	 */
	EReference getStepsLibrary_ImplementationClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.StepsLibrary#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsLibrary#getSteps()
	 * @see #getStepsLibrary()
	 * @generated
	 */
	EReference getStepsLibrary_Steps();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.BehaviorBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.lunifera.metamodel.behavior.BehaviorBook
	 * @generated
	 */
	EClass getBehaviorBook();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.BehaviorBook#getRelatedSoftwareComponent <em>Related Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Software Component</em>'.
	 * @see org.lunifera.metamodel.behavior.BehaviorBook#getRelatedSoftwareComponent()
	 * @see #getBehaviorBook()
	 * @generated
	 */
	EReference getBehaviorBook_RelatedSoftwareComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.BehaviorBook#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stories</em>'.
	 * @see org.lunifera.metamodel.behavior.BehaviorBook#getStories()
	 * @see #getBehaviorBook()
	 * @generated
	 */
	EReference getBehaviorBook_Stories();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.EmbedderDefinition <em>Embedder Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedder Definition</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition
	 * @generated
	 */
	EClass getEmbedderDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getUsingSteps <em>Using Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Using Steps</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getUsingSteps()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EReference getEmbedderDefinition_UsingSteps();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getStoriesToRun <em>Stories To Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stories To Run</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getStoriesToRun()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EReference getEmbedderDefinition_StoriesToRun();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isGenerateViewAfterStories <em>Generate View After Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate View After Stories</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#isGenerateViewAfterStories()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_GenerateViewAfterStories();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInStories <em>Ignore Failure In Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Failure In Stories</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInStories()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_IgnoreFailureInStories();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInView <em>Ignore Failure In View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Failure In View</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#isIgnoreFailureInView()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_IgnoreFailureInView();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#isVerboseFailures <em>Verbose Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbose Failures</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#isVerboseFailures()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_VerboseFailures();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getStoryTimeoutInSecs <em>Story Timeout In Secs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Story Timeout In Secs</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getStoryTimeoutInSecs()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_StoryTimeoutInSecs();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threads</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getThreads()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_Threads();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getMetaFilters <em>Meta Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Filters</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getMetaFilters()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_MetaFilters();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getName()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.EmbedderDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition#getId()
	 * @see #getEmbedderDefinition()
	 * @generated
	 */
	EAttribute getEmbedderDefinition_Id();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StepsImplementationClass <em>Steps Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps Implementation Class</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass
	 * @generated
	 */
	EClass getStepsImplementationClass();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass#getLibrary()
	 * @see #getStepsImplementationClass()
	 * @generated
	 */
	EReference getStepsImplementationClass_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass#getLanguage()
	 * @see #getStepsImplementationClass()
	 * @generated
	 */
	EAttribute getStepsImplementationClass_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass#getName()
	 * @see #getStepsImplementationClass()
	 * @generated
	 */
	EAttribute getStepsImplementationClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getProjectPath <em>Project Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Path</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass#getProjectPath()
	 * @see #getStepsImplementationClass()
	 * @generated
	 */
	EAttribute getStepsImplementationClass_ProjectPath();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepsImplementationClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass#getId()
	 * @see #getStepsImplementationClass()
	 * @generated
	 */
	EAttribute getStepsImplementationClass_Id();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story</em>'.
	 * @see org.lunifera.metamodel.behavior.Story
	 * @generated
	 */
	EClass getStory();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.Story#getBehaviorModel <em>Behavior Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Model</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getBehaviorModel()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_BehaviorModel();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.Story#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getDescription()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Story#getNarrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Narrative</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getNarrative()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_Narrative();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.Story#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getScenarios()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_Scenarios();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Story#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getMeta()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_Meta();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.Story#getImportFrom <em>Import From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import From</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getImportFrom()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_ImportFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.Story#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.lunifera.metamodel.behavior.Story#getCreationDate()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_CreationDate();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.lunifera.metamodel.behavior.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.Meta#getMetaItems <em>Meta Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Items</em>'.
	 * @see org.lunifera.metamodel.behavior.Meta#getMetaItems()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_MetaItems();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.MetaProperty <em>Meta Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Property</em>'.
	 * @see org.lunifera.metamodel.behavior.MetaProperty
	 * @generated
	 */
	EClass getMetaProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.MetaProperty#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.lunifera.metamodel.behavior.MetaProperty#getCode()
	 * @see #getMetaProperty()
	 * @generated
	 */
	EAttribute getMetaProperty_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.MetaProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.MetaProperty#getValue()
	 * @see #getMetaProperty()
	 * @generated
	 */
	EAttribute getMetaProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative</em>'.
	 * @see org.lunifera.metamodel.behavior.Narrative
	 * @generated
	 */
	EClass getNarrative();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.Narrative#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.metamodel.behavior.Narrative#getId()
	 * @see #getNarrative()
	 * @generated
	 */
	EAttribute getNarrative_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Narrative#getAsA <em>As A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>As A</em>'.
	 * @see org.lunifera.metamodel.behavior.Narrative#getAsA()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_AsA();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Narrative#getIWantTo <em>IWant To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IWant To</em>'.
	 * @see org.lunifera.metamodel.behavior.Narrative#getIWantTo()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_IWantTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Narrative#getInOrderTo <em>In Order To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Order To</em>'.
	 * @see org.lunifera.metamodel.behavior.Narrative#getInOrderTo()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_InOrderTo();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.InOrderTo <em>In Order To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Order To</em>'.
	 * @see org.lunifera.metamodel.behavior.InOrderTo
	 * @generated
	 */
	EClass getInOrderTo();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.InOrderTo#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see org.lunifera.metamodel.behavior.InOrderTo#getGoal()
	 * @see #getInOrderTo()
	 * @generated
	 */
	EAttribute getInOrderTo_Goal();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.AsA <em>As A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As A</em>'.
	 * @see org.lunifera.metamodel.behavior.AsA
	 * @generated
	 */
	EClass getAsA();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.metamodel.behavior.AsA#getBusinessRoles <em>Business Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Business Roles</em>'.
	 * @see org.lunifera.metamodel.behavior.AsA#getBusinessRoles()
	 * @see #getAsA()
	 * @generated
	 */
	EAttribute getAsA_BusinessRoles();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.IWantTo <em>IWant To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWant To</em>'.
	 * @see org.lunifera.metamodel.behavior.IWantTo
	 * @generated
	 */
	EClass getIWantTo();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.IWantTo#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement</em>'.
	 * @see org.lunifera.metamodel.behavior.IWantTo#getRequirement()
	 * @see #getIWantTo()
	 * @generated
	 */
	EAttribute getIWantTo_Requirement();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.lunifera.metamodel.behavior.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.behavior.Scenario#getStory <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Story</em>'.
	 * @see org.lunifera.metamodel.behavior.Scenario#getStory()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Story();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.Scenario#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.lunifera.metamodel.behavior.Scenario#getTitle()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Scenario#getGivenStories <em>Given Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Given Stories</em>'.
	 * @see org.lunifera.metamodel.behavior.Scenario#getGivenStories()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_GivenStories();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Scenario#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examples</em>'.
	 * @see org.lunifera.metamodel.behavior.Scenario#getExamples()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Examples();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.Scenario#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.lunifera.metamodel.behavior.Scenario#getSteps()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Steps();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.GivenStories <em>Given Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given Stories</em>'.
	 * @see org.lunifera.metamodel.behavior.GivenStories
	 * @generated
	 */
	EClass getGivenStories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.GivenStories#getStoryPaths <em>Story Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Story Paths</em>'.
	 * @see org.lunifera.metamodel.behavior.GivenStories#getStoryPaths()
	 * @see #getGivenStories()
	 * @generated
	 */
	EReference getGivenStories_StoryPaths();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StoryPath <em>Story Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Path</em>'.
	 * @see org.lunifera.metamodel.behavior.StoryPath
	 * @generated
	 */
	EClass getStoryPath();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StoryPath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.lunifera.metamodel.behavior.StoryPath#getPath()
	 * @see #getStoryPath()
	 * @generated
	 */
	EAttribute getStoryPath_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.metamodel.behavior.StoryPath#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.lunifera.metamodel.behavior.StoryPath#getParameters()
	 * @see #getStoryPath()
	 * @generated
	 */
	EAttribute getStoryPath_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.behavior.StoryPath#getGivenStories <em>Given Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Given Stories</em>'.
	 * @see org.lunifera.metamodel.behavior.StoryPath#getGivenStories()
	 * @see #getStoryPath()
	 * @generated
	 */
	EReference getStoryPath_GivenStories();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTable <em>Examples Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTable
	 * @generated
	 */
	EClass getExamplesTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.ExamplesTable#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTable#getHeader()
	 * @see #getExamplesTable()
	 * @generated
	 */
	EReference getExamplesTable_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.ExamplesTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTable#getRows()
	 * @see #getExamplesTable()
	 * @generated
	 */
	EReference getExamplesTable_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExamplesTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTable#getName()
	 * @see #getExamplesTable()
	 * @generated
	 */
	EAttribute getExamplesTable_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTableRow <em>Examples Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table Row</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableRow
	 * @generated
	 */
	EClass getExamplesTableRow();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Example Table</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableRow#getExampleTable()
	 * @see #getExamplesTableRow()
	 * @generated
	 */
	EReference getExamplesTableRow_ExampleTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.ExamplesTableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableRow#getCells()
	 * @see #getExamplesTableRow()
	 * @generated
	 */
	EReference getExamplesTableRow_Cells();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTableHeader <em>Examples Table Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table Header</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableHeader
	 * @generated
	 */
	EClass getExamplesTableHeader();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.metamodel.behavior.ExamplesTableHeader#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableHeader#getColumns()
	 * @see #getExamplesTableHeader()
	 * @generated
	 */
	EAttribute getExamplesTableHeader_Columns();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExampleTableCell <em>Example Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Table Cell</em>'.
	 * @see org.lunifera.metamodel.behavior.ExampleTableCell
	 * @generated
	 */
	EClass getExampleTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.lunifera.metamodel.behavior.ExampleTableCell#getColumnName()
	 * @see #getExampleTableCell()
	 * @generated
	 */
	EAttribute getExampleTableCell_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.ExampleTableCell#getValue()
	 * @see #getExampleTableCell()
	 * @generated
	 */
	EAttribute getExampleTableCell_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.metamodel.behavior.ExampleTableCell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see org.lunifera.metamodel.behavior.ExampleTableCell#getRow()
	 * @see #getExampleTableCell()
	 * @generated
	 */
	EReference getExampleTableCell_Row();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.lunifera.metamodel.behavior.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.metamodel.behavior.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.behavior.Step#getSentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sentence</em>'.
	 * @see org.lunifera.metamodel.behavior.Step#getSentence()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Sentence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.Step#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.lunifera.metamodel.behavior.Step#getParameters()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.behavior.Step#getAnds <em>Ands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ands</em>'.
	 * @see org.lunifera.metamodel.behavior.Step#getAnds()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Ands();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StepSentence <em>Step Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Sentence</em>'.
	 * @see org.lunifera.metamodel.behavior.StepSentence
	 * @generated
	 */
	EClass getStepSentence();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Sentence</em>'.
	 * @see org.lunifera.metamodel.behavior.ActionSentence
	 * @generated
	 */
	EClass getActionSentence();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.lunifera.metamodel.behavior.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expectation</em>'.
	 * @see org.lunifera.metamodel.behavior.Expectation
	 * @generated
	 */
	EClass getExpectation();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.lunifera.metamodel.behavior.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.And#getStepOne <em>Step One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step One</em>'.
	 * @see org.lunifera.metamodel.behavior.And#getStepOne()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_StepOne();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see org.lunifera.metamodel.behavior.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.Given#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.lunifera.metamodel.behavior.Given#getContext()
	 * @see #getGiven()
	 * @generated
	 */
	EReference getGiven_Context();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see org.lunifera.metamodel.behavior.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.When#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.lunifera.metamodel.behavior.When#getAction()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Action();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see org.lunifera.metamodel.behavior.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.Then#getExpectedOutcome <em>Expected Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Outcome</em>'.
	 * @see org.lunifera.metamodel.behavior.Then#getExpectedOutcome()
	 * @see #getThen()
	 * @generated
	 */
	EReference getThen_ExpectedOutcome();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StepLink <em>Step Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Link</em>'.
	 * @see org.lunifera.metamodel.behavior.StepLink
	 * @generated
	 */
	EClass getStepLink();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.StepLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.lunifera.metamodel.behavior.StepLink#getLink()
	 * @see #getStepLink()
	 * @generated
	 */
	EReference getStepLink_Link();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.GivenLink <em>Given Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given Link</em>'.
	 * @see org.lunifera.metamodel.behavior.GivenLink
	 * @generated
	 */
	EClass getGivenLink();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.WhenLink <em>When Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Link</em>'.
	 * @see org.lunifera.metamodel.behavior.WhenLink
	 * @generated
	 */
	EClass getWhenLink();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ThenLink <em>Then Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then Link</em>'.
	 * @see org.lunifera.metamodel.behavior.ThenLink
	 * @generated
	 */
	EClass getThenLink();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.AndLink <em>And Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Link</em>'.
	 * @see org.lunifera.metamodel.behavior.AndLink
	 * @generated
	 */
	EClass getAndLink();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StorySource <em>Story Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Source</em>'.
	 * @see org.lunifera.metamodel.behavior.StorySource
	 * @generated
	 */
	EClass getStorySource();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StorySource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.metamodel.behavior.StorySource#getName()
	 * @see #getStorySource()
	 * @generated
	 */
	EAttribute getStorySource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StorySource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.lunifera.metamodel.behavior.StorySource#getUrl()
	 * @see #getStorySource()
	 * @generated
	 */
	EAttribute getStorySource_Url();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StepParameter <em>Step Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Parameter</em>'.
	 * @see org.lunifera.metamodel.behavior.StepParameter
	 * @generated
	 */
	EClass getStepParameter();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.metamodel.behavior.StepParameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see org.lunifera.metamodel.behavior.StepParameter#getKey()
	 * @see #getStepParameter()
	 * @generated
	 */
	EReference getStepParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.metamodel.behavior.StepParameter#getType()
	 * @see #getStepParameter()
	 * @generated
	 */
	EAttribute getStepParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.StepParameter#getValue()
	 * @see #getStepParameter()
	 * @generated
	 */
	EAttribute getStepParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.StepParameterKey <em>Step Parameter Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Parameter Key</em>'.
	 * @see org.lunifera.metamodel.behavior.StepParameterKey
	 * @generated
	 */
	EClass getStepParameterKey();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.StepParameterKey#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.StepParameterKey#getValue()
	 * @see #getStepParameterKey()
	 * @generated
	 */
	EAttribute getStepParameterKey_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator <em>Examples Table Ignorable Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table Ignorable Separator</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator
	 * @generated
	 */
	EClass getExamplesTableIgnorableSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator#getValue()
	 * @see #getExamplesTableIgnorableSeparator()
	 * @generated
	 */
	EAttribute getExamplesTableIgnorableSeparator_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator <em>Examples Table Column Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table Column Separator</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator
	 * @generated
	 */
	EClass getExamplesTableColumnSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator#getValue()
	 * @see #getExamplesTableColumnSeparator()
	 * @generated
	 */
	EAttribute getExamplesTableColumnSeparator_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTableValueSeparator <em>Examples Table Value Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table Value Separator</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableValueSeparator
	 * @generated
	 */
	EClass getExamplesTableValueSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExamplesTableValueSeparator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableValueSeparator#getValue()
	 * @see #getExamplesTableValueSeparator()
	 * @generated
	 */
	EAttribute getExamplesTableValueSeparator_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator <em>Examples Table Header Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Table Header Separator</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator
	 * @generated
	 */
	EClass getExamplesTableHeaderSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator#getValue()
	 * @see #getExamplesTableHeaderSeparator()
	 * @generated
	 */
	EAttribute getExamplesTableHeaderSeparator_Value();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.metamodel.behavior.ImplementationLanguage <em>Implementation Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Language</em>'.
	 * @see org.lunifera.metamodel.behavior.ImplementationLanguage
	 * @generated
	 */
	EEnum getImplementationLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl <em>Knowledge Container Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.KnowledgeContainerBehaviorImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getKnowledgeContainerBehavior()
		 * @generated
		 */
		EClass KNOWLEDGE_CONTAINER_BEHAVIOR = eINSTANCE.getKnowledgeContainerBehavior();

		/**
		 * The meta object literal for the '<em><b>Steps Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES = eINSTANCE.getKnowledgeContainerBehavior_StepsLibraries();

		/**
		 * The meta object literal for the '<em><b>Embedders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS = eINSTANCE.getKnowledgeContainerBehavior_Embedders();

		/**
		 * The meta object literal for the '<em><b>Behavior Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS = eINSTANCE.getKnowledgeContainerBehavior_BehaviorBooks();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepsLibraryImpl <em>Steps Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepsLibraryImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepsLibrary()
		 * @generated
		 */
		EClass STEPS_LIBRARY = eINSTANCE.getStepsLibrary();

		/**
		 * The meta object literal for the '<em><b>Implementation Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS_LIBRARY__IMPLEMENTATION_CLASSES = eINSTANCE.getStepsLibrary_ImplementationClasses();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS_LIBRARY__STEPS = eINSTANCE.getStepsLibrary_Steps();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.BehaviorBookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorBookImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getBehaviorBook()
		 * @generated
		 */
		EClass BEHAVIOR_BOOK = eINSTANCE.getBehaviorBook();

		/**
		 * The meta object literal for the '<em><b>Related Software Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT = eINSTANCE.getBehaviorBook_RelatedSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_BOOK__STORIES = eINSTANCE.getBehaviorBook_Stories();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl <em>Embedder Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.EmbedderDefinitionImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getEmbedderDefinition()
		 * @generated
		 */
		EClass EMBEDDER_DEFINITION = eINSTANCE.getEmbedderDefinition();

		/**
		 * The meta object literal for the '<em><b>Using Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER_DEFINITION__USING_STEPS = eINSTANCE.getEmbedderDefinition_UsingSteps();

		/**
		 * The meta object literal for the '<em><b>Stories To Run</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER_DEFINITION__STORIES_TO_RUN = eINSTANCE.getEmbedderDefinition_StoriesToRun();

		/**
		 * The meta object literal for the '<em><b>Generate View After Stories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES = eINSTANCE.getEmbedderDefinition_GenerateViewAfterStories();

		/**
		 * The meta object literal for the '<em><b>Ignore Failure In Stories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES = eINSTANCE.getEmbedderDefinition_IgnoreFailureInStories();

		/**
		 * The meta object literal for the '<em><b>Ignore Failure In View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW = eINSTANCE.getEmbedderDefinition_IgnoreFailureInView();

		/**
		 * The meta object literal for the '<em><b>Verbose Failures</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__VERBOSE_FAILURES = eINSTANCE.getEmbedderDefinition_VerboseFailures();

		/**
		 * The meta object literal for the '<em><b>Story Timeout In Secs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS = eINSTANCE.getEmbedderDefinition_StoryTimeoutInSecs();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__THREADS = eINSTANCE.getEmbedderDefinition_Threads();

		/**
		 * The meta object literal for the '<em><b>Meta Filters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__META_FILTERS = eINSTANCE.getEmbedderDefinition_MetaFilters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__NAME = eINSTANCE.getEmbedderDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDER_DEFINITION__ID = eINSTANCE.getEmbedderDefinition_Id();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl <em>Steps Implementation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepsImplementationClassImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepsImplementationClass()
		 * @generated
		 */
		EClass STEPS_IMPLEMENTATION_CLASS = eINSTANCE.getStepsImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS_IMPLEMENTATION_CLASS__LIBRARY = eINSTANCE.getStepsImplementationClass_Library();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPS_IMPLEMENTATION_CLASS__LANGUAGE = eINSTANCE.getStepsImplementationClass_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPS_IMPLEMENTATION_CLASS__NAME = eINSTANCE.getStepsImplementationClass_Name();

		/**
		 * The meta object literal for the '<em><b>Project Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH = eINSTANCE.getStepsImplementationClass_ProjectPath();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPS_IMPLEMENTATION_CLASS__ID = eINSTANCE.getStepsImplementationClass_Id();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StoryImpl <em>Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StoryImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStory()
		 * @generated
		 */
		EClass STORY = eINSTANCE.getStory();

		/**
		 * The meta object literal for the '<em><b>Behavior Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__BEHAVIOR_MODEL = eINSTANCE.getStory_BehaviorModel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__DESCRIPTION = eINSTANCE.getStory_Description();

		/**
		 * The meta object literal for the '<em><b>Narrative</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__NARRATIVE = eINSTANCE.getStory_Narrative();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__SCENARIOS = eINSTANCE.getStory_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__META = eINSTANCE.getStory_Meta();

		/**
		 * The meta object literal for the '<em><b>Import From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__IMPORT_FROM = eINSTANCE.getStory_ImportFrom();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__CREATION_DATE = eINSTANCE.getStory_CreationDate();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.MetaImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Meta Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__META_ITEMS = eINSTANCE.getMeta_MetaItems();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.MetaPropertyImpl <em>Meta Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.MetaPropertyImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getMetaProperty()
		 * @generated
		 */
		EClass META_PROPERTY = eINSTANCE.getMetaProperty();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_PROPERTY__CODE = eINSTANCE.getMetaProperty_Code();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_PROPERTY__VALUE = eINSTANCE.getMetaProperty_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.NarrativeImpl <em>Narrative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.NarrativeImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getNarrative()
		 * @generated
		 */
		EClass NARRATIVE = eINSTANCE.getNarrative();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NARRATIVE__ID = eINSTANCE.getNarrative_Id();

		/**
		 * The meta object literal for the '<em><b>As A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__AS_A = eINSTANCE.getNarrative_AsA();

		/**
		 * The meta object literal for the '<em><b>IWant To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__IWANT_TO = eINSTANCE.getNarrative_IWantTo();

		/**
		 * The meta object literal for the '<em><b>In Order To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__IN_ORDER_TO = eINSTANCE.getNarrative_InOrderTo();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.InOrderToImpl <em>In Order To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.InOrderToImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getInOrderTo()
		 * @generated
		 */
		EClass IN_ORDER_TO = eINSTANCE.getInOrderTo();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_ORDER_TO__GOAL = eINSTANCE.getInOrderTo_Goal();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.AsAImpl <em>As A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.AsAImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getAsA()
		 * @generated
		 */
		EClass AS_A = eINSTANCE.getAsA();

		/**
		 * The meta object literal for the '<em><b>Business Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS_A__BUSINESS_ROLES = eINSTANCE.getAsA_BusinessRoles();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.IWantToImpl <em>IWant To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.IWantToImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getIWantTo()
		 * @generated
		 */
		EClass IWANT_TO = eINSTANCE.getIWantTo();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IWANT_TO__REQUIREMENT = eINSTANCE.getIWantTo_Requirement();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ScenarioImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Story</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STORY = eINSTANCE.getScenario_Story();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TITLE = eINSTANCE.getScenario_Title();

		/**
		 * The meta object literal for the '<em><b>Given Stories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__GIVEN_STORIES = eINSTANCE.getScenario_GivenStories();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__EXAMPLES = eINSTANCE.getScenario_Examples();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.GivenStoriesImpl <em>Given Stories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.GivenStoriesImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getGivenStories()
		 * @generated
		 */
		EClass GIVEN_STORIES = eINSTANCE.getGivenStories();

		/**
		 * The meta object literal for the '<em><b>Story Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVEN_STORIES__STORY_PATHS = eINSTANCE.getGivenStories_StoryPaths();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StoryPathImpl <em>Story Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StoryPathImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStoryPath()
		 * @generated
		 */
		EClass STORY_PATH = eINSTANCE.getStoryPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATH__PATH = eINSTANCE.getStoryPath_Path();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATH__PARAMETERS = eINSTANCE.getStoryPath_Parameters();

		/**
		 * The meta object literal for the '<em><b>Given Stories</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATH__GIVEN_STORIES = eINSTANCE.getStoryPath_GivenStories();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableImpl <em>Examples Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTable()
		 * @generated
		 */
		EClass EXAMPLES_TABLE = eINSTANCE.getExamplesTable();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLES_TABLE__HEADER = eINSTANCE.getExamplesTable_Header();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLES_TABLE__ROWS = eINSTANCE.getExamplesTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES_TABLE__NAME = eINSTANCE.getExamplesTable_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableRowImpl <em>Examples Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableRowImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableRow()
		 * @generated
		 */
		EClass EXAMPLES_TABLE_ROW = eINSTANCE.getExamplesTableRow();

		/**
		 * The meta object literal for the '<em><b>Example Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLES_TABLE_ROW__EXAMPLE_TABLE = eINSTANCE.getExamplesTableRow_ExampleTable();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLES_TABLE_ROW__CELLS = eINSTANCE.getExamplesTableRow_Cells();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderImpl <em>Examples Table Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableHeader()
		 * @generated
		 */
		EClass EXAMPLES_TABLE_HEADER = eINSTANCE.getExamplesTableHeader();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES_TABLE_HEADER__COLUMNS = eINSTANCE.getExamplesTableHeader_Columns();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExampleTableCellImpl <em>Example Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExampleTableCellImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExampleTableCell()
		 * @generated
		 */
		EClass EXAMPLE_TABLE_CELL = eINSTANCE.getExampleTableCell();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TABLE_CELL__COLUMN_NAME = eINSTANCE.getExampleTableCell_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TABLE_CELL__VALUE = eINSTANCE.getExampleTableCell_Value();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE_CELL__ROW = eINSTANCE.getExampleTableCell_Row();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SENTENCE = eINSTANCE.getStep_Sentence();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARAMETERS = eINSTANCE.getStep_Parameters();

		/**
		 * The meta object literal for the '<em><b>Ands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ANDS = eINSTANCE.getStep_Ands();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepSentenceImpl <em>Step Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepSentenceImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepSentence()
		 * @generated
		 */
		EClass STEP_SENTENCE = eINSTANCE.getStepSentence();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ActionSentenceImpl <em>Action Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ActionSentenceImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getActionSentence()
		 * @generated
		 */
		EClass ACTION_SENTENCE = eINSTANCE.getActionSentence();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ContextImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExpectationImpl <em>Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExpectationImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExpectation()
		 * @generated
		 */
		EClass EXPECTATION = eINSTANCE.getExpectation();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.AndImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Step One</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__STEP_ONE = eINSTANCE.getAnd_StepOne();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.GivenImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVEN__CONTEXT = eINSTANCE.getGiven_Context();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.WhenImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__ACTION = eINSTANCE.getWhen_Action();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ThenImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '<em><b>Expected Outcome</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEN__EXPECTED_OUTCOME = eINSTANCE.getThen_ExpectedOutcome();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepLinkImpl <em>Step Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepLinkImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepLink()
		 * @generated
		 */
		EClass STEP_LINK = eINSTANCE.getStepLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_LINK__LINK = eINSTANCE.getStepLink_Link();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.GivenLinkImpl <em>Given Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.GivenLinkImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getGivenLink()
		 * @generated
		 */
		EClass GIVEN_LINK = eINSTANCE.getGivenLink();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.WhenLinkImpl <em>When Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.WhenLinkImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getWhenLink()
		 * @generated
		 */
		EClass WHEN_LINK = eINSTANCE.getWhenLink();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ThenLinkImpl <em>Then Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ThenLinkImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getThenLink()
		 * @generated
		 */
		EClass THEN_LINK = eINSTANCE.getThenLink();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.AndLinkImpl <em>And Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.AndLinkImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getAndLink()
		 * @generated
		 */
		EClass AND_LINK = eINSTANCE.getAndLink();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StorySourceImpl <em>Story Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StorySourceImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStorySource()
		 * @generated
		 */
		EClass STORY_SOURCE = eINSTANCE.getStorySource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_SOURCE__NAME = eINSTANCE.getStorySource_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_SOURCE__URL = eINSTANCE.getStorySource_Url();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepParameterImpl <em>Step Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepParameterImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepParameter()
		 * @generated
		 */
		EClass STEP_PARAMETER = eINSTANCE.getStepParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_PARAMETER__KEY = eINSTANCE.getStepParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_PARAMETER__TYPE = eINSTANCE.getStepParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_PARAMETER__VALUE = eINSTANCE.getStepParameter_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.StepParameterKeyImpl <em>Step Parameter Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.StepParameterKeyImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getStepParameterKey()
		 * @generated
		 */
		EClass STEP_PARAMETER_KEY = eINSTANCE.getStepParameterKey();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_PARAMETER_KEY__VALUE = eINSTANCE.getStepParameterKey_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableIgnorableSeparatorImpl <em>Examples Table Ignorable Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableIgnorableSeparatorImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableIgnorableSeparator()
		 * @generated
		 */
		EClass EXAMPLES_TABLE_IGNORABLE_SEPARATOR = eINSTANCE.getExamplesTableIgnorableSeparator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES_TABLE_IGNORABLE_SEPARATOR__VALUE = eINSTANCE.getExamplesTableIgnorableSeparator_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableColumnSeparatorImpl <em>Examples Table Column Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableColumnSeparatorImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableColumnSeparator()
		 * @generated
		 */
		EClass EXAMPLES_TABLE_COLUMN_SEPARATOR = eINSTANCE.getExamplesTableColumnSeparator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES_TABLE_COLUMN_SEPARATOR__VALUE = eINSTANCE.getExamplesTableColumnSeparator_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableValueSeparatorImpl <em>Examples Table Value Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableValueSeparatorImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableValueSeparator()
		 * @generated
		 */
		EClass EXAMPLES_TABLE_VALUE_SEPARATOR = eINSTANCE.getExamplesTableValueSeparator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES_TABLE_VALUE_SEPARATOR__VALUE = eINSTANCE.getExamplesTableValueSeparator_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderSeparatorImpl <em>Examples Table Header Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.impl.ExamplesTableHeaderSeparatorImpl
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getExamplesTableHeaderSeparator()
		 * @generated
		 */
		EClass EXAMPLES_TABLE_HEADER_SEPARATOR = eINSTANCE.getExamplesTableHeaderSeparator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLES_TABLE_HEADER_SEPARATOR__VALUE = eINSTANCE.getExamplesTableHeaderSeparator_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.metamodel.behavior.ImplementationLanguage <em>Implementation Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.metamodel.behavior.ImplementationLanguage
		 * @see org.lunifera.metamodel.behavior.impl.BehaviorPackageImpl#getImplementationLanguage()
		 * @generated
		 */
		EEnum IMPLEMENTATION_LANGUAGE = eINSTANCE.getImplementationLanguage();

	}

} //BehaviorPackage
