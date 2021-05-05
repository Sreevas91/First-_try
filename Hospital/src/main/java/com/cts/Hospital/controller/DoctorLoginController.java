package com.cts.Hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Hospital.service.LoginService;

@Controller
public class DoctorLoginController {
	@Autowired
	LoginService service;
	
	
	@RequestMapping(value="/Doctor_login",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	@RequestMapping(value="/Doctor_login",method=RequestMethod.POST)
	public String ShowWelcomePage(ModelMap model, @RequestParam String name,@RequestParam String password) {
		boolean isValidUser=service.validateUser(name, password);
		if(!isValidUser) {
			model.put("errormessage", "Invalid Credentials");
			return "login";
		}
		model.put("name",name);
		model.put("password",password);
		return "Welcome";
	}

}
