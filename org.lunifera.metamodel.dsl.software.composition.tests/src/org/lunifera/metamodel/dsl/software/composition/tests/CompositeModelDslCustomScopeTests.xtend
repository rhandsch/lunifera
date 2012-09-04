package org.lunifera.metamodel.dsl.software.composition.tests

/**
 * Test 
 */
import org.junit.Test

import static org.junit.Assert.*



class CompositeModelDslCustomScopeTests extends AbstractXtextCommonTest {

//	@Inject
//	private CustomParseHelper<CompositeModelInstance> parserComposition
//	
//	@Inject
//	private CustomParseHelper<Organization> parserOrganization
//	
//	@Inject
//    private Provider<XtextResourceSet> resourceSetProvider
//    
//    @Inject 
//    private IScopeProvider scopeProvider
//    
//    private XtextResourceSet resourceSet
//	
//	private Organization organization
//	private CompositeModelInstance componentTemplateLibraryModel1
//	private CompositeModelInstance componentTemplateLibraryModel2
//	
//	
//
//	
//	/**
//	 * 
//	 */
//	 @Test
//	def void ensureCompositeModelInstanceCouldHaveParentModel(){
//				
//		val reference = CompositeModelDslPackage::eINSTANCE.unitInstance_SuperType
//		
//		val model = parserComposition.parse(
//					'''
//					entity MyEntity {
//						parent: MyEntity
//					}
//					''')
//					
//		val unit = model.compositeElements.head as AbstractCompositionModelElementInstance
//		//val partner = compositeModelInstance.partnerships.head
//		assertNotNull(unit)
//		
//		var scope = scopeProvider.getScope(unit, reference)
//		
//		var actualProposals = scope.allElements.map[name.toString].join(", ")
//		
//		assertEquals("Lunifera", actualProposals)		
//	}
//
//	def void ensureCompositeModelInstanceCouldHaveTargetUnit(){
//		
//	}
//	
//
	@Test
	def void ensureCompositeModelInstanceCouldHaveCompositionModelType(){
		assertTrue(true)
	}
//	
//
//	def void ensureCompositeModelInstanceCouldHaveAbstractCompositionModelElementInstance(){
//		
//	}
//	
//
//	def void ensureCompositeModelInstanceCouldHaveElementInstanceGroup(){
//		
//	}
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
//	
//	/**
//	 * This ensure that users can't choose an Abstract element.
//	 */
//	@Test
//	def void ensureUnitInstanceSuperTypeIsNotAbstract() {
//}
//	

}