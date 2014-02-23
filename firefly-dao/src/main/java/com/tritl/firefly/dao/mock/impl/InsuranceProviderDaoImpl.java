package com.tritl.firefly.dao.mock.impl;

import java.util.ArrayList;
import java.util.List;

import com.tritl.firefly.dao.InsuranceProviderDao;
import com.tritl.firefly.model.InsuranceProvider;

public class InsuranceProviderDaoImpl implements InsuranceProviderDao {

	// list is working as a database
	List<InsuranceProvider> InsuranceProviders;

	public InsuranceProviderDaoImpl() {
		InsuranceProviders = new ArrayList<InsuranceProvider>();
		InsuranceProvider InsuranceProvider1 = new InsuranceProvider(0,
				"Kaiser");
		InsuranceProvider InsuranceProvider2 = new InsuranceProvider(1,
				"Blue Cross");
		InsuranceProvider InsuranceProvider3 = new InsuranceProvider(2,
				"Health Net");
		InsuranceProviders.add(InsuranceProvider1);
		InsuranceProviders.add(InsuranceProvider2);
		InsuranceProviders.add(InsuranceProvider3);
	}

	// @Override
	public void deleteInsuranceProvider(InsuranceProvider InsuranceProvider) {
		InsuranceProviders.remove(InsuranceProvider.getInsuranceproviderId());
		System.out.println(" Id " + InsuranceProvider.getInsuranceproviderId()
				+ ", deleted from database");
	}

	// retrive list of students from the database
	// @Override
	public List<InsuranceProvider> getAllInsuranceProviders() {
		return InsuranceProviders;
	}

	// @Override
	public InsuranceProvider getInsuranceProvider(int InsuranceProviderId) {
		return InsuranceProviders.get(InsuranceProviderId);
	}

	// @Override
	public void updateInsuranceProvider(InsuranceProvider InsuranceProvider) {
		InsuranceProviders.get(InsuranceProvider.getInsuranceproviderId())
				.setName(InsuranceProvider.getName());
		System.out.println(" Id " + InsuranceProvider.getInsuranceproviderId()
				+ ", updated in the database");
	}
}