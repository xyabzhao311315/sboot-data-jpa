package com.zhao.sboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhao.sboot.beans.User;
import com.zhao.sboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="/user/{id}")
	public String getUser(@PathVariable Integer id) {
		User user1 = userService.getUser(id);
		System.out.println("88888888");
		return user1.toString();
	}

}
