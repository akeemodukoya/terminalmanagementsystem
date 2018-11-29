package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.repository.UserRepository;
import com.tms.demo.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
//	listing all users that are present in the system
	@RequestMapping("/users")
	public String user(Model model) {
		model.addAttribute("user", userRepository.findAll());
		return "table";
	}
	
//	deleting a user
	@RequestMapping(value="/user/{id}", method= RequestMethod.DELETE)
	public void delete() {
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(Model model) {
		model.addAttribute("user", userService.findUserByEmail(null));
		return "other-login";
	}
	
//	login error page
	@RequestMapping("/error")
	public String loginError(Model model){
		model.addAttribute("loginError", true);
		return "error";
	}
	
//	logout page
	@RequestMapping(value="/logout", method = RequestMethod.DELETE)
	public String logout(Model model) {
		model.addAttribute("title", true);
		return "logout";
	}
}
