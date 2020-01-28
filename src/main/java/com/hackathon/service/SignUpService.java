package com.hackathon.service;

import org.springframework.stereotype.Service;

import com.hackathon.object.SignUpDetails;

@Service
public interface SignUpService {

	String signUp(SignUpDetails signUpDetails);

}
