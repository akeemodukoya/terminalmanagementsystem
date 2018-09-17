package com.tms.demo.service;

import java.util.List;

import com.tms.demo.model.Application;
import com.tms.demo.model.Project;
import com.tms.demo.model.Terminal;
import com.tms.demo.model.TerminalGroup;
import com.tms.demo.model.User;

//@Component
public interface TmsService {
	
	public List<Application> findAllApplications();
	
	public List<Project> findAllProjects();
	
	public List<Terminal> findAllTerminals();
	
	public List<TerminalGroup> findAllTerminalGroups();
	
	public List<User> findAllUsers();
}
