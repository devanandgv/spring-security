package com.dev.spring.security.custom.login.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages= {"com.dev.spring.security.custom.login.config","com.dev.spring.security.custom.login.controller"})
@Configuration(value="com.dev.spring.security.custom.login.config")
public class CustomLoginMain {

	public static void main(String[] args) {
		
		SpringApplication.run(CustomLoginMain.class, args);
	}
}
