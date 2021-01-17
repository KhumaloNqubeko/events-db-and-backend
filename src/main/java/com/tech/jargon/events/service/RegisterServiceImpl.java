package com.tech.jargon.events.service;

import java.util.List;

import com.tech.jargon.events.dto.RegisterRequest;
import com.tech.jargon.events.entity.RegisteredUser;
import com.tech.jargon.events.repositroy.RegisteredUserRepository;

public class RegisterServiceImpl implements RegisterService{
	
	private final RegisteredUserRepository registeredUserRepository;
	
	public RegisterServiceImpl(RegisteredUserRepository registeredUserRepository) {
		this.registeredUserRepository = registeredUserRepository;
	}

	@Override
	public List<RegisteredUser> findAll() {
		return registeredUserRepository.findAll();
	}

	@Override
	public void createUser(RegisterRequest request) {
		RegisteredUser user = new RegisteredUser();
		user.setFirstname(request.getFirstname());
		user.setLastname(request.getLastname());
		
		registeredUserRepository.save(user);
	}

}
