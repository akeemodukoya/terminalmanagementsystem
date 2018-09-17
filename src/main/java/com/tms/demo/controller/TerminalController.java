package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tms.demo.service.TmsService;

@Controller
public class TerminalController {
	private final TmsService tmsService;
	
	@Autowired
	private TerminalController(TmsService tmsService) {
		this.tmsService = tmsService;
	}
	@RequestMapping("/terminals")
	public String terminal(Model model) {
		model.addAttribute("terminals", tmsService.findAllTerminals());
		return "activity";
	}
	
}
