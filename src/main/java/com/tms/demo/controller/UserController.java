package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.service.TmsService;

@Controller
public class UserController {
	
	@Autowired
	private TmsService tmsService;
	
	@RequestMapping("/users")
	public String user(Model model) {
		model.addAttribute("","");
		return "table";
	}
	
	@RequestMapping("/users/{id}")
	public void delete() {
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login() {
		return "other-login";
	}
	
	@RequestMapping("/login-error")
	public String loginError(Model model){
		model.addAttribute("loginError", true);
		return "login";
	}
}
