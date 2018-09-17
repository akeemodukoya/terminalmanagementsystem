package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tms.demo.service.TmsService;

@Controller
public class ProjectController {
	private final TmsService tmsService;
	
	@Autowired
	private ProjectController(TmsService tmsService) {
		this.tmsService = tmsService;
	}
	
	@RequestMapping("/projects")
	public String project(Model model) {
		model.addAttribute("projects", tmsService.findAllProjects());
		return "ui-typography";
	}
}
