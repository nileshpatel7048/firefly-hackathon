package com.tritl.firefly.dao;

import java.util.List;

import com.tritl.firefly.model.Plan;

public interface PlanDao {

	public List<Plan> getAllPlans();

	public Plan getPlan(int PlanId);

	public void updatePlan(Plan Plan);

	public void deletePlan(Plan Plan);

}
