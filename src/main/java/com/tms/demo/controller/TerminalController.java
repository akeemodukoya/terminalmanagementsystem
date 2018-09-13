package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/terminal")
public class TerminalController {
	
	@RequestMapping("/terminals")
	public String terminal(Model model) {
		model.addAttribute("","");
		return "activity";
	}
	
}
