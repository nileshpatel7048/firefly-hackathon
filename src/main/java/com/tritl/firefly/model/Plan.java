package com.tritl.firefly.model;

import java.util.List;

public class Plan {

	private int planId;
	private InsuranceProvider provider;
	private int individualDeductable;
	private int familiyDeductable;
	private int copay;

	public Plan(int id, int individualDeductable, int familiyDeductable,
			int copay) {
		this.planId = id;
		this.individualDeductable = individualDeductable;
		this.familiyDeductable = familiyDeductable;
		this.copay = copay;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public InsuranceProvider getProvider() {
		return provider;
	}

	public void setProvider(InsuranceProvider provider) {
		this.provider = provider;
	}

	public int getIndividualDeductable() {
		return individualDeductable;
	}

	public void setIndividualDeductable(int individualDeductable) {
		this.individualDeductable = individualDeductable;
	}

	public int getFamiliyDeductable() {
		return familiyDeductable;
	}

	public void setFamiliyDeductable(int familiyDeductable) {
		this.familiyDeductable = familiyDeductable;
	}

	public int getCopay() {
		return copay;
	}

	public void setCopay(int copay) {
		this.copay = copay;
	}

}
