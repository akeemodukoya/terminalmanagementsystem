package com.tms.demo.service;

import java.util.List;

import com.tms.demo.model.Application;

//@Component
public interface TmsService {
	
	List<Application> findAllApplications();
}
