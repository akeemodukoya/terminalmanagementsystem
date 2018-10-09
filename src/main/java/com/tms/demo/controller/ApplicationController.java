package com.tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tms.demo.service.TmsService;

@Controller
@RequestMapping("/")
public class ApplicationController {
	private final TmsService tmsService;
	
	@Autowired
	private ApplicationController(TmsService tmsService) {
		this.tmsService = tmsService;
	}
	
	
	@RequestMapping("/applications")
	public String application(Model model) {
		model.addAttribute("applications", tmsService.findAllApplications());
		return "task";
	}
	
//	public List<Application> retrieveAllApplications(@PathVariable int id) {
// 
//		return applicationRepository.findAll();
//	}
	
//	@RequestMapping("/applications/{id}")
//	public Application retrieveApplication(@PathVariable long id) {
//		Optional <Application> application = applicationRepository.findById(id);
//		
//		if (!application.isPresent())
//			throw new ApplicationContextException("id-" + id);
//		
//		return application.get();
//	}
//	
	@RequestMapping("/application/{id}")
	public void delete() {
	
	}
	
//	
//	@RequestMapping("/application")
//	public ResponseEntity<Object> createApplication(@RequestBody Application application) {
//		Application savedApplication = applicationRepository.save(application);
//		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
//				.buildAndExpand(savedApplication.getId()).toUri();
//		return ResponseEntity.created(location).build();
//	}
}
