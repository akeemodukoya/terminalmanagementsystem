package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/terminalgroups")
public class TerminalGroupController {
	@RequestMapping("/terminalgroups")
	public String terminalGroups(Model model) {
		model.addAttribute(",");
		return "other-user-listing";
	}
}
