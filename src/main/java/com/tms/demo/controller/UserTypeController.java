package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserTypeController {
	@RequestMapping("/usertypes")
	public String usertype(Model model) {
		model.addAttribute("","");
		return "other-user-listing";
	}
}
