package com.tms.demo.service;

public interface SecurityService {

	void autologin(String email, String password, String password_confirm);

	String findLoggedInEmail();

	void autologin(String email, String password_confirm);

}
