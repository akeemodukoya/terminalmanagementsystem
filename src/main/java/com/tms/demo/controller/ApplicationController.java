package com.tms.demo.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tms.demo.model.Application;
import com.tms.demo.repository.ApplicationRepository;

@Controller
@RequestMapping("/")
public class ApplicationController {
	@Autowired
	private ApplicationRepository applicationRepository;
	
	
	@RequestMapping("/applications")
	public String application(Model model) {
		model.addAttribute("", "");
		return "task";
	}
//	public List<Application> retrieveAllApplications(@PathVariable int id) {
// 
//		return applicationRepository.findAll();
//	}
	
	@RequestMapping("/applications/{id}")
	public Application retrieveApplication(@PathVariable long id) {
		Optional <Application> application = applicationRepository.findById(id);
		
		if (!application.isPresent())
			throw new ApplicationContextException("id-" + id);
		
		return application.get();
	}
	
	@RequestMapping("/application/{id}")
	public void deleteApplication(@PathVariable long id) {
		applicationRepository.deleteById(id);
	}
	
	@RequestMapping("/application")
	public ResponseEntity<Object> createApplication(@RequestBody Application application) {
		Application savedApplication = applicationRepository.save(application);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(savedApplication.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
