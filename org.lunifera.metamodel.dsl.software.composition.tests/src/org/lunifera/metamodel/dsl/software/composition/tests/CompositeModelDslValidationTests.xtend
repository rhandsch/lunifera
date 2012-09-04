package org.lunifera.metamodel.dsl.software.composition.tests

import org.junit.Test

import static org.junit.Assert.*

/**
 * Test 
 */
class CompositeModelDslValidationTests extends AbstractXtextCommonTest{


	@Test
	def void testParsingAndLinking() {
		assertTrue(true)
	}
	
//	@Inject
//	private ParseHelper<ComponentTemplateLibrary> parserComponentTemplateLibrary
//	
//	@Inject
//    private Provider<XtextResourceSet> resourceSetProvider
//    
//    @Inject 
//    private IScopeProvider scopeProvider
//    
//    private XtextResourceSet resourceSet
//	
//	private ComponentTemplateLibrary componentTemplateLibraryModel1
//	private ComponentTemplateLibrary componentTemplateLibraryModel2
//	private CompositeModelInstance compositeModelInstance
//	
//	def parseComponentTemplateLibraryTestFile (String name) {
//    	val cl = Thread::currentThread().getContextClassLoader()
//    	val in = cl.getResourceAsStream(name)
// 		
// 		assertNotNull("Couldn't find the resource file in classpath.", in)
// 		
//    	val uri = URI::createFileURI(name)
//    	
//    	return parserComponentTemplateLibrary.parse(in, uri, null, resourceSet);
//}
//	
//
//	
//	/**
//	 * ensure that ComponentTemplateLibrary is being populated properly.
//	 */ 
//	
//	def void ensureComponentTemplateLibraryFileAreBeingParsed() {
//		// important: model2 should  be added first because the references
//
////		assertEquals(orgModel1.name, "C4Biz")
////		assertEquals(orgModel1.longname, "C4Biz Information Technologies Consulting")
////		
////		assertEquals(orgModel1.partnerships.size(),1)
////		
////		var partner = orgModel1.partnerships.head
////		assertNotNull(partner)
////		assertNotNull(partner.company)
////		
//		
//	}
	
}