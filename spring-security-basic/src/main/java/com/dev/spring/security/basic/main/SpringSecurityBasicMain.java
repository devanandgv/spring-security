package com.dev.spring.security.basic.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages= {"com.dev.spring.security.basic.controller",
							  "com.dev.spring.security.basic.config"})
@EnableWebMvc

public class SpringSecurityBasicMain {

	public static void main(String[] args) {

		SpringApplication.run(SpringSecurityBasicMain.class, args);
	}
}
