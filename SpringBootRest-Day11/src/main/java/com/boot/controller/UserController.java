package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.User;
import com.boot.model.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userrep;
	@PostMapping("/validate")
	public User validate(@RequestBody User u1)
	{
		User finduser=userrep.findByUsernameAndPassword(u1.getUsername(), u1.getPassword());
		return finduser;
		
	}

}