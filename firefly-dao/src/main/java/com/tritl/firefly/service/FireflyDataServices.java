package com.tritl.firefly.service;

import java.util.List;

import com.tritl.firefly.model.Diseases;
import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Person;

public interface FireflyDataServices {

	public List<Diseases> getAllDiseases();

	public Diseases getDiseases(int diseasesId);

	public void updateDiseases(Diseases desease);

	public void deleteDiseases(Diseases desease);

	public List<Doctor> getAllDoctors();

	public Doctor getDoctor(int doctorId);

	public void updateDoctor(Doctor doctor);

	public void deleteDoctor(Doctor doctor);

	public List<InsuranceProvider> getAllInsuranceProviders();

	public InsuranceProvider getInsuranceProvider(int InsuranceProviderId);

	public void updateInsuranceProvider(InsuranceProvider insuranceProvider);

	public void deleteInsuranceProvider(InsuranceProvider insuranceProvider);

	public List<Person> getAllPersons();

	public Person getPerson(int rollNo);

	public void updatePerson(Person person);

	public void deletePerson(Person person);

}
