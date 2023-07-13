package com.nagarro.clouddemo.service;

import java.util.List;
import com.nagarro.clouddemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.clouddemo.model.User;
import com.nagarro.clouddemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	
	public List<User> getUsers(){
		return  (List<User>) userRepository.findAll();
	}
	
	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	
}
