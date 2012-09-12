package org.lunifera.metamodel.dsl.behavior.stories.en.tests

import javax.inject.Inject
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Story
import org.lunifera.metamodel.dsl.behavior.stories.en.tests.utils.CustomParseHelper

import static org.junit.Assert.*
import org.junit.Test

class StoryFormattingTests extends AbstractXtextCommonTest{
	
	
	@Inject extension CustomParseHelper<Story>
	
	@Inject extension ISerializer
	
	@Test
	def void testFormattingForLineWrapInComment() {

		val storyIn = 
		'''
		Narrative: In order to communicate effectively to the business some functionality 
		!--As a development_team
		I want to use Behaviour-Driven Development
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyExpected = 
			'''
			
			
			Narrative:
				In order to communicate effectively to the business some functionality
				!--As a development_team
				I want to use Behaviour-Driven Development'''.toString

		assertEquals(storyExpected, storyIn)
	}

	@Test
	def void testFormattingForMetaElementIndent() {

		val storyIn = 
		'''
		Meta:@ author cvgaviao @ org lunifera
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyExpected = 
			'''
			
			
			Meta:
				@author cvgaviao
				@org lunifera'''.toString

		assertEquals(storyExpected, storyIn)
	}
		
	@Test
	def void testFormattingLineWrapAroundMeta() {

		val storyIn = 
		'''
		A story is a collection of scenarios Meta: @aCustomTag aValue
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyExpected = 
			'''
			A story is a collection of scenarios
			
			Meta:
				@aCustomTag aValue'''.toString

		assertEquals(storyExpected, storyIn)
	}	

	@Test
	def void testFormattingLineWrapAroundNarrative() {

		val storyIn = 
		'''
			Narrative:
			In order to 
			communicate effectively to the business some functionality
			As a systemAnalyst
			I want to 
			use Behaviour-Driven Development

		'''.parse(resourceSet).serialize(SaveOptions::newBuilder.format().getOptions())
		
				'''
			Organization:
			{
				code Lunifera
				name "Lunifera.org"
				Roles:{
					Role:{
						code systemAnalyst
						name "System Analyst"
					}
				}
			}
		'''.loadTextResource(resourceSet,"organization")
		
		val storyExpected = 
			'''
				
				
				Narrative:
					In order to communicate effectively to the business some functionality
					As a systemAnalyst
					I want to use Behaviour-Driven Development'''.toString

		assertEquals(storyExpected, storyIn)
	}	


	@Test
	def void testFormattingForLineWrapAroudScenarioKeyword() {

		val storyIn = 
		'''
		Scenario: A simple successful scenario
		Scenario: Another simple successful scenario
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyExpected = 
			'''


			Scenario: A simple successful scenario
			
			Scenario: Another simple successful scenario'''.toString

		assertEquals(storyExpected, storyIn)
	}	

	@Test
	def void testIndentForAndSteps() {

		val storyParsed = 
		'''
		Scenario: A simple successful scenario
		Given a test 
		When a test is executed
		And another test is executed
		Then a tester is pleased
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyExpected = 
			'''
			
			
			Scenario: A simple successful scenario
				Given a test
				When a test is executed
					And another test is executed
				Then a tester is pleased'''.toString

		assertEquals(storyExpected, storyParsed)
	}	
	@Test
	def void testFormatingForExampleTable() {

		val storyParsed = 
		'''
		Scenario: A simple successful scenario
		Given a test 
		When a test is executed
		And another test is executed
		Then a tester is pleased
		Examples:
		|h1|h2|h3||col1|col2|col3|
		
		Scenario: Another simple successful scenario
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyExpected = 
			'''
			
			
			Scenario: A simple successful scenario
				Given a test
				When a test is executed
					And another test is executed
				Then a tester is pleased

				Examples:
				|h1|h2|h3|
				|col1|col2|col3|
			
			Scenario: Another simple successful scenario'''.toString

		assertEquals(storyExpected, storyParsed)
	}	
	
}