package com.andy.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andy.helloworld.repository.model.User;
import com.andy.helloworld.service.StringService;
import com.andy.helloworld.service.UserService;

@RestController
@RequestMapping(value = "/hello")
public class PublicController {
	
	@Autowired
	private StringService stringService;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping({ "/yo" })
	public String firstPage() {
		return "HELLOOOOO";
	}
	
	@GetMapping({ "/user" })
	public String userMethod() {
		return stringService.hello();
	}
	
	@GetMapping({ "/admin" })
	public String adminMethod() {
		return stringService.hello2();
	}
	
	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void registerUser(@RequestBody User user) {
		userService.addNewUser(user);
	}
	
}
