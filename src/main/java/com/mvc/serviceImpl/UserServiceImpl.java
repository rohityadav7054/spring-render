package com.mvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.Repo.UserRepository;
import com.mvc.entities.User;
import com.mvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {  // Changed from Long to String
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User UpdateUser(User user) {
        return userRepository.save(user);
    }

	


}
