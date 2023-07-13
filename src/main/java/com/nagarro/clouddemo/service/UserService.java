package com.nagarro.clouddemo.service;

import java.util.List;

import com.nagarro.clouddemo.model.User;

public interface UserService {
	public List<User> getUsers();
	public User saveUser(User user);

}
