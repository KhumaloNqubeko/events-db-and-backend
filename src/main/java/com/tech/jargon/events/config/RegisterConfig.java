package com.tech.jargon.events.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.jargon.events.repositroy.RegisteredUserRepository;
import com.tech.jargon.events.service.RegisterService;
import com.tech.jargon.events.service.RegisterServiceImpl;

@Configuration
public class RegisterConfig {

	@Autowired
	private RegisteredUserRepository registeredUserRepository;

	@Bean
	public RegisterService registerService() {
		return new RegisterServiceImpl(registeredUserRepository);
	}
}
