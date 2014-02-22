package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.PlanDao;
import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Plan;

public class PlanDaoImpl implements PlanDao {

	// list is working as a database
	List<Plan> Plans;

	public PlanDaoImpl() {
		Plans = new ArrayList<Plan>();
		Plan Plan1 = new Plan(0, 5000, 10000, 100);
		Plan Plan2 = new Plan(0, 2000, 4000, 20);
		InsuranceProvider InsuranceProvider1 = new InsuranceProvider(0,
				"Kaiser");
		InsuranceProvider InsuranceProvider2 = new InsuranceProvider(1,
				"Blue Cross");
		Plan1.setProvider(InsuranceProvider1);
		Plan2.setProvider(InsuranceProvider2);
		Plans.add(Plan1);
		Plans.add(Plan2);
	}

	// @Override
	public void deletePlan(Plan Plan) {
		Plans.remove(Plan.getPlanId());
		System.out.println(" Id " + Plan.getPlanId()
				+ ", deleted from database");
	}

	// retrive list of students from the database
	// @Override
	public List<Plan> getAllPlans() {
		return Plans;
	}

	// @Override
	public Plan getPlan(int PlanId) {
		return Plans.get(PlanId);
	}

	// @Override
	public void updatePlan(Plan Plan) {
		System.out.println(" Id " + Plan.getPlanId()
				+ ", updated in the database");
	}
}