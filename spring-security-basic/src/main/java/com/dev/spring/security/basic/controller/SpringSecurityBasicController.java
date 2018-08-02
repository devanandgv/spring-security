package com.dev.spring.security.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class SpringSecurityBasicController {

	@GetMapping(path = "/{name}")
	public String getGreeting(@PathVariable(name = "name") String name) {
		System.out.println("in controller");
		return "Hello" + name;
	}
}
