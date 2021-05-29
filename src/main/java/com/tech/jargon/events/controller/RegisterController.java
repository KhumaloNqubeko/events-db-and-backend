package com.tech.jargon.events.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.jargon.events.dto.RegisterRequest;
import com.tech.jargon.events.entity.RegisteredUser;
import com.tech.jargon.events.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody RegisterRequest request) {
		registerService.createUser(request);
		
		return new ResponseEntity<>("User created successfully", HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() {
		List<RegisteredUser> users = registerService.findAll();
		
		if (users.size() > 0) {
			return new ResponseEntity<List<RegisteredUser>>(users, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("No users found", HttpStatus.NOT_FOUND);
		}
	}
}
