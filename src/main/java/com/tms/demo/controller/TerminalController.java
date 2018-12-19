package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tms.demo.model.Terminal;
import com.tms.demo.service.TmsService;

@Controller
public class TerminalController {
	
	@Autowired
	public TmsService tmsService;
	
	@RequestMapping("/terminals")
	public String terminals(Model model) {
		model.addAttribute("terminals", tmsService.findAllTerminals());
		return "activity";
	}
	
	@RequestMapping(value="/terminals/{id}", method = RequestMethod.GET)
	public String terminal(Model model, @PathVariable Integer id) {
		model.addAttribute("terminal", tmsService.findTerminalById(id));
		return "single-terminal";
	}
	
	@RequestMapping(value="/terminal", method = RequestMethod.GET)
	public String terminalForm(Model model) {
		model.addAttribute("terminal", new Terminal(null));
		return "terminal";
	}
	
	@RequestMapping(value="/terminal", method = RequestMethod.POST)
	public String terminalSubmit(@ModelAttribute Terminal terminal) {
		return "resultterminal";
	}
	
	@RequestMapping("/terminals/{id}")
	public void delete() {
		
	}
}
