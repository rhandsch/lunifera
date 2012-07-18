package org.lunifera.metamodel.dsl.organization.en.tests

import com.google.inject.Provider
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.metamodel.dsl.organization.en.OrganizationDslInjectorProvider
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.Organization
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.OrganizationDslPackage

import static org.junit.Assert.*

import static extension org.lunifera.metamodel.dsl.organization.en.tests.TestCompleteOrganizationModel.*

@InjectWith(typeof(OrganizationDslInjectorProvider))
@RunWith(typeof(XtextRunner))
/**
 * Test 
 */
class TestCompleteOrganizationModel {

	@Inject
	private ParseHelper<Organization> parser
	
	@Inject
    private Provider<XtextResourceSet> resourceSetProvider
    
    @Inject 
    private IScopeProvider scopeProvider
    
    private XtextResourceSet resourceSet
	
	private Organization orgModel1
	private Organization orgModel2
	
	def parseTestFile (String name) {
    	val cl = Thread::currentThread().getContextClassLoader()
    	val in = cl.getResourceAsStream(name)
 		
 		assertNotNull("Couldn't find the resource file in classpath.", in)
 		
    	val uri = URI::createFileURI(name)
    	
    	return parser.parse(in, uri, null, resourceSet);
}
	
	@Before
	def void before(){
		
		resourceSet = resourceSetProvider.get
		
		orgModel2 = parseTestFile("tests/data/lunifera.organization")
		assertNotNull(orgModel2)
		orgModel1 = parseTestFile("tests/data/c4biz.organization")
		assertNotNull(orgModel1)
	}
	
	@Test
	// ensure that Organization is being populated rightly.
	def void ensureOrganizationFileAreBeingParsed() {
		// important: model2 should  be added first because the references

		assertEquals(orgModel1.name, "C4Biz")
		assertEquals(orgModel1.longname, "C4Biz Information Technologies Consulting")
		
		assertEquals(orgModel1.partnerships.size(),1)
		
		var partner = orgModel1.partnerships.head
		assertNotNull(partner)
		assertNotNull(partner.company)
		
		
		// assert Roles
		assertEquals(orgModel1.roles.size,2)
		
		var role1 = orgModel1.roles.get(0)
		assertEquals(role1.name, "systemAnalyst")
		assertEquals(role1.longname, "System Analyst")

		var role2 = orgModel1.roles.get(1)
		assertEquals(role2.name, "javaProgrammer")
		assertEquals(role2.longname, "Java Programmer")
		
		// assert Units
		assertEquals(orgModel1.units.size,1)
		
		var unit1 = orgModel1.units.get(0)
		assertEquals(unit1.name, "IT")
		assertEquals(unit1.longname, "IT Department")
		
		// assert Positions
		assertEquals(orgModel1.positions.size,1)
		
		var position1 = orgModel1.positions.get(0)
		assertEquals(position1.name, "admin")
		assertEquals(position1.longname, "Administrator")		
		assertEquals(position1.description, "First job in the hierarchy")		
		
		// assert Persons
		assertEquals(orgModel1.persons.size,1)
		
		var person1 = orgModel1.persons.get(0)
		assertEquals(person1.name, "cvgaviao")
		assertEquals(person1.firstName, "Cristiano")		
		assertEquals(person1.lastName, "Gavião")		
		assertEquals(person1.email, "cvgaviao@gmail.com")		
		
		
		// assert Workers
		assertEquals(orgModel1.workers.size,1)
		
		var worker1 = orgModel1.workers.get(0)
		assertEquals(worker1.person, person1)
		assertEquals(worker1.position, position1)
		assertEquals(worker1.allocationUnit, unit1)
		
		// assert Partnerships
		assertEquals(orgModel1.persons.size,1)
		
		var partnership1 = orgModel1.partnerships.get(0)
		assertEquals(partnership1.company, orgModel2)
		assertEquals(partnership1.responsible, worker1)
		
		
		// assert model2
		assertEquals(partner.company.name,"Lunifera")

		assertEquals(orgModel2.name, "Lunifera")
		assertEquals(orgModel2.longname, "Lunifera.org")
	}
	
	/**
	 * Only companies coming from other models can be considered valid in proposals for a partner company.
	 */
	@Test
	def void ensureOnlyExternalCompaniesProposalsForPartnerCompany(){
		
		val reference = OrganizationDslPackage::eINSTANCE.partnership_Company
		val partner = orgModel1.partnerships.head
		assertNotNull(partner)
		
		var scope = scopeProvider.getScope(partner, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("Lunifera", actualProposals)		
	}
	
	/**
	 * Only roles coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalRolesProposalsForWorker(){

		val reference = OrganizationDslPackage::eINSTANCE.worker_PersonRoles
		val worker = orgModel1.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("systemAnalyst, javaProgrammer, C4Biz.systemAnalyst, C4Biz.javaProgrammer", actualProposals)				
	}
	
	/**
	 * Only persons coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalPersonProposalsForWorker(){
		
		val reference = OrganizationDslPackage::eINSTANCE.worker_Person
		val worker = orgModel1.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("cvgaviao, C4Biz.cvgaviao", actualProposals)				
	}

	/**
	 * Only positions coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalPositionProposalsForWorker(){
		
		val reference = OrganizationDslPackage::eINSTANCE.worker_Position
		val worker = orgModel1.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("admin, C4Biz.admin", actualProposals)				
	}
	
	/**
	 * Only workers coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalWorkersProposalsForPartnershipResponsible(){
		
		val reference = OrganizationDslPackage::eINSTANCE.partnership_Responsible
		val partner = orgModel1.partnerships.head
		assertNotNull(partner)
		
		var scope = scopeProvider.getScope(partner, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("cvgaviao, C4Biz.cvgaviao", actualProposals)				
	}
	
	/**
	 * Only units coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalUnitProposalsForWorker(){
		
		val reference = OrganizationDslPackage::eINSTANCE.worker_AllocationUnit
		val worker = orgModel1.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("IT, C4Biz.IT", actualProposals)				
	}
}