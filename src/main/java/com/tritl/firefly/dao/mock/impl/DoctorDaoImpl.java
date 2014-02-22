package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.DoctorDao;
import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.InsuranceProvider;

public class DoctorDaoImpl implements DoctorDao {

	// list is working as a database
	List<Doctor> doctors;

	public DoctorDaoImpl() {
		doctors = new ArrayList<Doctor>();
		Doctor doctor1 = new Doctor(0, "Robert");
		Doctor doctor2 = new Doctor(1, "John");
		InsuranceProvider InsuranceProvider1 = new InsuranceProvider(0,
				"Kaiser");
		InsuranceProvider InsuranceProvider2 = new InsuranceProvider(1,
				"Blue Cross");
		List<InsuranceProvider> list = new ArrayList<InsuranceProvider>();
		list.add(InsuranceProvider1);
		doctor1.setInsuranceProvider(list);
		list.add(InsuranceProvider2);
		doctor2.setInsuranceProvider(list);
		doctors.add(doctor1);
		doctors.add(doctor2);
	}

	// @Override
	public void deleteDoctor(Doctor doctor) {
		doctors.remove(doctor.getDoctorid());
		System.out.println(" Id " + doctor.getDoctorid()
				+ ", deleted from database");
	}

	// retrive list of students from the database
	// @Override
	public List<Doctor> getAllDoctors() {
		return doctors;
	}

	// @Override
	public Doctor getDoctor(int doctorId) {
		return doctors.get(doctorId);
	}

	// @Override
	public void updateDoctor(Doctor doctor) {
		doctors.get(doctor.getDoctorid()).setName((doctor.getName()));
		System.out.println(" Id " + doctor.getDoctorid()
				+ ", updated in the database");
	}
}