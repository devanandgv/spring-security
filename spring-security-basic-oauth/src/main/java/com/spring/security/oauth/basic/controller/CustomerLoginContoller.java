package com.spring.security.oauth.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/v1")
public class CustomerLoginContoller {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@GetMapping("/login")
	public void getLoginPage() {
		
		logger.info("getLoginPage started");
		
		logger.info("getLoginPage ended");
		
	}
}
