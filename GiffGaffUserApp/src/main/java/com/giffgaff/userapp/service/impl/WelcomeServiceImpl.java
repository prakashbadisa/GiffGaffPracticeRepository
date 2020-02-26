package com.giffgaff.userapp.service.impl;

import org.springframework.stereotype.Component;

import com.giffgaff.userapp.service.WelcomeService;

@Component
public class WelcomeServiceImpl implements WelcomeService {

	public String getWelcomeMessage() {
		return "welcome message from service class and added spring boot parent \n" + "Refactored class names";
	}
}
