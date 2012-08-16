package org.lunifera.metamodel.dsl.entity.tests.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lunifera.metamodel.dsl.entity.tests.jpa.model.Client;
import org.lunifera.metamodel.dsl.entity.tests.jpa.model.Contract;
import org.lunifera.metamodel.dsl.entity.tests.jpa.model.Developer;
import org.lunifera.metamodel.dsl.entity.tests.jpa.model.Manager;
import org.lunifera.metamodel.dsl.entity.tests.jpa.model.Project;
import org.slf4j.Logger;

public class JPATests {

	private static final Logger logger = org.slf4j.LoggerFactory
			.getLogger(JPATests.class);

	private static final String PERSISTENCE_UNIT_NAME = "dbHSQL";
	private static EntityManagerFactory emf;
	private EntityManager em;

	@Before
	public void setupDB() throws Exception {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		// try {
		// //not working
		// em.getTransaction().commit();
		// Query q = em.createQuery("delete from JPALibrary");
		// q.executeUpdate();
		// q = em.createQuery("delete from RefersToByEmbedded");
		// q.executeUpdate();
		// q = em.createQuery("delete from TargetContains_Many");
		// q.executeUpdate();
		// q = em.createQuery("delete from TargetContains_One");
		// q.executeUpdate();
		// q = em.createQuery("delete from TargetRefers_Many");
		// q.executeUpdate();
		// q = em.createQuery("delete from TargetRefers_One");
		// q.executeUpdate();
		// q = em.createQuery("delete from ToBeEmbedded");
		// q.executeUpdate();
		// em.getTransaction().commit();

		// working
		// List<Client> clientList = new ArrayList<Client>();
		// List<Contract> contractList = new ArrayList<Contract>();
		// List<Developer> developerList = new ArrayList<Developer>();
		// List<Manager> managerList = new ArrayList<Manager>();
		// List<Project> projectList = new ArrayList<Project>();
		//
		// // Write Entries to Database
		// em.getTransaction().begin();
		// for (int i = 0; i < 4; i++) {
		// clientList.add(new Client());
		// clientList.get(i).setName("HG: " + i);
		// em.persist(clientList.get(i));
		// contractList.add(new Contract());
		// contractList.get(i).setName("HG: " + i);
		// em.persist(contractList.get(i));
		// developerList.add(new Developer());
		// developerList.get(i).setName("HG: " + i);
		// em.persist(developerList.get(i));
		// managerList.add(new Manager());
		// managerList.get(i).setName("HG: " + i);
		// em.persist(managerList.get(i));
		// projectList.add(new Project());
		// projectList.get(i).setName("HG: " + i);
		// em.persist(projectList.get(i));
		// }
		// em.getTransaction().commit();
		// } finally {
		// em.close();
		// emf.close();
		// }
	}

	/**
	 * Same test as contains_OneToOne, BUT an exception will be thrown, since
	 * refers references do NOT have Cascades.ALL defined.
	 */
	@Test
	public void refers_OneToOne__no_cascadePersists() {
		em.getTransaction().begin();
		try {
			Project project = new Project();
			project.setName("proj_refers_OneToOne__no_cascadePersists");
			Manager manager = new Manager();
			manager.setName("mng_refers_OneToOne__no_cascadePersists");
			project.setManager(manager);

			em.persist(project);
			em.getTransaction().commit();

			// must never reach that statement, since exception is thrown on
			// txn.commit()
			Assert.fail("Exception had to be thrown!");
		} catch (Exception ex) {
			// everything is fine
			logger.debug("Info: Exception thrown");
		} finally {
			em.close();
			emf.close();
		}
	}

	/**
	 * 
	 */
	@Test
	public void refers_OneToOne__no_cascadePersists_addAllPojosToEM() {
		em.getTransaction().begin();
		try {
			Project project = new Project();
			project.setName("proj_refers_OneToOne__addBothPojosToEM");
			Manager manager = new Manager();
			manager.setName("mng_refers_OneToOne__addBothPojosToEM");
			project.setManager(manager);

			em.persist(project);
			// add manager too
			em.persist(manager);
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}
	}

	@Test
	public void refers_OneToMany() {

	}

	/**
	 * The persist operation throws exception, since the cascades.ALL is not
	 * specified at Project, but at Contract
	 */
	@Test
	public void container_OneToOne__no_cascadePersist() {

		em.getTransaction().begin();
		try {
			Project project = new Project();
			project.setName("proj_containment_OneToOne__no_cascadePersist");
			Contract contract = new Contract();
			contract.setName("cntr_containment_OneToOne__no_cascadePersist");
			project.setContract(contract);

			em.persist(project);
			em.getTransaction().commit();

			// must never reach that statement, because exception must be thrown
			// on
			// txn.commit()
			Assert.fail("Exception had to be thrown!");
		} catch (Exception ex) {
			// everything is fine
			logger.debug("Info: Exception thrown");
		} finally {
			em.close();
			emf.close();
		}
	}

	/**
	 * Throws exception since no cascades is defined on contract#client
	 * reference.
	 */
	@Test
	public void container_OneToMany__no_cascadePersist() {
		em.getTransaction().begin();
		try {
			Client client = new Client();
			client.setName("client_containment_OneToMany__cascadePersist");
			Contract contract1 = new Contract();
			contract1
					.setName("contract1_containment_OneToMany__cascadePersist");
			client.addContracts(contract1);

			Contract contract2 = new Contract();
			contract2
					.setName("contract2_containment_OneToMany__cascadePersist");
			client.addContracts(contract2);

			em.persist(contract1);
			em.getTransaction().commit();

			// must never reach that statement, because exception must be thrown
			// on
			// txn.commit()
			Assert.fail("Exception had to be thrown!");
		} catch (Exception ex) {
			// everything is fine
			logger.debug("Info: Exception thrown");
		} finally {
			em.close();
			emf.close();
		}
	}

	/**
	 * The persist operation throws NO exception, since the cascades.ALL is
	 * specified at Contract
	 */
	@Test
	public void containment_OneToOne__cascadePersist() {

		try {
			// create new entires
			Project project = new Project();
			project.setName("proj_containment_OneToOne__cascadePersist");
			Contract contract = new Contract();
			contract.setName("cntr_containment_OneToOne__cascadePersist");
			project.setContract(contract);

			Assert.assertEquals(0, project.getId());
			Assert.assertEquals(0, contract.getId());

			// persist
			em.getTransaction().begin();
			em.persist(contract);
			em.getTransaction().commit();

			Assert.assertEquals(1, project.getId());
			Assert.assertEquals(1, contract.getId());

			em.getTransaction().begin();
			// read them again
			Contract readedContract = (Contract) em
					.createQuery("select e from Contract e where e.id = :id")
					.setParameter("id", 1).getResultList().get(0);
			Project readedProject = (Project) em
					.createQuery("select e from Project e where e.id = :id")
					.setParameter("id", 1).getResultList().get(0);
			// assert that the instances are the same
			Assert.assertSame(readedProject, readedContract.getProject());
			Assert.assertSame(readedContract, readedProject.getContract());

			// delete
			Assert.assertEquals(1, project.getId());
			Assert.assertEquals(1, contract.getId());

			em.remove(contract);
			em.getTransaction().commit();

			Query query = em
					.createQuery("select e.id from Contract e where e.id = :id");
			query.setParameter("id", 1);
			Assert.assertEquals(0, query.getResultList().size());

		} finally {
			em.close();
			emf.close();
		}
	}

	@Test
	public void refers_OneToMany__no_cascadePersist() {
		em.getTransaction().begin();
		try {
			Project project = new Project();
			project.setName("proj_containment_OneToMany__no_cascadePersist");
			Developer developer1 = new Developer();
			developer1.setName("dev1_containment_OneToMany__no_cascadePersist");
			project.addDevelopers(developer1);

			Developer developer2 = new Developer();
			developer2.setName("dev2_containment_OneToMany__no_cascadePersist");
			project.addDevelopers(developer2);

			em.persist(project);
			em.getTransaction().commit();

			// must never reach that statement, because exception must be thrown
			// on
			// txn.commit()
			Assert.fail("Exception had to be thrown!");
		} catch (Exception ex) {
			// everything is fine
			logger.debug("Info: Exception thrown");
		} finally {
			em.close();
			emf.close();
		}

	}

	@Test
	public void refers_OneToMany__no_cascadePersist__addAllPojosToEM() {
		em.getTransaction().begin();
		try {
			Project project = new Project();
			project.setName("proj_containment_OneToMany__no_cascadePersist");
			Developer developer1 = new Developer();
			developer1.setName("dev1_containment_OneToMany__no_cascadePersist");
			project.addDevelopers(developer1);

			Developer developer2 = new Developer();
			developer2.setName("dev2_containment_OneToMany__no_cascadePersist");
			project.addDevelopers(developer2);

			em.persist(project);
			em.persist(developer1);
			em.persist(developer2);
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}

	}

	@Test
	public void containment_OneToMany__cascadePersist() {
		em.getTransaction().begin();
		try {
			Client client = new Client();
			client.setName("client_containment_OneToMany__cascadePersist");
			Contract contract1 = new Contract();
			contract1
					.setName("contract1_containment_OneToMany__cascadePersist");
			client.addContracts(contract1);

			Contract contract2 = new Contract();
			contract2
					.setName("contract2_containment_OneToMany__cascadePersist");
			client.addContracts(contract2);

			em.persist(client);
			em.getTransaction().commit();

		} finally {
			em.close();
			emf.close();
		}
	}
}
