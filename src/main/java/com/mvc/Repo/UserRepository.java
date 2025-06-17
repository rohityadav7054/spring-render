package com.mvc.Repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
