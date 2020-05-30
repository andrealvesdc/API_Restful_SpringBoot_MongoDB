package com.andrealves.apirestfullspringmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andrealves.apirestfullspringmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
