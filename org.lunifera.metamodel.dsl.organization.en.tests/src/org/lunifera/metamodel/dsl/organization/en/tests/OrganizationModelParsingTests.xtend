package org.lunifera.metamodel.dsl.organization.en.tests

import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.metamodel.dsl.organization.en.OrganizationDslInjectorProvider
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.Organization
import org.lunifera.metamodel.dsl.organization.en.organizationDsl.OrganizationDslPackage
import org.lunifera.metamodel.dsl.organization.en.tests.utils.CustomParseHelper

import static org.junit.Assert.*


@InjectWith(typeof(OrganizationDslInjectorProvider))
@RunWith(typeof(XtextRunner))
/**
 * Test 
 */
class OrganizationModelParsingTests extends AbstractXtextCommonTest {

	@Inject
	private CustomParseHelper<Organization> parser
	
   
    @Inject 
    private IScopeProvider scopeProvider
    
 	
	private Organization orgModel1
	private Organization orgModel2
	
	def parseTestFile (String name, ResourceSet resourceSet) {
    	val cl = Thread::currentThread().getContextClassLoader()
    	val in = cl.getResourceAsStream(name)
 		
 		assertNotNull("Couldn't find the resource file in classpath.", in)
 		
    	val uri = URI::createFileURI(name)
    	
    	return parser.parse(in, uri, null, resourceSet);
}
	
	@Before
	override void before(){
		
		super.before()
		
		orgModel2 = parseTestFile("tests/data/lunifera.organization", resourceSet)
		assertNotNull(orgModel2)
		orgModel1 = parseTestFile("tests/data/c4biz.organization", resourceSet)
		assertNotNull(orgModel1)
	}
	
	
	
	@Test
	// ensure that Organization is being populated rightly.
	def void ensureOrganizationFileAreBeingParsed() {
		// important: model2 should  be added first because the references

		assertEquals("Lunifera", orgModel2.name)
		assertEquals("C4Biz", orgModel1.name)
		assertEquals("C4Biz Information Technologies Consulting", orgModel1.longname )
		
		// assert Roles
		assertEquals(2, orgModel1.roleSet.roles.size)
		
		var role1 = orgModel1.roleSet.roles.get(0)
		assertEquals("systemAnalyst", role1.name)
		assertEquals("System Analyst",role1.longname)

		var role2 = orgModel1.roleSet.roles.get(1)
		assertEquals("javaProgrammer", role2.name)
		assertEquals("Java Programmer",role2.longname)
		
		// assert Units
		assertEquals(orgModel1.unitSet.units.size,1)
		
		var unit1 = orgModel1.unitSet.units.get(0)
		assertEquals("IT", unit1.name)
		assertEquals("IT Department", unit1.longName)
				
		// assert Persons
		assertEquals(orgModel1.personSet.people.size,1)
		
		var person1 = orgModel1.personSet.people.get(0)
		assertEquals("cvgaviao", person1.name)
		assertEquals("Cristiano", person1.firstName)		
		assertEquals("Gavião", person1.lastName)		
		assertEquals("cvgaviao@gmail.com", person1.email)		
		
		
		// assert Workers
		assertEquals(orgModel1.workerSet.workers.size,1)
		
		var worker1 = orgModel1.workerSet.workers.get(0)
		assertEquals(worker1.person, person1)
		assertEquals(worker1.allocationUnit, unit1)
		
		// assert Partnerships
		assertEquals(orgModel1.partnershipSet.partnerships.size,1)
		
		var partnership = orgModel1.partnershipSet.partnerships.head
		var partner = partnership.company
//		if (partner.eIsProxy()) {
//			partner = EcoreUtil2::resolve(partner, orgModel1) as Organization;
//		}
		
		assertEquals(partner.name, orgModel2.name)
		assertEquals(orgModel1.partnershipSet.partnerships.head.responsible, worker1)
		
		assertNotNull(partner)
		
		// assert model2
		assertEquals(partner.name,"Lunifera")

		assertEquals("Lunifera", orgModel2.name)
		assertEquals("Lunifera.org", orgModel2.longname )
	}
	
	/**
	 * Only companies coming from other models can be considered valid in proposals for a partner company.
	 */
	@Test
	def void ensureOnlyExternalCompaniesProposalsForPartnerCompany(){
		
		val reference = OrganizationDslPackage::eINSTANCE.partnership_Company
		val partner = orgModel1.partnershipSet.partnerships.head
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

		val reference = OrganizationDslPackage::eINSTANCE.worker_PlayRoles
		val worker = orgModel1.workerSet.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("c4biz.roles.systemAnalyst, c4biz.roles.javaProgrammer", actualProposals)				
	}
	
	/**
	 * Only persons coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalPersonProposalsForWorker(){
		
		val reference = OrganizationDslPackage::eINSTANCE.worker_Person
		val worker = orgModel1.workerSet.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("c4biz.people.cvgaviao", actualProposals)				
	}

	
	/**
	 * Only workers coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalWorkersProposalsForPartnershipResponsible(){
		
		val reference = OrganizationDslPackage::eINSTANCE.partnership_Responsible
		val partner = orgModel1.partnershipSet.partnerships.head
		assertNotNull(partner)
		
		var scope = scopeProvider.getScope(partner, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("c4biz.workers.cvgaviao", actualProposals)				
	}
	
	/**
	 * Only units coming from same model resource are allowed.
	 */
	@Test
	def void ensureOnlyInternalUnitProposalsForWorker(){
		
		val reference = OrganizationDslPackage::eINSTANCE.worker_AllocationUnit
		val worker = orgModel1.workerSet.workers.head
		assertNotNull(worker)
		
		var scope = scopeProvider.getScope(worker, reference)
		
		var actualProposals = scope.allElements.map[name.toString].join(", ")
		
		assertEquals("c4biz.units.IT", actualProposals)				
	}
}