package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.DiseasesDao;
import com.tritl.firefly.model.Diseases;

;

public class DiseaseDaoImpl implements DiseasesDao {

	// list is working as a database
	List<Diseases> diseases;

	public DiseaseDaoImpl() {
		diseases = new ArrayList<Diseases>();
		Diseases disease1 = new Diseases(0, "Breast Cancer");
		Diseases disease2 = new Diseases(1, "Lung Cancer");
		Diseases disease3 = new Diseases(2, "Prostate Cancer");
		Diseases disease4 = new Diseases(3, "Diabetes");
		Diseases disease5 = new Diseases(4, "Other Cancer");
		diseases.add(disease1);
		diseases.add(disease2);
		diseases.add(disease3);
		diseases.add(disease4);
		diseases.add(disease5);
	}

	// @Override
	public void deleteDiseases(Diseases disease) {
		diseases.remove(disease.getDiseasesId());
		System.out.println("Disease: Id " + disease.getDiseasesId()
				+ ", deleted from database");
	}

	// retrive list of Diseases from the database
	// @Override
	public List<Diseases> getAllDiseases() {
		return diseases;
	}

	// @Override
	public Diseases getDiseases(int diseaseId) {
		return diseases.get(diseaseId);
	}

	// @Override
	public void updateDiseases(Diseases disease) {
		diseases.get(disease.getDiseasesId()).setName(disease.getName());
		System.out.println("Disease: Id " + disease.getDiseasesId()
				+ ", updated in the database");
	}
}