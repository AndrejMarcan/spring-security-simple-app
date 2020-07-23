package com.andy.helloworld.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class StringService {
	
	@Secured(value = "USER")
	public String hello() {
		return "HELLO method";
	}
	
	@Secured("ADMIN")
	public String hello2() {
		return "HELLO method";
	}
}
