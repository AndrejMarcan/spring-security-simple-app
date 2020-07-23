package com.andy.helloworld.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.andy.helloworld.repository.UserRepository;
import com.andy.helloworld.repository.model.User;
import com.andy.helloworld.security.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);		
		user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		
		return user.map(MyUserDetails::new).get();
	}

}
