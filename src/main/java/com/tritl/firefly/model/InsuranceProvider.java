package com.tritl.firefly.model;

import java.util.List;

public class InsuranceProvider {
	private int insuranceproviderId;
	private String name;
	private List<Plan> plans;
	private List<Doctor> doctors;

	public InsuranceProvider(int id, String name) {
		this.insuranceproviderId = id;
		this.name = name;
	}

	public int getInsuranceproviderId() {
		return insuranceproviderId;
	}

	public void setInsuranceproviderid(int insuranceproviderId) {
		this.insuranceproviderId = insuranceproviderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
