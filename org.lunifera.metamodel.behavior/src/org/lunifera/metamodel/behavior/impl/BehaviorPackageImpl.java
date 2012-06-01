/**
 */
package org.lunifera.metamodel.behavior.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.behavior.ActionSentence;
import org.lunifera.metamodel.behavior.And;
import org.lunifera.metamodel.behavior.AndLink;
import org.lunifera.metamodel.behavior.AsA;
import org.lunifera.metamodel.behavior.BehaviorBook;
import org.lunifera.metamodel.behavior.BehaviorFactory;
import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.Context;
import org.lunifera.metamodel.behavior.EmbedderDefinition;
import org.lunifera.metamodel.behavior.ExampleTableCell;
import org.lunifera.metamodel.behavior.ExamplesTable;
import org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator;
import org.lunifera.metamodel.behavior.ExamplesTableHeader;
import org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator;
import org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator;
import org.lunifera.metamodel.behavior.ExamplesTableRow;
import org.lunifera.metamodel.behavior.ExamplesTableValueSeparator;
import org.lunifera.metamodel.behavior.Expectation;
import org.lunifera.metamodel.behavior.Given;
import org.lunifera.metamodel.behavior.GivenLink;
import org.lunifera.metamodel.behavior.GivenStories;
import org.lunifera.metamodel.behavior.IWantTo;
import org.lunifera.metamodel.behavior.ImplementationLanguage;
import org.lunifera.metamodel.behavior.InOrderTo;
import org.lunifera.metamodel.behavior.KnowledgeContainerBehavior;
import org.lunifera.metamodel.behavior.Meta;
import org.lunifera.metamodel.behavior.MetaProperty;
import org.lunifera.metamodel.behavior.Narrative;
import org.lunifera.metamodel.behavior.Scenario;
import org.lunifera.metamodel.behavior.Step;
import org.lunifera.metamodel.behavior.StepLink;
import org.lunifera.metamodel.behavior.StepParameter;
import org.lunifera.metamodel.behavior.StepParameterKey;
import org.lunifera.metamodel.behavior.StepSentence;
import org.lunifera.metamodel.behavior.StepsImplementationClass;
import org.lunifera.metamodel.behavior.StepsLibrary;
import org.lunifera.metamodel.behavior.Story;
import org.lunifera.metamodel.behavior.StoryPath;
import org.lunifera.metamodel.behavior.StorySource;
import org.lunifera.metamodel.behavior.Then;
import org.lunifera.metamodel.behavior.ThenLink;
import org.lunifera.metamodel.behavior.When;
import org.lunifera.metamodel.behavior.WhenLink;

import org.lunifera.metamodel.common.CommonPackage;

import org.lunifera.metamodel.knowledge.KnowledgePackage;

import org.lunifera.metamodel.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeContainerBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepsLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embedderDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepsImplementationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inOrderToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iWantToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass givenStoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleTableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass givenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass givenLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepParameterKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableIgnorableSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableColumnSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableValueSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesTableHeaderSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationLanguageEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.metamodel.behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SoftwarePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorPackage.eNS_URI, theBehaviorPackage);
		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeContainerBehavior() {
		return knowledgeContainerBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerBehavior_StepsLibraries() {
		return (EReference)knowledgeContainerBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerBehavior_Embedders() {
		return (EReference)knowledgeContainerBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeContainerBehavior_BehaviorBooks() {
		return (EReference)knowledgeContainerBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepsLibrary() {
		return stepsLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepsLibrary_ImplementationClasses() {
		return (EReference)stepsLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepsLibrary_Steps() {
		return (EReference)stepsLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorBook() {
		return behaviorBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorBook_RelatedSoftwareComponent() {
		return (EReference)behaviorBookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorBook_Stories() {
		return (EReference)behaviorBookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbedderDefinition() {
		return embedderDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedderDefinition_UsingSteps() {
		return (EReference)embedderDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedderDefinition_StoriesToRun() {
		return (EReference)embedderDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_GenerateViewAfterStories() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_IgnoreFailureInStories() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_IgnoreFailureInView() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_VerboseFailures() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_StoryTimeoutInSecs() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_Threads() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_MetaFilters() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_Name() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedderDefinition_Id() {
		return (EAttribute)embedderDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepsImplementationClass() {
		return stepsImplementationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepsImplementationClass_Library() {
		return (EReference)stepsImplementationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepsImplementationClass_Language() {
		return (EAttribute)stepsImplementationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepsImplementationClass_Name() {
		return (EAttribute)stepsImplementationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepsImplementationClass_ProjectPath() {
		return (EAttribute)stepsImplementationClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepsImplementationClass_Id() {
		return (EAttribute)stepsImplementationClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStory() {
		return storyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStory_BehaviorModel() {
		return (EReference)storyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStory_Description() {
		return (EAttribute)storyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStory_Narrative() {
		return (EReference)storyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStory_Scenarios() {
		return (EReference)storyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStory_Meta() {
		return (EReference)storyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStory_ImportFrom() {
		return (EReference)storyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStory_CreationDate() {
		return (EAttribute)storyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_MetaItems() {
		return (EReference)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaProperty() {
		return metaPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaProperty_Code() {
		return (EAttribute)metaPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaProperty_Value() {
		return (EAttribute)metaPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNarrative() {
		return narrativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNarrative_Id() {
		return (EAttribute)narrativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNarrative_AsA() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNarrative_IWantTo() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNarrative_InOrderTo() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInOrderTo() {
		return inOrderToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInOrderTo_Goal() {
		return (EAttribute)inOrderToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsA() {
		return asAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsA_BusinessRoles() {
		return (EAttribute)asAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIWantTo() {
		return iWantToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIWantTo_Requirement() {
		return (EAttribute)iWantToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Story() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Title() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_GivenStories() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Examples() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Steps() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGivenStories() {
		return givenStoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGivenStories_StoryPaths() {
		return (EReference)givenStoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPath() {
		return storyPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPath_Path() {
		return (EAttribute)storyPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPath_Parameters() {
		return (EAttribute)storyPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPath_GivenStories() {
		return (EReference)storyPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTable() {
		return examplesTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamplesTable_Header() {
		return (EReference)examplesTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamplesTable_Rows() {
		return (EReference)examplesTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamplesTable_Name() {
		return (EAttribute)examplesTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTableRow() {
		return examplesTableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamplesTableRow_ExampleTable() {
		return (EReference)examplesTableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamplesTableRow_Cells() {
		return (EReference)examplesTableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTableHeader() {
		return examplesTableHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamplesTableHeader_Columns() {
		return (EAttribute)examplesTableHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleTableCell() {
		return exampleTableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleTableCell_ColumnName() {
		return (EAttribute)exampleTableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleTableCell_Value() {
		return (EAttribute)exampleTableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleTableCell_Row() {
		return (EReference)exampleTableCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Sentence() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Parameters() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Ands() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepSentence() {
		return stepSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSentence() {
		return actionSentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectation() {
		return expectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_StepOne() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGiven() {
		return givenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGiven_Context() {
		return (EReference)givenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Action() {
		return (EReference)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThen() {
		return thenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThen_ExpectedOutcome() {
		return (EReference)thenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepLink() {
		return stepLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepLink_Link() {
		return (EReference)stepLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGivenLink() {
		return givenLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenLink() {
		return whenLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThenLink() {
		return thenLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndLink() {
		return andLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorySource() {
		return storySourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorySource_Name() {
		return (EAttribute)storySourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorySource_Url() {
		return (EAttribute)storySourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepParameter() {
		return stepParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepParameter_Key() {
		return (EReference)stepParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepParameter_Type() {
		return (EAttribute)stepParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepParameter_Value() {
		return (EAttribute)stepParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepParameterKey() {
		return stepParameterKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepParameterKey_Value() {
		return (EAttribute)stepParameterKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTableIgnorableSeparator() {
		return examplesTableIgnorableSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamplesTableIgnorableSeparator_Value() {
		return (EAttribute)examplesTableIgnorableSeparatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTableColumnSeparator() {
		return examplesTableColumnSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamplesTableColumnSeparator_Value() {
		return (EAttribute)examplesTableColumnSeparatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTableValueSeparator() {
		return examplesTableValueSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamplesTableValueSeparator_Value() {
		return (EAttribute)examplesTableValueSeparatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesTableHeaderSeparator() {
		return examplesTableHeaderSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamplesTableHeaderSeparator_Value() {
		return (EAttribute)examplesTableHeaderSeparatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImplementationLanguage() {
		return implementationLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		knowledgeContainerBehaviorEClass = createEClass(KNOWLEDGE_CONTAINER_BEHAVIOR);
		createEReference(knowledgeContainerBehaviorEClass, KNOWLEDGE_CONTAINER_BEHAVIOR__STEPS_LIBRARIES);
		createEReference(knowledgeContainerBehaviorEClass, KNOWLEDGE_CONTAINER_BEHAVIOR__EMBEDDERS);
		createEReference(knowledgeContainerBehaviorEClass, KNOWLEDGE_CONTAINER_BEHAVIOR__BEHAVIOR_BOOKS);

		stepsLibraryEClass = createEClass(STEPS_LIBRARY);
		createEReference(stepsLibraryEClass, STEPS_LIBRARY__IMPLEMENTATION_CLASSES);
		createEReference(stepsLibraryEClass, STEPS_LIBRARY__STEPS);

		behaviorBookEClass = createEClass(BEHAVIOR_BOOK);
		createEReference(behaviorBookEClass, BEHAVIOR_BOOK__RELATED_SOFTWARE_COMPONENT);
		createEReference(behaviorBookEClass, BEHAVIOR_BOOK__STORIES);

		embedderDefinitionEClass = createEClass(EMBEDDER_DEFINITION);
		createEReference(embedderDefinitionEClass, EMBEDDER_DEFINITION__USING_STEPS);
		createEReference(embedderDefinitionEClass, EMBEDDER_DEFINITION__STORIES_TO_RUN);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__VERBOSE_FAILURES);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__THREADS);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__META_FILTERS);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__NAME);
		createEAttribute(embedderDefinitionEClass, EMBEDDER_DEFINITION__ID);

		stepsImplementationClassEClass = createEClass(STEPS_IMPLEMENTATION_CLASS);
		createEReference(stepsImplementationClassEClass, STEPS_IMPLEMENTATION_CLASS__LIBRARY);
		createEAttribute(stepsImplementationClassEClass, STEPS_IMPLEMENTATION_CLASS__LANGUAGE);
		createEAttribute(stepsImplementationClassEClass, STEPS_IMPLEMENTATION_CLASS__NAME);
		createEAttribute(stepsImplementationClassEClass, STEPS_IMPLEMENTATION_CLASS__PROJECT_PATH);
		createEAttribute(stepsImplementationClassEClass, STEPS_IMPLEMENTATION_CLASS__ID);

		storyEClass = createEClass(STORY);
		createEReference(storyEClass, STORY__BEHAVIOR_MODEL);
		createEAttribute(storyEClass, STORY__DESCRIPTION);
		createEReference(storyEClass, STORY__NARRATIVE);
		createEReference(storyEClass, STORY__SCENARIOS);
		createEReference(storyEClass, STORY__META);
		createEReference(storyEClass, STORY__IMPORT_FROM);
		createEAttribute(storyEClass, STORY__CREATION_DATE);

		metaEClass = createEClass(META);
		createEReference(metaEClass, META__META_ITEMS);

		metaPropertyEClass = createEClass(META_PROPERTY);
		createEAttribute(metaPropertyEClass, META_PROPERTY__CODE);
		createEAttribute(metaPropertyEClass, META_PROPERTY__VALUE);

		narrativeEClass = createEClass(NARRATIVE);
		createEAttribute(narrativeEClass, NARRATIVE__ID);
		createEReference(narrativeEClass, NARRATIVE__AS_A);
		createEReference(narrativeEClass, NARRATIVE__IWANT_TO);
		createEReference(narrativeEClass, NARRATIVE__IN_ORDER_TO);

		inOrderToEClass = createEClass(IN_ORDER_TO);
		createEAttribute(inOrderToEClass, IN_ORDER_TO__GOAL);

		asAEClass = createEClass(AS_A);
		createEAttribute(asAEClass, AS_A__BUSINESS_ROLES);

		iWantToEClass = createEClass(IWANT_TO);
		createEAttribute(iWantToEClass, IWANT_TO__REQUIREMENT);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__STORY);
		createEAttribute(scenarioEClass, SCENARIO__TITLE);
		createEReference(scenarioEClass, SCENARIO__GIVEN_STORIES);
		createEReference(scenarioEClass, SCENARIO__EXAMPLES);
		createEReference(scenarioEClass, SCENARIO__STEPS);

		givenStoriesEClass = createEClass(GIVEN_STORIES);
		createEReference(givenStoriesEClass, GIVEN_STORIES__STORY_PATHS);

		storyPathEClass = createEClass(STORY_PATH);
		createEAttribute(storyPathEClass, STORY_PATH__PATH);
		createEAttribute(storyPathEClass, STORY_PATH__PARAMETERS);
		createEReference(storyPathEClass, STORY_PATH__GIVEN_STORIES);

		examplesTableEClass = createEClass(EXAMPLES_TABLE);
		createEReference(examplesTableEClass, EXAMPLES_TABLE__HEADER);
		createEReference(examplesTableEClass, EXAMPLES_TABLE__ROWS);
		createEAttribute(examplesTableEClass, EXAMPLES_TABLE__NAME);

		examplesTableRowEClass = createEClass(EXAMPLES_TABLE_ROW);
		createEReference(examplesTableRowEClass, EXAMPLES_TABLE_ROW__EXAMPLE_TABLE);
		createEReference(examplesTableRowEClass, EXAMPLES_TABLE_ROW__CELLS);

		examplesTableHeaderEClass = createEClass(EXAMPLES_TABLE_HEADER);
		createEAttribute(examplesTableHeaderEClass, EXAMPLES_TABLE_HEADER__COLUMNS);

		exampleTableCellEClass = createEClass(EXAMPLE_TABLE_CELL);
		createEAttribute(exampleTableCellEClass, EXAMPLE_TABLE_CELL__COLUMN_NAME);
		createEAttribute(exampleTableCellEClass, EXAMPLE_TABLE_CELL__VALUE);
		createEReference(exampleTableCellEClass, EXAMPLE_TABLE_CELL__ROW);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__NAME);
		createEReference(stepEClass, STEP__SENTENCE);
		createEReference(stepEClass, STEP__PARAMETERS);
		createEReference(stepEClass, STEP__ANDS);

		stepSentenceEClass = createEClass(STEP_SENTENCE);

		actionSentenceEClass = createEClass(ACTION_SENTENCE);

		contextEClass = createEClass(CONTEXT);

		expectationEClass = createEClass(EXPECTATION);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__STEP_ONE);

		givenEClass = createEClass(GIVEN);
		createEReference(givenEClass, GIVEN__CONTEXT);

		whenEClass = createEClass(WHEN);
		createEReference(whenEClass, WHEN__ACTION);

		thenEClass = createEClass(THEN);
		createEReference(thenEClass, THEN__EXPECTED_OUTCOME);

		stepLinkEClass = createEClass(STEP_LINK);
		createEReference(stepLinkEClass, STEP_LINK__LINK);

		givenLinkEClass = createEClass(GIVEN_LINK);

		whenLinkEClass = createEClass(WHEN_LINK);

		thenLinkEClass = createEClass(THEN_LINK);

		andLinkEClass = createEClass(AND_LINK);

		storySourceEClass = createEClass(STORY_SOURCE);
		createEAttribute(storySourceEClass, STORY_SOURCE__NAME);
		createEAttribute(storySourceEClass, STORY_SOURCE__URL);

		stepParameterEClass = createEClass(STEP_PARAMETER);
		createEReference(stepParameterEClass, STEP_PARAMETER__KEY);
		createEAttribute(stepParameterEClass, STEP_PARAMETER__TYPE);
		createEAttribute(stepParameterEClass, STEP_PARAMETER__VALUE);

		stepParameterKeyEClass = createEClass(STEP_PARAMETER_KEY);
		createEAttribute(stepParameterKeyEClass, STEP_PARAMETER_KEY__VALUE);

		examplesTableIgnorableSeparatorEClass = createEClass(EXAMPLES_TABLE_IGNORABLE_SEPARATOR);
		createEAttribute(examplesTableIgnorableSeparatorEClass, EXAMPLES_TABLE_IGNORABLE_SEPARATOR__VALUE);

		examplesTableColumnSeparatorEClass = createEClass(EXAMPLES_TABLE_COLUMN_SEPARATOR);
		createEAttribute(examplesTableColumnSeparatorEClass, EXAMPLES_TABLE_COLUMN_SEPARATOR__VALUE);

		examplesTableValueSeparatorEClass = createEClass(EXAMPLES_TABLE_VALUE_SEPARATOR);
		createEAttribute(examplesTableValueSeparatorEClass, EXAMPLES_TABLE_VALUE_SEPARATOR__VALUE);

		examplesTableHeaderSeparatorEClass = createEClass(EXAMPLES_TABLE_HEADER_SEPARATOR);
		createEAttribute(examplesTableHeaderSeparatorEClass, EXAMPLES_TABLE_HEADER_SEPARATOR__VALUE);

		// Create enums
		implementationLanguageEEnum = createEEnum(IMPLEMENTATION_LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KnowledgePackage theKnowledgePackage = (KnowledgePackage)EPackage.Registry.INSTANCE.getEPackage(KnowledgePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		SoftwarePackage theSoftwarePackage = (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		knowledgeContainerBehaviorEClass.getESuperTypes().add(theKnowledgePackage.getAbstractKnowledgeContainer());
		stepsLibraryEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		behaviorBookEClass.getESuperTypes().add(theCommonPackage.getAbstractDescribedClass());
		actionSentenceEClass.getESuperTypes().add(this.getStepSentence());
		contextEClass.getESuperTypes().add(this.getStepSentence());
		expectationEClass.getESuperTypes().add(this.getStepSentence());
		andEClass.getESuperTypes().add(this.getStep());
		givenEClass.getESuperTypes().add(this.getStep());
		whenEClass.getESuperTypes().add(this.getStep());
		thenEClass.getESuperTypes().add(this.getStep());
		stepLinkEClass.getESuperTypes().add(this.getStep());
		givenLinkEClass.getESuperTypes().add(this.getStepLink());
		whenLinkEClass.getESuperTypes().add(this.getStepLink());
		thenLinkEClass.getESuperTypes().add(this.getStepLink());
		andLinkEClass.getESuperTypes().add(this.getStepLink());

		// Initialize classes and features; add operations and parameters
		initEClass(knowledgeContainerBehaviorEClass, KnowledgeContainerBehavior.class, "KnowledgeContainerBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeContainerBehavior_StepsLibraries(), this.getStepsLibrary(), null, "stepsLibraries", null, 0, -1, KnowledgeContainerBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeContainerBehavior_Embedders(), this.getEmbedderDefinition(), null, "embedders", null, 0, -1, KnowledgeContainerBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeContainerBehavior_BehaviorBooks(), this.getBehaviorBook(), null, "behaviorBooks", null, 0, -1, KnowledgeContainerBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepsLibraryEClass, StepsLibrary.class, "StepsLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepsLibrary_ImplementationClasses(), this.getStepsImplementationClass(), this.getStepsImplementationClass_Library(), "ImplementationClasses", null, 0, -1, StepsLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getStepsLibrary_ImplementationClasses().getEKeys().add(this.getStepsImplementationClass_Id());
		initEReference(getStepsLibrary_Steps(), this.getStep(), null, "steps", null, 0, -1, StepsLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorBookEClass, BehaviorBook.class, "BehaviorBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorBook_RelatedSoftwareComponent(), theSoftwarePackage.getAbstractSoftwareComponent(), null, "relatedSoftwareComponent", null, 0, 1, BehaviorBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorBook_Stories(), this.getStory(), null, "stories", null, 0, -1, BehaviorBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embedderDefinitionEClass, EmbedderDefinition.class, "EmbedderDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmbedderDefinition_UsingSteps(), this.getStepsImplementationClass(), null, "usingSteps", null, 0, -1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedderDefinition_StoriesToRun(), this.getStory(), null, "storiesToRun", null, 0, -1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_GenerateViewAfterStories(), ecorePackage.getEBoolean(), "generateViewAfterStories", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_IgnoreFailureInStories(), ecorePackage.getEBoolean(), "ignoreFailureInStories", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_IgnoreFailureInView(), ecorePackage.getEBoolean(), "ignoreFailureInView", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_VerboseFailures(), ecorePackage.getEBoolean(), "verboseFailures", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_StoryTimeoutInSecs(), ecorePackage.getEInt(), "storyTimeoutInSecs", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_Threads(), ecorePackage.getEInt(), "threads", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_MetaFilters(), ecorePackage.getEString(), "metaFilters", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedderDefinition_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, EmbedderDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepsImplementationClassEClass, StepsImplementationClass.class, "StepsImplementationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepsImplementationClass_Library(), this.getStepsLibrary(), this.getStepsLibrary_ImplementationClasses(), "library", null, 1, 1, StepsImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepsImplementationClass_Language(), this.getImplementationLanguage(), "language", null, 0, 1, StepsImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepsImplementationClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, StepsImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepsImplementationClass_ProjectPath(), ecorePackage.getEString(), "projectPath", null, 0, 1, StepsImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepsImplementationClass_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, StepsImplementationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyEClass, Story.class, "Story", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStory_BehaviorModel(), this.getKnowledgeContainerBehavior(), null, "behaviorModel", null, 1, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStory_Description(), ecorePackage.getEString(), "description", null, 0, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStory_Narrative(), this.getNarrative(), null, "narrative", null, 0, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStory_Scenarios(), this.getScenario(), this.getScenario_Story(), "scenarios", null, 0, -1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStory_Meta(), this.getMeta(), null, "meta", null, 0, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStory_ImportFrom(), this.getStorySource(), null, "importFrom", null, 0, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStory_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeta_MetaItems(), this.getMetaProperty(), null, "metaItems", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaPropertyEClass, MetaProperty.class, "MetaProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaProperty_Code(), ecorePackage.getEString(), "code", null, 0, 1, MetaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, MetaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(narrativeEClass, Narrative.class, "Narrative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNarrative_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNarrative_AsA(), this.getAsA(), null, "asA", null, 0, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNarrative_IWantTo(), this.getIWantTo(), null, "iWantTo", null, 0, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNarrative_InOrderTo(), this.getInOrderTo(), null, "inOrderTo", null, 0, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inOrderToEClass, InOrderTo.class, "InOrderTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInOrderTo_Goal(), ecorePackage.getEString(), "goal", null, 0, 1, InOrderTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asAEClass, AsA.class, "AsA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsA_BusinessRoles(), ecorePackage.getEString(), "businessRoles", null, 0, -1, AsA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iWantToEClass, IWantTo.class, "IWantTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIWantTo_Requirement(), ecorePackage.getEString(), "requirement", null, 0, 1, IWantTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Story(), this.getStory(), this.getStory_Scenarios(), "story", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Title(), ecorePackage.getEString(), "title", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_GivenStories(), this.getGivenStories(), null, "givenStories", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Examples(), this.getExamplesTable(), null, "examples", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Steps(), this.getStep(), null, "steps", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(givenStoriesEClass, GivenStories.class, "GivenStories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGivenStories_StoryPaths(), this.getStoryPath(), this.getStoryPath_GivenStories(), "storyPaths", null, 0, -1, GivenStories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPathEClass, StoryPath.class, "StoryPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoryPath_Path(), ecorePackage.getEString(), "path", null, 0, 1, StoryPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoryPath_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, StoryPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPath_GivenStories(), this.getGivenStories(), this.getGivenStories_StoryPaths(), "givenStories", null, 1, 1, StoryPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableEClass, ExamplesTable.class, "ExamplesTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExamplesTable_Header(), this.getExamplesTableHeader(), null, "header", null, 1, 1, ExamplesTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExamplesTable_Rows(), this.getExamplesTableRow(), this.getExamplesTableRow_ExampleTable(), "rows", null, 1, -1, ExamplesTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamplesTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExamplesTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableRowEClass, ExamplesTableRow.class, "ExamplesTableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExamplesTableRow_ExampleTable(), this.getExamplesTable(), this.getExamplesTable_Rows(), "exampleTable", null, 1, 1, ExamplesTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExamplesTableRow_Cells(), this.getExampleTableCell(), this.getExampleTableCell_Row(), "cells", null, 1, -1, ExamplesTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableHeaderEClass, ExamplesTableHeader.class, "ExamplesTableHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamplesTableHeader_Columns(), ecorePackage.getEString(), "columns", null, 0, -1, ExamplesTableHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleTableCellEClass, ExampleTableCell.class, "ExampleTableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExampleTableCell_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, ExampleTableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExampleTableCell_Value(), ecorePackage.getEString(), "value", null, 0, 1, ExampleTableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleTableCell_Row(), this.getExamplesTableRow(), this.getExamplesTableRow_Cells(), "row", null, 0, 1, ExampleTableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Sentence(), this.getStepSentence(), null, "sentence", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Parameters(), this.getStepParameter(), null, "parameters", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Ands(), this.getStep(), null, "ands", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepSentenceEClass, StepSentence.class, "StepSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionSentenceEClass, ActionSentence.class, "ActionSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectationEClass, Expectation.class, "Expectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_StepOne(), this.getStep(), null, "stepOne", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(givenEClass, Given.class, "Given", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGiven_Context(), this.getContext(), null, "context", null, 0, 1, Given.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhen_Action(), this.getActionSentence(), null, "action", null, 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thenEClass, Then.class, "Then", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThen_ExpectedOutcome(), this.getExpectation(), null, "expectedOutcome", null, 0, 1, Then.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepLinkEClass, StepLink.class, "StepLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepLink_Link(), this.getStep(), null, "link", null, 0, 1, StepLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(givenLinkEClass, GivenLink.class, "GivenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenLinkEClass, WhenLink.class, "WhenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thenLinkEClass, ThenLink.class, "ThenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andLinkEClass, AndLink.class, "AndLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storySourceEClass, StorySource.class, "StorySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorySource_Name(), ecorePackage.getEString(), "name", null, 1, 1, StorySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorySource_Url(), ecorePackage.getEString(), "url", null, 1, 1, StorySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepParameterEClass, StepParameter.class, "StepParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepParameter_Key(), this.getStepParameterKey(), null, "key", null, 1, 1, StepParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepParameter_Type(), ecorePackage.getEString(), "type", null, 1, 1, StepParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, StepParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepParameterKeyEClass, StepParameterKey.class, "StepParameterKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStepParameterKey_Value(), ecorePackage.getEString(), "value", null, 0, 1, StepParameterKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableIgnorableSeparatorEClass, ExamplesTableIgnorableSeparator.class, "ExamplesTableIgnorableSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamplesTableIgnorableSeparator_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExamplesTableIgnorableSeparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableColumnSeparatorEClass, ExamplesTableColumnSeparator.class, "ExamplesTableColumnSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamplesTableColumnSeparator_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExamplesTableColumnSeparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableValueSeparatorEClass, ExamplesTableValueSeparator.class, "ExamplesTableValueSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamplesTableValueSeparator_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExamplesTableValueSeparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesTableHeaderSeparatorEClass, ExamplesTableHeaderSeparator.class, "ExamplesTableHeaderSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamplesTableHeaderSeparator_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExamplesTableHeaderSeparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(implementationLanguageEEnum, ImplementationLanguage.class, "ImplementationLanguage");
		addEEnumLiteral(implementationLanguageEEnum, ImplementationLanguage.JAVA);

		// Create resource
		createResource(eNS_URI);
	}

} //BehaviorPackageImpl
