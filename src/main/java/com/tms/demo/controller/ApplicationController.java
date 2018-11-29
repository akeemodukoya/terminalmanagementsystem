package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.model.Application;
import com.tms.demo.service.TmsService;

@Controller
@RequestMapping("/")
public class ApplicationController {
	
	@Autowired
	public TmsService  tmsService;
	
	
	@RequestMapping("/applications")
	public String application(Model model) {
		model.addAttribute("applications", tmsService.findAllApplications());
		return "task";
	}
	
	@RequestMapping(value="/application", method= RequestMethod.GET)
	public String applicationForm(Model model) {
		model.addAttribute("application", new Application(null, null, null));
		return "application";
	}
	
	@RequestMapping(value="/application", method= RequestMethod.POST)
	public String applicationSubmit(@ModelAttribute Application application) {
		return "result";
	}
	
	@RequestMapping("/application/{id}")
	public void delete() {
	
	}
	
}
