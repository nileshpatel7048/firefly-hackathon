package com.tritl.firefly.service.impl;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.tritl.firefly.dao.DiseasesDao;
import com.tritl.firefly.dao.DoctorDao;
import com.tritl.firefly.dao.InsuranceProviderDao;
import com.tritl.firefly.dao.PersonDao;
import com.tritl.firefly.dao.mock.impl.DiseaseDaoImpl;
import com.tritl.firefly.dao.mock.impl.DoctorDaoImpl;
import com.tritl.firefly.dao.mock.impl.InsuranceProviderDaoImpl;
import com.tritl.firefly.dao.mock.impl.PersonDaoImpl;
import com.tritl.firefly.model.Diseases;
import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Person;

/**
 * The class <code>FireflyMockDataServicesImplTest</code> contains tests for the class <code>{@link FireflyMockDataServicesImpl}</code>.
 *
 * @generatedBy CodePro at 2/15/14 7:50 PM
 * @author hackathon
 * @version $Revision: 1.0 $
 */
public class FireflyMockDataServicesImplTest {
	/**
	 * Run the void deleteDiseases(Diseases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testDeleteDiseases_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		Diseases desease = new Diseases(1, "");

		fixture.deleteDiseases(desease);

		// add additional test code here
	}

	/**
	 * Run the void deleteDoctor(Doctor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testDeleteDoctor_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		Doctor doctor = new Doctor(1, "");

		fixture.deleteDoctor(doctor);

		// add additional test code here
	}

	/**
	 * Run the void deleteInsuranceProvider(InsuranceProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testDeleteInsuranceProvider_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		InsuranceProvider insuranceProvider = new InsuranceProvider(1, "");

		fixture.deleteInsuranceProvider(insuranceProvider);

		// add additional test code here
	}

	/**
	 * Run the void deletePerson(Person) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testDeletePerson_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		Person person = new Person(1, "");

		fixture.deletePerson(person);

		// add additional test code here
	}

	/**
	 * Run the List<Diseases> getAllDiseases() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetAllDiseases_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		List<Diseases> result = fixture.getAllDiseases();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Doctor> getAllDoctors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetAllDoctors_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		List<Doctor> result = fixture.getAllDoctors();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<InsuranceProvider> getAllInsuranceProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetAllInsuranceProviders_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		List<InsuranceProvider> result = fixture.getAllInsuranceProviders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Person> getAllPersons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetAllPersons_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		List<Person> result = fixture.getAllPersons();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the DiseasesDao getDiseaseDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetDiseaseDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		DiseasesDao result = fixture.getDiseaseDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Diseases getDiseases(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetDiseases_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		int diseasesId = 1;

		Diseases result = fixture.getDiseases(diseasesId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Lung Cancer", result.getName());
		assertEquals(1, result.getDiseasesId());
	}

	/**
	 * Run the Doctor getDoctor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetDoctor_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		int doctorId = 1;

		Doctor result = fixture.getDoctor(doctorId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("John", result.getName());
		assertEquals(1, result.getDoctorid());
	}

	/**
	 * Run the DoctorDao getDoctorDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetDoctorDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		DoctorDao result = fixture.getDoctorDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InsuranceProviderDao getInsuranceDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetInsuranceDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		InsuranceProviderDao result = fixture.getInsuranceDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InsuranceProvider getInsuranceProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetInsuranceProvider_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		int InsuranceProviderId = 1;

		InsuranceProvider result = fixture.getInsuranceProvider(InsuranceProviderId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Blue Cross", result.getName());
		assertEquals(1, result.getInsuranceproviderId());
	}

	/**
	 * Run the Person getPerson(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetPerson_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		int personId = 1;

		Person result = fixture.getPerson(personId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPassword());
		assertEquals(1, result.getPersonId());
		assertEquals(null, result.getDob());
		assertEquals(0, result.getZipcode());
		assertEquals(null, result.getEmail());
		assertEquals("John", result.getPersonName());
	}

	/**
	 * Run the PersonDao getPersonDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testGetPersonDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());

		PersonDao result = fixture.getPersonDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDiseaseDao(DiseasesDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testSetDiseaseDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		DiseasesDao diseaseDao = new DiseaseDaoImpl();

		fixture.setDiseaseDao(diseaseDao);

		// add additional test code here
	}

	/**
	 * Run the void setDoctorDao(DoctorDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testSetDoctorDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		DoctorDao doctorDao = new DoctorDaoImpl();

		fixture.setDoctorDao(doctorDao);

		// add additional test code here
	}

	/**
	 * Run the void setInsuranceDao(InsuranceProviderDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testSetInsuranceDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		InsuranceProviderDao insuranceDao = new InsuranceProviderDaoImpl();

		fixture.setInsuranceDao(insuranceDao);

		// add additional test code here
	}

	/**
	 * Run the void setPersonDao(PersonDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testSetPersonDao_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		PersonDao personDao = new PersonDaoImpl();

		fixture.setPersonDao(personDao);

		// add additional test code here
	}

	/**
	 * Run the void updateDiseases(Diseases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testUpdateDiseases_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		Diseases desease = new Diseases(1, "");

		fixture.updateDiseases(desease);

		// add additional test code here
	}

	/**
	 * Run the void updateDoctor(Doctor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testUpdateDoctor_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		Doctor doctor = new Doctor(1, "");

		fixture.updateDoctor(doctor);

		// add additional test code here
	}

	/**
	 * Run the void updateInsuranceProvider(InsuranceProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testUpdateInsuranceProvider_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		InsuranceProvider insuranceProvider = new InsuranceProvider(1, "");

		fixture.updateInsuranceProvider(insuranceProvider);

		// add additional test code here
	}

	/**
	 * Run the void updatePerson(Person) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Test
	public void testUpdatePerson_1()
		throws Exception {
		FireflyMockDataServicesImpl fixture = new FireflyMockDataServicesImpl();
		fixture.setDoctorDao(new DoctorDaoImpl());
		fixture.setInsuranceDao(new InsuranceProviderDaoImpl());
		fixture.setPersonDao(new PersonDaoImpl());
		fixture.setDiseaseDao(new DiseaseDaoImpl());
		Person person = new Person(1, "");

		fixture.updatePerson(person);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/15/14 7:50 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FireflyMockDataServicesImplTest.class);
	}
}