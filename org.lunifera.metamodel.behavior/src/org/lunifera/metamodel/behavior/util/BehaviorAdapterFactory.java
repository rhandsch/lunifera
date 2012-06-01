/**
 */
package org.lunifera.metamodel.behavior.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.behavior.*;

import org.lunifera.metamodel.common.AbstractDescribedClass;
import org.lunifera.metamodel.common.AbstractIdentifiedClass;
import org.lunifera.metamodel.common.AbstractNamedClass;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorSwitch<Adapter> modelSwitch =
		new BehaviorSwitch<Adapter>() {
			@Override
			public Adapter caseKnowledgeContainerBehavior(KnowledgeContainerBehavior object) {
				return createKnowledgeContainerBehaviorAdapter();
			}
			@Override
			public Adapter caseStepsLibrary(StepsLibrary object) {
				return createStepsLibraryAdapter();
			}
			@Override
			public Adapter caseBehaviorBook(BehaviorBook object) {
				return createBehaviorBookAdapter();
			}
			@Override
			public Adapter caseEmbedderDefinition(EmbedderDefinition object) {
				return createEmbedderDefinitionAdapter();
			}
			@Override
			public Adapter caseStepsImplementationClass(StepsImplementationClass object) {
				return createStepsImplementationClassAdapter();
			}
			@Override
			public Adapter caseStory(Story object) {
				return createStoryAdapter();
			}
			@Override
			public Adapter caseMeta(Meta object) {
				return createMetaAdapter();
			}
			@Override
			public Adapter caseMetaProperty(MetaProperty object) {
				return createMetaPropertyAdapter();
			}
			@Override
			public Adapter caseNarrative(Narrative object) {
				return createNarrativeAdapter();
			}
			@Override
			public Adapter caseInOrderTo(InOrderTo object) {
				return createInOrderToAdapter();
			}
			@Override
			public Adapter caseAsA(AsA object) {
				return createAsAAdapter();
			}
			@Override
			public Adapter caseIWantTo(IWantTo object) {
				return createIWantToAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseGivenStories(GivenStories object) {
				return createGivenStoriesAdapter();
			}
			@Override
			public Adapter caseStoryPath(StoryPath object) {
				return createStoryPathAdapter();
			}
			@Override
			public Adapter caseExamplesTable(ExamplesTable object) {
				return createExamplesTableAdapter();
			}
			@Override
			public Adapter caseExamplesTableRow(ExamplesTableRow object) {
				return createExamplesTableRowAdapter();
			}
			@Override
			public Adapter caseExamplesTableHeader(ExamplesTableHeader object) {
				return createExamplesTableHeaderAdapter();
			}
			@Override
			public Adapter caseExampleTableCell(ExampleTableCell object) {
				return createExampleTableCellAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseStepSentence(StepSentence object) {
				return createStepSentenceAdapter();
			}
			@Override
			public Adapter caseActionSentence(ActionSentence object) {
				return createActionSentenceAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseExpectation(Expectation object) {
				return createExpectationAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseGiven(Given object) {
				return createGivenAdapter();
			}
			@Override
			public Adapter caseWhen(When object) {
				return createWhenAdapter();
			}
			@Override
			public Adapter caseThen(Then object) {
				return createThenAdapter();
			}
			@Override
			public Adapter caseStepLink(StepLink object) {
				return createStepLinkAdapter();
			}
			@Override
			public Adapter caseGivenLink(GivenLink object) {
				return createGivenLinkAdapter();
			}
			@Override
			public Adapter caseWhenLink(WhenLink object) {
				return createWhenLinkAdapter();
			}
			@Override
			public Adapter caseThenLink(ThenLink object) {
				return createThenLinkAdapter();
			}
			@Override
			public Adapter caseAndLink(AndLink object) {
				return createAndLinkAdapter();
			}
			@Override
			public Adapter caseStorySource(StorySource object) {
				return createStorySourceAdapter();
			}
			@Override
			public Adapter caseStepParameter(StepParameter object) {
				return createStepParameterAdapter();
			}
			@Override
			public Adapter caseStepParameterKey(StepParameterKey object) {
				return createStepParameterKeyAdapter();
			}
			@Override
			public Adapter caseExamplesTableIgnorableSeparator(ExamplesTableIgnorableSeparator object) {
				return createExamplesTableIgnorableSeparatorAdapter();
			}
			@Override
			public Adapter caseExamplesTableColumnSeparator(ExamplesTableColumnSeparator object) {
				return createExamplesTableColumnSeparatorAdapter();
			}
			@Override
			public Adapter caseExamplesTableValueSeparator(ExamplesTableValueSeparator object) {
				return createExamplesTableValueSeparatorAdapter();
			}
			@Override
			public Adapter caseExamplesTableHeaderSeparator(ExamplesTableHeaderSeparator object) {
				return createExamplesTableHeaderSeparatorAdapter();
			}
			@Override
			public Adapter caseAbstractIdentifiedClass(AbstractIdentifiedClass object) {
				return createAbstractIdentifiedClassAdapter();
			}
			@Override
			public Adapter caseAbstractNamedClass(AbstractNamedClass object) {
				return createAbstractNamedClassAdapter();
			}
			@Override
			public Adapter caseAbstractDescribedClass(AbstractDescribedClass object) {
				return createAbstractDescribedClassAdapter();
			}
			@Override
			public Adapter caseAbstractKnowledgeContainer(AbstractKnowledgeContainer object) {
				return createAbstractKnowledgeContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.KnowledgeContainerBehavior <em>Knowledge Container Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.KnowledgeContainerBehavior
	 * @generated
	 */
	public Adapter createKnowledgeContainerBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StepsLibrary <em>Steps Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StepsLibrary
	 * @generated
	 */
	public Adapter createStepsLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.BehaviorBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.BehaviorBook
	 * @generated
	 */
	public Adapter createBehaviorBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.EmbedderDefinition <em>Embedder Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.EmbedderDefinition
	 * @generated
	 */
	public Adapter createEmbedderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StepsImplementationClass <em>Steps Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StepsImplementationClass
	 * @generated
	 */
	public Adapter createStepsImplementationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Story
	 * @generated
	 */
	public Adapter createStoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.MetaProperty <em>Meta Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.MetaProperty
	 * @generated
	 */
	public Adapter createMetaPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Narrative
	 * @generated
	 */
	public Adapter createNarrativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.InOrderTo <em>In Order To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.InOrderTo
	 * @generated
	 */
	public Adapter createInOrderToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.AsA <em>As A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.AsA
	 * @generated
	 */
	public Adapter createAsAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.IWantTo <em>IWant To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.IWantTo
	 * @generated
	 */
	public Adapter createIWantToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.GivenStories <em>Given Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.GivenStories
	 * @generated
	 */
	public Adapter createGivenStoriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StoryPath <em>Story Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StoryPath
	 * @generated
	 */
	public Adapter createStoryPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTable <em>Examples Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTable
	 * @generated
	 */
	public Adapter createExamplesTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTableRow <em>Examples Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableRow
	 * @generated
	 */
	public Adapter createExamplesTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTableHeader <em>Examples Table Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableHeader
	 * @generated
	 */
	public Adapter createExamplesTableHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExampleTableCell <em>Example Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExampleTableCell
	 * @generated
	 */
	public Adapter createExampleTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StepSentence <em>Step Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StepSentence
	 * @generated
	 */
	public Adapter createStepSentenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ActionSentence
	 * @generated
	 */
	public Adapter createActionSentenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Expectation
	 * @generated
	 */
	public Adapter createExpectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Given
	 * @generated
	 */
	public Adapter createGivenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.When
	 * @generated
	 */
	public Adapter createWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.Then
	 * @generated
	 */
	public Adapter createThenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StepLink <em>Step Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StepLink
	 * @generated
	 */
	public Adapter createStepLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.GivenLink <em>Given Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.GivenLink
	 * @generated
	 */
	public Adapter createGivenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.WhenLink <em>When Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.WhenLink
	 * @generated
	 */
	public Adapter createWhenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ThenLink <em>Then Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ThenLink
	 * @generated
	 */
	public Adapter createThenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.AndLink <em>And Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.AndLink
	 * @generated
	 */
	public Adapter createAndLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StorySource <em>Story Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StorySource
	 * @generated
	 */
	public Adapter createStorySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StepParameter <em>Step Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StepParameter
	 * @generated
	 */
	public Adapter createStepParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.StepParameterKey <em>Step Parameter Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.StepParameterKey
	 * @generated
	 */
	public Adapter createStepParameterKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator <em>Examples Table Ignorable Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableIgnorableSeparator
	 * @generated
	 */
	public Adapter createExamplesTableIgnorableSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator <em>Examples Table Column Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableColumnSeparator
	 * @generated
	 */
	public Adapter createExamplesTableColumnSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTableValueSeparator <em>Examples Table Value Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableValueSeparator
	 * @generated
	 */
	public Adapter createExamplesTableValueSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator <em>Examples Table Header Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.behavior.ExamplesTableHeaderSeparator
	 * @generated
	 */
	public Adapter createExamplesTableHeaderSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.common.AbstractIdentifiedClass <em>Abstract Identified Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.common.AbstractIdentifiedClass
	 * @generated
	 */
	public Adapter createAbstractIdentifiedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.common.AbstractNamedClass <em>Abstract Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.common.AbstractNamedClass
	 * @generated
	 */
	public Adapter createAbstractNamedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.common.AbstractDescribedClass <em>Abstract Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.common.AbstractDescribedClass
	 * @generated
	 */
	public Adapter createAbstractDescribedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer <em>Abstract Knowledge Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer
	 * @generated
	 */
	public Adapter createAbstractKnowledgeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviorAdapterFactory
