package com.tech.jargon.events.service;

import java.util.List;

import com.tech.jargon.events.dto.RegisterRequest;
import com.tech.jargon.events.entity.RegisteredUser;

public interface RegisterService {
	
	void createUser(RegisterRequest request);

	List<RegisteredUser> findAll();
}
