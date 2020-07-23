package com.andy.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andy.helloworld.repository.model.User;
import com.andy.helloworld.service.StringService;
import com.andy.helloworld.service.UserService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	private StringService stringService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping({ "/home" })
	public String adminPageAddUser() {
		return "Hey-ya Admin-boy";
	}
	
	@GetMapping(value = "/message")
	public String adminMessage() {
		return "Admin message";
	}
	
	@GetMapping(value = "/show-users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> showAllUsers() {
		return userService.findAllUsers();
	}
}
