package com.dev.spring.security.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SpringBasicSecurityConfig implements WebMvcConfigurer {
	@Bean
	public UserDetailsService userDetailsService() {

		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username("dev").password("admin").roles("USER").build());
		return manager;
	}
}
