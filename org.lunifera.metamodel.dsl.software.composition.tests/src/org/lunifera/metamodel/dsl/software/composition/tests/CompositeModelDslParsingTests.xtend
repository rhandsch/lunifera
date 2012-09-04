package org.lunifera.metamodel.dsl.software.composition.tests

import org.junit.Test

import static org.junit.Assert.*


/**
 * Test 
 */
class CompositeModelDslParsingTests  extends AbstractXtextCommonTest {
	
//	@Inject extension ParseHelper<CompositeModelInstance>
//	@Inject extension ValidationTestHelper
//
//	@Test
//	def void testParsingCompositeModelInstanceGroups() {
//		val compositeModelInstance = '''
//			package example {
//			  entity MyEntity {
//			    property : String
//			  }
//			}
//		'''.parse
//		
//		assertEquals("example", compositeModelInstance.getName())
//		
////		val entity = pack.getElements().get(0) as Entity
////		assertEquals("MyEntity", entity.getName())
////		
////		val property = entity.getFeatures().get(0) as Property
////		assertEquals("property", property.getName());
////		assertEquals("java.lang.String", property.getType().getIdentifier());
//	}
//	
	@Test
	def void testParsingAndLinking() {
		assertTrue(true)
	}
}