package org.lunifera.metamodel.dsl.component.template.library.tests

import java.util.Calendar
import java.util.GregorianCalendar
import javax.inject.Inject
import org.junit.Test

import static org.junit.Assert.*
import org.lunifera.metamodel.dsl.component.template.library.tests.utils.CustomParseHelper
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ComponentTemplateLibrary

/**
 * Test to ensure that ComponentTemplateLibrary is being parsed and populated properly.
 */
class ComponentTemplateLibraryParsingTests extends AbstractXtextCommonTest {

	@Inject extension CustomParseHelper<ComponentTemplateLibrary>

	@Test
	def void testParsingLibraryAttributes() {
		val library = '''
			libraryID org.lunifera.metamodel.dsl.software.library.templates.core.base
				description "My description"
				creationDate "10/01/2012"
				creator cvgaviao
				ownership org.lunifera
			}
		'''.parse
		
		assertEquals("org.lunifera.metamodel.dsl.software.library.templates.core.base", library.getName())
		assertNotNull("creationData is null", library.creationDate)
		
		var calendar =  GregorianCalendar::instance
		calendar.setTime(library.creationDate)
		assertEquals(2012, calendar.get(Calendar::YEAR))
		assertEquals(10, calendar.get(Calendar::DAY_OF_MONTH))
		assertEquals(0, calendar.get(Calendar::MONTH))
		
		var creator = library.creator
		assertNotNull("creator is null", creator)
		
		var ownership = library.creator
		assertNotNull("ownership is null", ownership)
		
	}
	@Test
	def void testParsingLibraryCompositionModelTypes() {
		val library = '''
			libraryID org.lunifera.metamodel.dsl.software.library.templates.core.base
			CompositionModelTypes:{
				compositionModelType abstract AbstractCompositionModelType {
			}

				compositionModelType GenericMix extends AbstractCompositionModelType	 {
					description "Used to create a component models using both conceptual and concrete elements."
				}	
			}
		'''.parse
		
		assertEquals("org.lunifera.metamodel.dsl.software.library.templates.core.base", library.getName())
		assertEquals("AbstractCompositionModelType", library.compositionModelTypeGroup.compositionModelTypes.get(0).name)
		assertEquals("GenericMix", library.compositionModelTypeGroup.compositionModelTypes.get(1).name)
		
	}
		
}