package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
	
	
	@RequestMapping("/users")
	public String user(Model model) {
		model.addAttribute("user","User");
		return "table";
	}
	
	@RequestMapping(value="/user/{id}", method= RequestMethod.DELETE)
	public void delete() {
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "other-login";
	}
	
	@RequestMapping("/login-error")
	public String loginError(Model model){
		model.addAttribute("loginError", true);
		return "login";
	}
}
