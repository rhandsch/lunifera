package org.lunifera.metamodel.dsl.behavior.stories.en.tests

import javax.inject.Inject
import org.junit.Test
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementDefault
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Story
import org.lunifera.metamodel.dsl.behavior.stories.en.tests.utils.CustomParseHelper

import static org.junit.Assert.*
import static org.lunifera.metamodel.dsl.behavior.stories.en.tests.AbstractXtextCommonTest.*

class StoryParsingTests extends AbstractXtextCommonTest{
		
	@Inject extension
	CustomParseHelper<Story> parser
	
	
	@Test
	def void testStoryDescriptionParsing() {

		val storyIn =
		'''
		A story is a collection of scenarios

		Meta:
		@aCustomTag aValue
		'''.parse
		
		
		val storyDescription = storyIn.description
	
		assertEquals(storyDescription, "A story is a collection of scenarios")
	}	
	
	@Test
	def void testStoryNarrativeParsing() {
		val storyIn = 
		'''
		Narrative: 
		In order to communicate effectively to the business some functionality
		As a Lunifera.javaProgrammer, Lunifera.systemAnalyst
		I want to use Behaviour-Driven Development
		'''.parse(resourceSet)
		
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
					Role:{
						code javaProgrammer
						name "Java Programmer"
					}
				}
			}
		'''.loadTextResource(resourceSet,"organization")
		
		
		
		val storyinOrderTo = storyIn.narrative.inOrderTo
		val storyIWantTo = storyIn.narrative.IWantTo
		val storyasA = storyIn.narrative.asA
	
		
		assertEquals("communicate effectively to the business some functionality", storyinOrderTo.name)
		assertEquals("use Behaviour-Driven Development", storyIWantTo.name)
		assertEquals(2, storyasA.roles.size)
		assertEquals("javaProgrammer", storyasA.roles.get(0).name)
		assertEquals("systemAnalyst", storyasA.roles.get(1).name)
	}
	
	@Test
	def void testStoryMetaParsing() {

		val storyIn = 
		'''
		Meta:
		@aCustomTag aValue
		'''.parse
		
		val storyMeta = storyIn.meta.metaElements
		val storyMeta1 = storyIn.meta.metaElements.get(0) as MetaElementDefault
		
		assertEquals(1, storyMeta.size)
		assertEquals("aCustomTag", storyMeta1.name)
		assertEquals("aValue", storyMeta1.value)
	}	


}