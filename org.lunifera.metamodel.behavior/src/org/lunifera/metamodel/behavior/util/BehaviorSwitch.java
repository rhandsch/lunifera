/**
 */
package org.lunifera.metamodel.behavior.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.metamodel.behavior.*;

import org.lunifera.metamodel.common.AbstractDescribedClass;
import org.lunifera.metamodel.common.AbstractIdentifiedClass;
import org.lunifera.metamodel.common.AbstractNamedClass;

import org.lunifera.metamodel.knowledge.AbstractKnowledgeContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehaviorPackage.KNOWLEDGE_CONTAINER_BEHAVIOR: {
				KnowledgeContainerBehavior knowledgeContainerBehavior = (KnowledgeContainerBehavior)theEObject;
				T result = caseKnowledgeContainerBehavior(knowledgeContainerBehavior);
				if (result == null) result = caseAbstractKnowledgeContainer(knowledgeContainerBehavior);
				if (result == null) result = caseAbstractDescribedClass(knowledgeContainerBehavior);
				if (result == null) result = caseAbstractNamedClass(knowledgeContainerBehavior);
				if (result == null) result = caseAbstractIdentifiedClass(knowledgeContainerBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEPS_LIBRARY: {
				StepsLibrary stepsLibrary = (StepsLibrary)theEObject;
				T result = caseStepsLibrary(stepsLibrary);
				if (result == null) result = caseAbstractDescribedClass(stepsLibrary);
				if (result == null) result = caseAbstractNamedClass(stepsLibrary);
				if (result == null) result = caseAbstractIdentifiedClass(stepsLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.BEHAVIOR_BOOK: {
				BehaviorBook behaviorBook = (BehaviorBook)theEObject;
				T result = caseBehaviorBook(behaviorBook);
				if (result == null) result = caseAbstractDescribedClass(behaviorBook);
				if (result == null) result = caseAbstractNamedClass(behaviorBook);
				if (result == null) result = caseAbstractIdentifiedClass(behaviorBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EMBEDDER_DEFINITION: {
				EmbedderDefinition embedderDefinition = (EmbedderDefinition)theEObject;
				T result = caseEmbedderDefinition(embedderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEPS_IMPLEMENTATION_CLASS: {
				StepsImplementationClass stepsImplementationClass = (StepsImplementationClass)theEObject;
				T result = caseStepsImplementationClass(stepsImplementationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STORY: {
				Story story = (Story)theEObject;
				T result = caseStory(story);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.META_PROPERTY: {
				MetaProperty metaProperty = (MetaProperty)theEObject;
				T result = caseMetaProperty(metaProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.NARRATIVE: {
				Narrative narrative = (Narrative)theEObject;
				T result = caseNarrative(narrative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IN_ORDER_TO: {
				InOrderTo inOrderTo = (InOrderTo)theEObject;
				T result = caseInOrderTo(inOrderTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.AS_A: {
				AsA asA = (AsA)theEObject;
				T result = caseAsA(asA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.IWANT_TO: {
				IWantTo iWantTo = (IWantTo)theEObject;
				T result = caseIWantTo(iWantTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.GIVEN_STORIES: {
				GivenStories givenStories = (GivenStories)theEObject;
				T result = caseGivenStories(givenStories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STORY_PATH: {
				StoryPath storyPath = (StoryPath)theEObject;
				T result = caseStoryPath(storyPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE: {
				ExamplesTable examplesTable = (ExamplesTable)theEObject;
				T result = caseExamplesTable(examplesTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE_ROW: {
				ExamplesTableRow examplesTableRow = (ExamplesTableRow)theEObject;
				T result = caseExamplesTableRow(examplesTableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE_HEADER: {
				ExamplesTableHeader examplesTableHeader = (ExamplesTableHeader)theEObject;
				T result = caseExamplesTableHeader(examplesTableHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLE_TABLE_CELL: {
				ExampleTableCell exampleTableCell = (ExampleTableCell)theEObject;
				T result = caseExampleTableCell(exampleTableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEP_SENTENCE: {
				StepSentence stepSentence = (StepSentence)theEObject;
				T result = caseStepSentence(stepSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ACTION_SENTENCE: {
				ActionSentence actionSentence = (ActionSentence)theEObject;
				T result = caseActionSentence(actionSentence);
				if (result == null) result = caseStepSentence(actionSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseStepSentence(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXPECTATION: {
				Expectation expectation = (Expectation)theEObject;
				T result = caseExpectation(expectation);
				if (result == null) result = caseStepSentence(expectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseStep(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.GIVEN: {
				Given given = (Given)theEObject;
				T result = caseGiven(given);
				if (result == null) result = caseStep(given);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.WHEN: {
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = caseStep(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.THEN: {
				Then then = (Then)theEObject;
				T result = caseThen(then);
				if (result == null) result = caseStep(then);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEP_LINK: {
				StepLink stepLink = (StepLink)theEObject;
				T result = caseStepLink(stepLink);
				if (result == null) result = caseStep(stepLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.GIVEN_LINK: {
				GivenLink givenLink = (GivenLink)theEObject;
				T result = caseGivenLink(givenLink);
				if (result == null) result = caseStepLink(givenLink);
				if (result == null) result = caseStep(givenLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.WHEN_LINK: {
				WhenLink whenLink = (WhenLink)theEObject;
				T result = caseWhenLink(whenLink);
				if (result == null) result = caseStepLink(whenLink);
				if (result == null) result = caseStep(whenLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.THEN_LINK: {
				ThenLink thenLink = (ThenLink)theEObject;
				T result = caseThenLink(thenLink);
				if (result == null) result = caseStepLink(thenLink);
				if (result == null) result = caseStep(thenLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.AND_LINK: {
				AndLink andLink = (AndLink)theEObject;
				T result = caseAndLink(andLink);
				if (result == null) result = caseStepLink(andLink);
				if (result == null) result = caseStep(andLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STORY_SOURCE: {
				StorySource storySource = (StorySource)theEObject;
				T result = caseStorySource(storySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEP_PARAMETER: {
				StepParameter stepParameter = (StepParameter)theEObject;
				T result = caseStepParameter(stepParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.STEP_PARAMETER_KEY: {
				StepParameterKey stepParameterKey = (StepParameterKey)theEObject;
				T result = caseStepParameterKey(stepParameterKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE_IGNORABLE_SEPARATOR: {
				ExamplesTableIgnorableSeparator examplesTableIgnorableSeparator = (ExamplesTableIgnorableSeparator)theEObject;
				T result = caseExamplesTableIgnorableSeparator(examplesTableIgnorableSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE_COLUMN_SEPARATOR: {
				ExamplesTableColumnSeparator examplesTableColumnSeparator = (ExamplesTableColumnSeparator)theEObject;
				T result = caseExamplesTableColumnSeparator(examplesTableColumnSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE_VALUE_SEPARATOR: {
				ExamplesTableValueSeparator examplesTableValueSeparator = (ExamplesTableValueSeparator)theEObject;
				T result = caseExamplesTableValueSeparator(examplesTableValueSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.EXAMPLES_TABLE_HEADER_SEPARATOR: {
				ExamplesTableHeaderSeparator examplesTableHeaderSeparator = (ExamplesTableHeaderSeparator)theEObject;
				T result = caseExamplesTableHeaderSeparator(examplesTableHeaderSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Container Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Container Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeContainerBehavior(KnowledgeContainerBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steps Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steps Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepsLibrary(StepsLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorBook(BehaviorBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedder Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbedderDefinition(EmbedderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steps Implementation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steps Implementation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepsImplementationClass(StepsImplementationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStory(Story object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaProperty(MetaProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrative(Narrative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Order To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Order To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOrderTo(InOrderTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsA(AsA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWant To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWant To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWantTo(IWantTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given Stories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given Stories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGivenStories(GivenStories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryPath(StoryPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTable(ExamplesTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTableRow(ExamplesTableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTableHeader(ExamplesTableHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleTableCell(ExampleTableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepSentence(StepSentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSentence(ActionSentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectation(Expectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGiven(Given object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThen(Then object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepLink(StepLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGivenLink(GivenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenLink(WhenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThenLink(ThenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndLink(AndLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorySource(StorySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepParameter(StepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Parameter Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Parameter Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepParameterKey(StepParameterKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table Ignorable Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table Ignorable Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTableIgnorableSeparator(ExamplesTableIgnorableSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table Column Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table Column Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTableColumnSeparator(ExamplesTableColumnSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table Value Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table Value Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTableValueSeparator(ExamplesTableValueSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Table Header Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Table Header Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesTableHeaderSeparator(ExamplesTableHeaderSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Identified Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Identified Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractIdentifiedClass(AbstractIdentifiedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedClass(AbstractNamedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Described Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Described Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDescribedClass(AbstractDescribedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Knowledge Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Knowledge Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractKnowledgeContainer(AbstractKnowledgeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviorSwitch
