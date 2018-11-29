package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.model.Project;
import com.tms.demo.service.TmsService;

@Controller
public class ProjectController {
	
	@Autowired
	public TmsService tmsService;
	
	@RequestMapping("/projects")
	public String project(Model model) {
		model.addAttribute("projects", tmsService.findAllProjects());
		return "ui-typography";
	}
	@RequestMapping(value="/project", method = RequestMethod.GET)
	public String projectForm(Model model) {
		model.addAttribute("project", new Project(null));
		return "project";
	}
	
	@RequestMapping(value="/project", method= RequestMethod.POST)
	public String projectSubmit(@ModelAttribute Project project) {
		return "projectadd";
	}
	
	@RequestMapping("/projects/{id}")
	public void delete(){
		
	}
}
