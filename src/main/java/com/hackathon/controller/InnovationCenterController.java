package com.hackathon.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.object.SignUpDetails;
import com.hackathon.service.SignUpService;

@RestController
public class InnovationCenterController {
	
	Logger logger = Logger.getLogger(InnovationCenterController.class.getName());
	
	@Autowired
	SignUpService signUpService;
	
	@RequestMapping(value = "/api/portal/innovation/signup",method = RequestMethod.POST)
	public String signUp(@RequestBody SignUpDetails signUpDetails){
		logger.info("signup controoler method start");

		String password = signUpService.signUp(signUpDetails);

   
		logger.info("signup controoler method end");
		
		return password;
		
	}

}
 