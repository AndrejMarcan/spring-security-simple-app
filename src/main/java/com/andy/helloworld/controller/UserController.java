package com.andy.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@GetMapping({ "/home" })
	public String userPage() {
		return "Hello user";
	}
	
	@GetMapping({ "/message" })
	public String userMessage() {
		return "User message";
	}
}
