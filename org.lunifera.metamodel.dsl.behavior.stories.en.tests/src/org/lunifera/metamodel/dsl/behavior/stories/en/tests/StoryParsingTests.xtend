package org.lunifera.metamodel.dsl.behavior.stories.en.tests

import javax.inject.Inject
import org.junit.Test
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.MetaElementDefault
import org.lunifera.metamodel.dsl.behavior.stories.en.storyDsl.Story
import org.lunifera.metamodel.dsl.behavior.stories.en.tests.utils.CustomParseHelper

import static org.junit.Assert.*
import static org.lunifera.metamodel.dsl.behavior.stories.en.tests.AbstractXtextCommonTest.*

class StoryParsingTests extends AbstractXtextCommonTest{
	int i
		
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
		As a lunifera.roles.javaProgrammer, lunifera.roles.systemAnalyst
		I want to use Behaviour-Driven Development
		'''.parse(resourceSet)
		
		'''
			
			code Lunifera
			name "Lunifera.org"
			Business Roles:
				role id systemAnalyst
				{
					name "System Analyst"
				}
				role id javaProgrammer
				{
					name "Java Programmer"
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
	@Test
	def void testParsingStoryExampleTable() {

		
		val storyIn = 
		'''
		Scenario: A simple successful scenario
		Given a test 
		When a test is executed
		And another test is executed
		Then a tester is pleased
		Examples:
		|h1|h2|h3|
		|cell11|cell12|cell13|
		|cell21|cell22|cell23|
		'''.parse
		
		val values = "h1,h2,h3&cell11,cell12,cell13&cell21,cell22,cell23".split("&")
		
		val exampleTable = storyIn.scenarios.get(0).examples
		val tableRows = exampleTable.table.rows
		
		assertEquals(3, tableRows.size)
		
		
		if (!tableRows.nullOrEmpty) {
			for(row: tableRows)
			{
				val rowCellValues = row.cells.map[name.toString].join(",")
				assertEquals(values.get(i), rowCellValues)
				i=i+1
			}
        }
	}
}