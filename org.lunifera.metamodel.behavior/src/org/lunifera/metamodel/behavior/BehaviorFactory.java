/**
 */
package org.lunifera.metamodel.behavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.behavior.BehaviorPackage
 * @generated
 */
public interface BehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorFactory eINSTANCE = org.lunifera.metamodel.behavior.impl.BehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Knowledge Container Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Container Behavior</em>'.
	 * @generated
	 */
	KnowledgeContainerBehavior createKnowledgeContainerBehavior();

	/**
	 * Returns a new object of class '<em>Steps Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steps Library</em>'.
	 * @generated
	 */
	StepsLibrary createStepsLibrary();

	/**
	 * Returns a new object of class '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	BehaviorBook createBehaviorBook();

	/**
	 * Returns a new object of class '<em>Embedder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedder Definition</em>'.
	 * @generated
	 */
	EmbedderDefinition createEmbedderDefinition();

	/**
	 * Returns a new object of class '<em>Steps Implementation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steps Implementation Class</em>'.
	 * @generated
	 */
	StepsImplementationClass createStepsImplementationClass();

	/**
	 * Returns a new object of class '<em>Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story</em>'.
	 * @generated
	 */
	Story createStory();

	/**
	 * Returns a new object of class '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta</em>'.
	 * @generated
	 */
	Meta createMeta();

	/**
	 * Returns a new object of class '<em>Meta Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Property</em>'.
	 * @generated
	 */
	MetaProperty createMetaProperty();

	/**
	 * Returns a new object of class '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Narrative</em>'.
	 * @generated
	 */
	Narrative createNarrative();

	/**
	 * Returns a new object of class '<em>In Order To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Order To</em>'.
	 * @generated
	 */
	InOrderTo createInOrderTo();

	/**
	 * Returns a new object of class '<em>As A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As A</em>'.
	 * @generated
	 */
	AsA createAsA();

	/**
	 * Returns a new object of class '<em>IWant To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IWant To</em>'.
	 * @generated
	 */
	IWantTo createIWantTo();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Given Stories</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Given Stories</em>'.
	 * @generated
	 */
	GivenStories createGivenStories();

	/**
	 * Returns a new object of class '<em>Story Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story Path</em>'.
	 * @generated
	 */
	StoryPath createStoryPath();

	/**
	 * Returns a new object of class '<em>Examples Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table</em>'.
	 * @generated
	 */
	ExamplesTable createExamplesTable();

	/**
	 * Returns a new object of class '<em>Examples Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table Row</em>'.
	 * @generated
	 */
	ExamplesTableRow createExamplesTableRow();

	/**
	 * Returns a new object of class '<em>Examples Table Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table Header</em>'.
	 * @generated
	 */
	ExamplesTableHeader createExamplesTableHeader();

	/**
	 * Returns a new object of class '<em>Example Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Table Cell</em>'.
	 * @generated
	 */
	ExampleTableCell createExampleTableCell();

	/**
	 * Returns a new object of class '<em>Step Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Sentence</em>'.
	 * @generated
	 */
	StepSentence createStepSentence();

	/**
	 * Returns a new object of class '<em>Action Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Sentence</em>'.
	 * @generated
	 */
	ActionSentence createActionSentence();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expectation</em>'.
	 * @generated
	 */
	Expectation createExpectation();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Given</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Given</em>'.
	 * @generated
	 */
	Given createGiven();

	/**
	 * Returns a new object of class '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When</em>'.
	 * @generated
	 */
	When createWhen();

	/**
	 * Returns a new object of class '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Then</em>'.
	 * @generated
	 */
	Then createThen();

	/**
	 * Returns a new object of class '<em>Step Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Link</em>'.
	 * @generated
	 */
	StepLink createStepLink();

	/**
	 * Returns a new object of class '<em>Given Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Given Link</em>'.
	 * @generated
	 */
	GivenLink createGivenLink();

	/**
	 * Returns a new object of class '<em>When Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Link</em>'.
	 * @generated
	 */
	WhenLink createWhenLink();

	/**
	 * Returns a new object of class '<em>Then Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Then Link</em>'.
	 * @generated
	 */
	ThenLink createThenLink();

	/**
	 * Returns a new object of class '<em>And Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Link</em>'.
	 * @generated
	 */
	AndLink createAndLink();

	/**
	 * Returns a new object of class '<em>Story Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story Source</em>'.
	 * @generated
	 */
	StorySource createStorySource();

	/**
	 * Returns a new object of class '<em>Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Parameter</em>'.
	 * @generated
	 */
	StepParameter createStepParameter();

	/**
	 * Returns a new object of class '<em>Step Parameter Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Parameter Key</em>'.
	 * @generated
	 */
	StepParameterKey createStepParameterKey();

	/**
	 * Returns a new object of class '<em>Examples Table Ignorable Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table Ignorable Separator</em>'.
	 * @generated
	 */
	ExamplesTableIgnorableSeparator createExamplesTableIgnorableSeparator();

	/**
	 * Returns a new object of class '<em>Examples Table Column Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table Column Separator</em>'.
	 * @generated
	 */
	ExamplesTableColumnSeparator createExamplesTableColumnSeparator();

	/**
	 * Returns a new object of class '<em>Examples Table Value Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table Value Separator</em>'.
	 * @generated
	 */
	ExamplesTableValueSeparator createExamplesTableValueSeparator();

	/**
	 * Returns a new object of class '<em>Examples Table Header Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examples Table Header Separator</em>'.
	 * @generated
	 */
	ExamplesTableHeaderSeparator createExamplesTableHeaderSeparator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviorPackage getBehaviorPackage();

} //BehaviorFactory
