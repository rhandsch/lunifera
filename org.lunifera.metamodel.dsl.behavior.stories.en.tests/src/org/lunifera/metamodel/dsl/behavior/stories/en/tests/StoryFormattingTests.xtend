package org.lunifera.metamodel.dsl.behavior.stories.en.tests

import javax.inject.Inject
import org.eclipse.xtext.serializer.ISerializer
import org.junit.Test
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Story
import org.lunifera.metamodel.dsl.behavior.stories.en.tests.utils.CustomParseHelper
import org.eclipse.xtext.resource.SaveOptions

import static org.junit.Assert.*


class StoryFormattingTests extends AbstractXtextCommonTest{
	
	
	@Inject extension CustomParseHelper<Story>
	
	@Inject extension ISerializer
	
	@Test
	def void testFormattingForMeta() {

		val storyIn = 
		'''
		Meta:@author cvgaviao @org lunifera
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyFormatted = 
			'''
			Meta:
				@author cvgaviao
				@org lunifera'''.toString

		assertEquals(storyFormatted, storyIn)
	}	

	@Test
	def void testFormattingForMetaWithLineWrapInEnd() {

		val storyIn = 
		'''
		Meta:@author cvgaviao
		Scenario: A simple successful scenario
		Scenario: Another simple successful scenario
		'''.parse.serialize(SaveOptions::newBuilder.format().getOptions())
		
		val storyFormatted = 
			'''
			Meta:
				@author cvgaviao

			Scenario: A simple successful scenario

			Scenario: Another simple successful scenario
			'''.toString

		assertEquals(storyFormatted, storyIn)
	}	

	@Test
	def void testIndentForAndSteps() {

		val storyParsed = 
		'''
		Scenario: A simple successful scenario
		Given a test When a test is executed
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
	
}