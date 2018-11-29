package com.tms.demo.service;

import com.tms.demo.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	
	public void saveUser(User user);
}
