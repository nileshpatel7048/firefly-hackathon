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
	
	

}