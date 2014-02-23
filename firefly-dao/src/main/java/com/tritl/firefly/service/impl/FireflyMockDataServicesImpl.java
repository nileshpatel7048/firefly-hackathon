package com.tritl.firefly.service.impl;

import java.util.List;

import com.tritl.firefly.dao.DiseasesDao;
import com.tritl.firefly.dao.DoctorDao;
import com.tritl.firefly.dao.InsuranceProviderDao;
import com.tritl.firefly.dao.PersonDao;
import com.tritl.firefly.dao.PlanDao;
import com.tritl.firefly.model.Diseases;
import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Person;
import com.tritl.firefly.model.Plan;
import com.tritl.firefly.service.FireflyDataServices;

public class FireflyMockDataServicesImpl implements FireflyDataServices {

	private DiseasesDao diseaseDao;
	private DoctorDao doctorDao;
	private PersonDao personDao;
	
	private PlanDao planDao;
	
	public PlanDao getPlanDao() {
		return planDao;
	}
	public DiseasesDao getDiseaseDao() {
		return diseaseDao;
	}

	public void setDiseaseDao(DiseasesDao diseaseDao) {
		this.diseaseDao = diseaseDao;
	}

	public DoctorDao getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public InsuranceProviderDao getInsuranceDao() {
		return insuranceDao;
	}

	public void setInsuranceDao(InsuranceProviderDao insuranceDao) {
		this.insuranceDao = insuranceDao;
	}

	private InsuranceProviderDao insuranceDao;

	public List<Diseases> getAllDiseases() {
		return diseaseDao.getAllDiseases();
	}

	public Diseases getDiseases(int diseasesId) {
		return diseaseDao.getDiseases(diseasesId);
	}

	public void updateDiseases(Diseases desease) {
		diseaseDao.updateDiseases(desease);
	}

	public void deleteDiseases(Diseases desease) {
		diseaseDao.deleteDiseases(desease);
	}

	public List<Doctor> getAllDoctors() {
		return doctorDao.getAllDoctors();
	}

	public Doctor getDoctor(int doctorId) {
		return doctorDao.getDoctor(doctorId);
	}

	public void updateDoctor(Doctor doctor) {
		doctorDao.updateDoctor(doctor);
	}

	public void deleteDoctor(Doctor doctor) {
		doctorDao.deleteDoctor(doctor);
	}

	public List<InsuranceProvider> getAllInsuranceProviders() {
		return insuranceDao.getAllInsuranceProviders();
	}

	public InsuranceProvider getInsuranceProvider(int InsuranceProviderId) {
		return insuranceDao.getInsuranceProvider(InsuranceProviderId);
	}

	public void updateInsuranceProvider(InsuranceProvider insuranceProvider) {
		insuranceDao.updateInsuranceProvider(insuranceProvider);
	}

	public void deleteInsuranceProvider(InsuranceProvider insuranceProvider) {
		insuranceDao.deleteInsuranceProvider(insuranceProvider);
	}

	public List<Person> getAllPersons() {
		return personDao.getAllPersons();
	}

	public Person getPerson(int personId) {
		return personDao.getPerson(personId);
	}

	public void updatePerson(Person person) {
		personDao.updatePerson(person);
	}

	public void deletePerson(Person person) {
		personDao.deletePerson(person);
	}
	
	public List<Doctor> getPCPs(String zip,String hcprovider){ return doctorDao.getAllDoctors();}
	   
	public List<InsuranceProvider> getHCPRecommendList(String dob, String zip,String hcprovider,String[] diseases){return insuranceDao.getAllInsuranceProviders();}
	
	public Plan getHCPlanDetails(int providerId, int plan_id){ return planDao.getPlan(plan_id);}

}
