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
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setPhoneNumber(request.getPhoneNumber());
		user.setEmailAddress(request.getEmailAddress());
		user.setRoles(request.getRoles());
		user.setUserName(request.getUserName());
		user.setPassword(request.getPassword());
		
		registeredUserRepository.save(user);
	}

}
