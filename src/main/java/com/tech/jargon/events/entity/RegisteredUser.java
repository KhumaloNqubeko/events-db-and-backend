package com.tech.jargon.events.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "registered_user")
public class RegisteredUser {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	private String roles;
	private String userName;
	private String password;

	public RegisteredUser(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public RegisteredUser(String firstName, String lastName, String phoneNumber, String emailAddress, String roles, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.roles = roles;
		this.userName = userName;
		this.password = password;
	}


}
