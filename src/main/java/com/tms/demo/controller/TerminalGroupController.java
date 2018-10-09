package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TerminalGroupController {
	@RequestMapping("/terminalgroups")
	public String terminalgroup(Model model) {
		model.addAttribute("","");
		return "other-user-listing";
	}
	
	@RequestMapping("/terminalsgroups/{id}")
	public void delete() {
		
	}
//	@RequestMapping("/terminalgroups/{id}")
//	public String terminalgroup(Model model) {
//		model.addAttribute("","");
//		return "";
//	}
}
