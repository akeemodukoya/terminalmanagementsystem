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
	
	public Application findApplicaitonById(int id);
	
	public List<Project> findAllProjects();
	
	public Project findProjectById(int id);
	
	public List<Terminal> findAllTerminals();
	
	public Terminal findByTerminalId(int id);
	
	public List<TerminalGroup> findAllTerminalGroups();
	
	public TerminalGroup findByTerminalGroupId(int id);
	
	public List<User> findAllUsers();
	
	public User findById(int id);
}
