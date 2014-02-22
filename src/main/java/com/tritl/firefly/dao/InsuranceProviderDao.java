package com.tritl.firefly.dao;

import java.util.List;

import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Person;

public interface InsuranceProviderDao {

	public List<InsuranceProvider> getAllInsuranceProviders();

	public InsuranceProvider getInsuranceProvider(int InsuranceProviderId);

	public void updateInsuranceProvider(InsuranceProvider insuranceProvider);

	public void deleteInsuranceProvider(InsuranceProvider insuranceProvider);

}
