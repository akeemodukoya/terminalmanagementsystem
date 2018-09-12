package com.tms.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tms.demo.model.Application;

@Service
public class TmsServiceImpl {
	public List<Application> findAllApplications(@PathVariable int id) {
		 
		return applicationRepository.findAll();
	}
}
