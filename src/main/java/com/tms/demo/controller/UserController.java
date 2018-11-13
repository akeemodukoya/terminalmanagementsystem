package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
	
//	listing all users that are present in the system
	@RequestMapping("/users")
	public String user(Model model) {
		model.addAttribute("user","User");
		return "table";
	}
	
//	deleting a user
	@RequestMapping(value="/user/{id}", method= RequestMethod.DELETE)
	public void delete() {
		
	}
	
//	login method for a user
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Email and Password do not match!");
		if (logout != null)
			model.addAttribute("logout", "User successfully logged out.");
		return "other-login";
	}
	
//	login error page
	@RequestMapping("/login-error")
	public String loginError(Model model){
		model.addAttribute("loginError", true);
		return "login-error";
	}
	
//	logout page
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		model.addAttribute("title", "Logout");
		return "logout";
	}
}
