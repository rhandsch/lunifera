package org.lunifera.metamodel.dsl.business.processes.tests

import com.google.inject.Provider
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.lunifera.metamodel.dsl.business.processes.tests.utils.CustomInjectorProvider
import org.lunifera.metamodel.dsl.business.processes.tests.utils.CustomParseHelper

@InjectWith(typeof(CustomInjectorProvider))
@RunWith(typeof(XtextRunner))

abstract class AbstractXtextCommonTest {
	
	protected static XtextResourceSet resourceSet
	
	@Inject
    protected Provider<XtextResourceSet> resourceSetProvider
	
	@Inject 
    protected IScopeProvider scopeProvider
		
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
	
	@After
	def void after(){
		resourceSet = null
	}
}