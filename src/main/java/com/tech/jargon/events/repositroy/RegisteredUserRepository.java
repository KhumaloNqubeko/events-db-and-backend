package com.tech.jargon.events.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tech.jargon.events.entity.RegisteredUser;

@Repository
public interface RegisteredUserRepository extends MongoRepository<RegisteredUser, String>{



}
