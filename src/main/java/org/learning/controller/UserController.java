package org.learning.controller;

import org.learning.service.UserService;
import org.learning.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user")
	public User getUser(){
		return service.getUser();
	}
	
	@PostMapping("/update")
	public User updateUser(@RequestBody User user){
		return service.updateUser();
	}

}
