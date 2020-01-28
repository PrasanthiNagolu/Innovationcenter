package com.hackathon.service.impl;

import org.springframework.stereotype.Service;

import com.hackathon.object.SignUpDetails;
import com.hackathon.service.SignUpService;
import com.hackathon.util.AppUtils;

@Service
public class SignUpServiceImpl implements SignUpService{

	public String signUp(SignUpDetails signUpDetails) {
		return AppUtils.getAlphaNumericString(8);
	}

}
