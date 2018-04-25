package com.zhao.sboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.sboot.beans.User;
import com.zhao.sboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@SuppressWarnings("unused")
	public User getUser(Integer id) {
		
		User user = userRepository.getOne(id);
		return user;
	}

}
