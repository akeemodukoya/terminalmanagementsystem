package com.tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.model.TerminalGroup;

@Controller
public class TerminalGroupController {
	@RequestMapping("/terminalgroups")
	public String terminalgroup(Model model) {
		model.addAttribute("","");
		return "other-user-listing";
	}
	
	@RequestMapping(value="/terminalgroup", method = RequestMethod.GET)
	public String terminalGroupFrom(Model model) {
		model.addAttribute("terminalgroup", new TerminalGroup(null, null, null, null, null));
		return "terminalgroup";
	}
	
	@RequestMapping(value="/terminalgroup", method = RequestMethod.POST)
	public String terminalGroupSubmit(@ModelAttribute TerminalGroup terminalGroup) {
		return "terminalgroupresult";
	}
	
	@RequestMapping("/terminalsgroups/{id}")
	public void delete() {
		
	}
	
	@RequestMapping("/terminalgroups/{id}")
	public String terminalGroup(Model model) {
		model.addAttribute("","");
		return "";
	}
}
