package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usertypes")
public class UserTypeController {
	@RequestMapping("/usertypes")
	public String userTypes(Model model) {
		model.addAttribute("","");
		return "other-user-listing";
	}
}
