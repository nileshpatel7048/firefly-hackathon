package com.tritl.firefly.rest.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tritl.firefly.model.Diseases;
import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Plan;
import com.tritl.firefly.service.FireflyDataServices;

@Controller
public class HCPController {

	private FireflyDataServices fireflyDataService;

	@Autowired
	public void setFireflyDataService(FireflyDataServices fireflyDataService) {
		this.fireflyDataService = fireflyDataService;
	}

	@RequestMapping(value = "/hcproviders/{zip}", method = RequestMethod.GET)
	public @ResponseBody
	List<InsuranceProvider> getHCProviders(@PathVariable String zip) {

		List<InsuranceProvider> hcps = new ArrayList<InsuranceProvider>();

		if (fireflyDataService != null) {

			hcps = fireflyDataService.getAllInsuranceProviders();
		}

		return hcps;

	}
	
	@RequestMapping(value = "/diseases", method = RequestMethod.GET)
	public @ResponseBody
	List<Diseases> getDisease() {

		List<Diseases> diseases = new ArrayList<Diseases>();

		if (fireflyDataService != null) {

			diseases = fireflyDataService.getAllDiseases();
		}

		return diseases;

	}
	
	@RequestMapping(value = "/pcps/{zip}/{provider}", method = RequestMethod.GET)
	public @ResponseBody
	List<Doctor> getDoctors(@PathVariable String zip,@PathVariable String provider) {

		List<Doctor> doctors = new ArrayList<Doctor>();

		if (fireflyDataService != null) {

			doctors = fireflyDataService.getAllDoctors();
		}

		return doctors;

	}

}