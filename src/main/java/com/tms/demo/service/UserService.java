package com.tms.demo.service;

import java.util.List;

import com.tms.demo.model.User;
//import com.tms.demo.model.UserType;

public interface UserService {
	public User findUserByEmail(String email);
	
	public void saveUser(User user);
	
	public List<User> findAll();
}
