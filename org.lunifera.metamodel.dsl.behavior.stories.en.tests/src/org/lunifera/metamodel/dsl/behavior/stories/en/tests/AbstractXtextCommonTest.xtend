package org.lunifera.metamodel.dsl.behavior.stories.en.tests

import com.google.inject.Provider
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.AfterClass
import org.junit.Before
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension org.lunifera.metamodel.dsl.behavior.stories.en.tests.AbstractXtextCommonTest.*
import org.lunifera.metamodel.dsl.behavior.stories.en.tests.utils.CustomInjectorProvider
import org.lunifera.metamodel.dsl.behavior.stories.en.tests.utils.CustomParseHelper

@InjectWith(typeof(CustomInjectorProvider))
@RunWith(typeof(XtextRunner))
abstract class AbstractXtextCommonTest {
	
	protected static XtextResourceSet resourceSet
	
	@Inject
    protected Provider<XtextResourceSet> resourceSetProvider
	
	@Before
	def void before(){
		if(resourceSet == null)
			resourceSet = resourceSetProvider.get
	}
	
	def <T extends EObject> parseTestFile (String name, CustomParseHelper<T> parseHelper) {
    	val cl = Thread::currentThread().getContextClassLoader()
    	val in = cl?.getResourceAsStream(name)
 		
 		assertNotNull("Couldn't find the resource file in classpath.", in)
 		
    	val uri = URI::createFileURI(name)
    	
    	val readObj = parseHelper?.parse(in, uri, null, resourceSet)
	
    	return readObj
	}

	def <T extends EObject> parseText (CharSequence name, CustomParseHelper<T> parseHelper) {
    	
    	val readObj = parseHelper?.parse(name, resourceSet)
	
    	return readObj
	}
	
	@AfterClass
	def static void after(){
		resourceSet = null
	}
}