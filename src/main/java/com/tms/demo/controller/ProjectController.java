package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@RequestMapping("/projects")
	public String projects(Model model) {
		model.addAttribute(",");
		return "typography";
	}
}
