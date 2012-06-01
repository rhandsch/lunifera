/**
 */
package org.lunifera.metamodel.behavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.behavior.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFactory init() {
		try {
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory("http://lunifera.org/metamodel/1.0/Behavior"); 
			if (theBehaviorFactory != null) {
				return theBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR: return createKnowledgeContainerBehavior();
			case BehaviorPackage.STEPS_LIBRARY: return createStepsLibrary();
			case BehaviorPackage.BEHAVIOR_BOOK: return createBehaviorBook();
			case BehaviorPackage.EMBEDDER_DEFINITION: return createEmbedderDefinition();
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS: return createStepsImplementationClass();
			case BehaviorPackage.STORY: return createStory();
			case BehaviorPackage.META: return createMeta();
			case BehaviorPackage.META_PROPERTY: return createMetaProperty();
			case BehaviorPackage.NARRATIVE: return createNarrative();
			case BehaviorPackage.IN_ORDER_TO: return createInOrderTo();
			case BehaviorPackage.AS_A: return createAsA();
			case BehaviorPackage.IWANT_TO: return createIWantTo();
			case BehaviorPackage.SCENARIO: return createScenario();
			case BehaviorPackage.GIVEN_STORIES: return createGivenStories();
			case BehaviorPackage.STORY_PATH: return createStoryPath();
			case BehaviorPackage.EXAMPLES_TABLE: return createExamplesTable();
			case BehaviorPackage.EXAMPLES_TABLE_ROW: return createExamplesTableRow();
			case BehaviorPackage.EXAMPLES_TABLE_HEADER: return createExamplesTableHeader();
			case BehaviorPackage.EXAMPLE_TABLE_CELL: return createExampleTableCell();
			case BehaviorPackage.STEP_SENTENCE: return createStepSentence();
			case BehaviorPackage.ACTION_SENTENCE: return createActionSentence();
			case BehaviorPackage.CONTEXT: return createContext();
			case BehaviorPackage.EXPECTATION: return createExpectation();
			case BehaviorPackage.AND: return createAnd();
			case BehaviorPackage.GIVEN: return createGiven();
			case BehaviorPackage.WHEN: return createWhen();
			case BehaviorPackage.THEN: return createThen();
			case BehaviorPackage.STEP_LINK: return createStepLink();
			case BehaviorPackage.GIVEN_LINK: return createGivenLink();
			case BehaviorPackage.WHEN_LINK: return createWhenLink();
			case BehaviorPackage.THEN_LINK: return createThenLink();
			case BehaviorPackage.AND_LINK: return createAndLink();
			case BehaviorPackage.STORY_SOURCE: return createStorySource();
			case BehaviorPackage.STEP_PARAMETER: return createStepParameter();
			case BehaviorPackage.STEP_PARAMETER_KEY: return createStepParameterKey();
			case BehaviorPackage.EXAMPLES_TABLE_IGNORABLE_SEPARATOR: return createExamplesTableIgnorableSeparator();
			case BehaviorPackage.EXAMPLES_TABLE_COLUMN_SEPARATOR: return createExamplesTableColumnSeparator();
			case BehaviorPackage.EXAMPLES_TABLE_VALUE_SEPARATOR: return createExamplesTableValueSeparator();
			case BehaviorPackage.EXAMPLES_TABLE_HEADER_SEPARATOR: return createExamplesTableHeaderSeparator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviorPackage.IMPLEMENTATION_LANGUAGE:
				return createImplementationLanguageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BehaviorPackage.IMPLEMENTATION_LANGUAGE:
				return convertImplementationLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeContainerBehavior createKnowledgeContainerBehavior() {
		KnowledgeContainerBehaviorImpl knowledgeContainerBehavior = new KnowledgeContainerBehaviorImpl();
		return knowledgeContainerBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsLibrary createStepsLibrary() {
		StepsLibraryImpl stepsLibrary = new StepsLibraryImpl();
		return stepsLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorBook createBehaviorBook() {
		BehaviorBookImpl behaviorBook = new BehaviorBookImpl();
		return behaviorBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbedderDefinition createEmbedderDefinition() {
		EmbedderDefinitionImpl embedderDefinition = new EmbedderDefinitionImpl();
		return embedderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsImplementationClass createStepsImplementationClass() {
		StepsImplementationClassImpl stepsImplementationClass = new StepsImplementationClassImpl();
		return stepsImplementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Story createStory() {
		StoryImpl story = new StoryImpl();
		return story;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaProperty createMetaProperty() {
		MetaPropertyImpl metaProperty = new MetaPropertyImpl();
		return metaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOrderTo createInOrderTo() {
		InOrderToImpl inOrderTo = new InOrderToImpl();
		return inOrderTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsA createAsA() {
		AsAImpl asA = new AsAImpl();
		return asA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IWantTo createIWantTo() {
		IWantToImpl iWantTo = new IWantToImpl();
		return iWantTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenStories createGivenStories() {
		GivenStoriesImpl givenStories = new GivenStoriesImpl();
		return givenStories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPath createStoryPath() {
		StoryPathImpl storyPath = new StoryPathImpl();
		return storyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTable createExamplesTable() {
		ExamplesTableImpl examplesTable = new ExamplesTableImpl();
		return examplesTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTableRow createExamplesTableRow() {
		ExamplesTableRowImpl examplesTableRow = new ExamplesTableRowImpl();
		return examplesTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTableHeader createExamplesTableHeader() {
		ExamplesTableHeaderImpl examplesTableHeader = new ExamplesTableHeaderImpl();
		return examplesTableHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleTableCell createExampleTableCell() {
		ExampleTableCellImpl exampleTableCell = new ExampleTableCellImpl();
		return exampleTableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepSentence createStepSentence() {
		StepSentenceImpl stepSentence = new StepSentenceImpl();
		return stepSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSentence createActionSentence() {
		ActionSentenceImpl actionSentence = new ActionSentenceImpl();
		return actionSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expectation createExpectation() {
		ExpectationImpl expectation = new ExpectationImpl();
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Given createGiven() {
		GivenImpl given = new GivenImpl();
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then createThen() {
		ThenImpl then = new ThenImpl();
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepLink createStepLink() {
		StepLinkImpl stepLink = new StepLinkImpl();
		return stepLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenLink createGivenLink() {
		GivenLinkImpl givenLink = new GivenLinkImpl();
		return givenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenLink createWhenLink() {
		WhenLinkImpl whenLink = new WhenLinkImpl();
		return whenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThenLink createThenLink() {
		ThenLinkImpl thenLink = new ThenLinkImpl();
		return thenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndLink createAndLink() {
		AndLinkImpl andLink = new AndLinkImpl();
		return andLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorySource createStorySource() {
		StorySourceImpl storySource = new StorySourceImpl();
		return storySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepParameter createStepParameter() {
		StepParameterImpl stepParameter = new StepParameterImpl();
		return stepParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepParameterKey createStepParameterKey() {
		StepParameterKeyImpl stepParameterKey = new StepParameterKeyImpl();
		return stepParameterKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTableIgnorableSeparator createExamplesTableIgnorableSeparator() {
		ExamplesTableIgnorableSeparatorImpl examplesTableIgnorableSeparator = new ExamplesTableIgnorableSeparatorImpl();
		return examplesTableIgnorableSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTableColumnSeparator createExamplesTableColumnSeparator() {
		ExamplesTableColumnSeparatorImpl examplesTableColumnSeparator = new ExamplesTableColumnSeparatorImpl();
		return examplesTableColumnSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTableValueSeparator createExamplesTableValueSeparator() {
		ExamplesTableValueSeparatorImpl examplesTableValueSeparator = new ExamplesTableValueSeparatorImpl();
		return examplesTableValueSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplesTableHeaderSeparator createExamplesTableHeaderSeparator() {
		ExamplesTableHeaderSeparatorImpl examplesTableHeaderSeparator = new ExamplesTableHeaderSeparatorImpl();
		return examplesTableHeaderSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationLanguage createImplementationLanguageFromString(EDataType eDataType, String initialValue) {
		ImplementationLanguage result = ImplementationLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorPackage getBehaviorPackage() {
		return (BehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorPackage getPackage() {
		return BehaviorPackage.eINSTANCE;
	}

} //BehaviorFactoryImpl
