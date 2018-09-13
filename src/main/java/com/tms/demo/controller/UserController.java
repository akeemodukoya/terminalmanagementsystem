package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	@RequestMapping("/users")
	public String users(Model model) {
		model.addAttribute(".");
		return "table";
	}
}
