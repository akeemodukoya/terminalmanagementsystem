package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.model.User;
import com.tms.demo.service.SecurityService;
import com.tms.demo.service.TmsService;
import com.tms.demo.validator.UserValidator;


@Controller
public class UserController {
	
	@Autowired
	private TmsService tmsService;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private UserValidator userValidator;
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		model.addAttribute("userForm", new User());
		
		return "registration";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public String regsitration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
		userValidator.validate(userForm, bindingResult);
		
		if (bindingResult.hasErrors()) {
			return "registration";
		}
		
		tmsService.save(userForm);
		
		securityService.autologin(userForm.getEmail(), userForm.getPassword_confirm());
		
		return "redirect:/index";
	}
	
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
