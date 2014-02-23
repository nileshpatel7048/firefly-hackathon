package com.tritl.firefly.rest.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FireflyHomeController {
	
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String getHome() {

		
		return "home";
		
	}
	
	@RequestMapping(value="/user/userinfo",method = RequestMethod.GET)
	public String getUserInfo() {

		
		return "userinfo";
		
	}
	
	@RequestMapping(value="/user/landing",method = RequestMethod.GET)
	public String getIndex() {

		
		return "index";
		
	}
	
	@RequestMapping(value="/user/hcprovider",method = RequestMethod.GET)
	public String getHCPList() {

		
		return "hcps";
		
	}
	
	@RequestMapping(value="/user/diseases",method = RequestMethod.GET)
	public String getDiseaselist() {

		
		return "diseases";
		
	}
	
	@RequestMapping(value="/user/hcpriorities",method = RequestMethod.GET)
	public String getHCPriorities() {

		
		return "priorities";
		
	}
	
	@RequestMapping(value="/user/hcresults",method = RequestMethod.POST)
	public String getHCResults() {

		
		return "hcresults";
		
	}
	

}