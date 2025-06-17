package com.mvc.service;

import java.util.List;

import com.mvc.entities.User;

public interface UserService {

	User saveUser(User user);
	List<User> getAllUsers();
	User getUserById(String Id);
	User UpdateUser(User user);
}
