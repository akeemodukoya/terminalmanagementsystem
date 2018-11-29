package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.repository.UserTypeRepository;
import com.tms.demo.service.UserService;

@Controller
public class UserTypeController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public UserTypeRepository userTypeRepository;
	
	
	@RequestMapping("/usertypes")
	public String usertype(Model model) {
		model.addAttribute("usertypes",userTypeRepository.findAll());
		return "other-user-listing";
	}
	
	@RequestMapping(value = "/usertypes/{id}", method = RequestMethod.GET)
	public void delete() {
		
	}
}
