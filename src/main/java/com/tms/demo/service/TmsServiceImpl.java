package com.tms.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tms.demo.model.Application;
import com.tms.demo.repository.ApplicationRepository;
import com.tms.demo.service.TmsService;

@Service
public class TmsServiceImpl implements TmsService{
	
	private 
	ApplicationRepository applicationRepository;
	
	public List<Application> findAllApplications(@PathVariable int id) {
		 
		return applicationRepository.findAll();
	}

	@Override
	public List<com.tms.demo.model.Application> findAllApplications() {
		// TODO Auto-generated method stub
		return null;
	}
}
