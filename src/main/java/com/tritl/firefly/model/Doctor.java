package com.tritl.firefly.model;

import java.util.List;

public class Doctor {

	private int doctorid;
	private String name;
	private List<InsuranceProvider> insuranceProvider;

	public Doctor(int doctorid, String name) {
		this.doctorid = doctorid;
		this.name = name;
	}

	public List<InsuranceProvider> getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(List<InsuranceProvider> insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
