package com.nagarro.clouddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.clouddemo.model.User;
import com.nagarro.clouddemo.service.UserServiceImpl;

@RestController
@CrossOrigin(origins="*")
public class userController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users=userServiceImpl.getUsers();
		return ResponseEntity.ok(users);
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User newUser=userServiceImpl.saveUser(user);
		return ResponseEntity.ok(newUser);
	}

}
