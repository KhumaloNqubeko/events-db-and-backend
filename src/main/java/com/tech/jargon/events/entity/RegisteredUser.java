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
	
	private String firstname;
	private String lastname;
}
