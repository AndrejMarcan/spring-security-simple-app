package com.andy.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.helloworld.repository.UserRepository;
import com.andy.helloworld.repository.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void addNewUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
}
