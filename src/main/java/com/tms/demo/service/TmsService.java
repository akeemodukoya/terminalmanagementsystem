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
	
	public Application findAllApplications(int id);
	
	public void SaveApplication(Application application);
	
	public List<Project> findAllProjects();
	
	public Project findProjectById(int id);
	
	public void SaveProject(Project project);
	
	public List<Terminal> findAllTerminals();
	
	public Terminal findByTerminalId(int id);
	
	public void SaveTerminal(Terminal terminal);
	
	public List<TerminalGroup> findAllTerminalGroups();
	
	public TerminalGroup findByTerminalGroupId(int id);
	
	public void SaveTerminalGroup(TerminalGroup terminalGroup);
	
	public List<User> findAllUsers();
	
	public User findById(int id);
	
	public void SaveUser(User user);
}
