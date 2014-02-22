package com.tritl.firefly.rest.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.model.Plan;
import com.tritl.firefly.service.FireflyDataServices;

@Controller
public class FireflyHomeController {
	
	private FireflyDataServices fireflyDataService;

	@Autowired
	public void setFireflyDataService(FireflyDataServices fireflyDataService) {
		this.fireflyDataService = fireflyDataService;
	}

	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String getHome() {

		
		return "home";
		
	}
	
	

}