package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/users")
	public String user(Model model) {
		model.addAttribute("","");
		return "table";
	}
	
	@RequestMapping("/users/{id}")
	public void delete() {
		
	}
}
