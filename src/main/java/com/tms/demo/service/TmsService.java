package com.tms.demo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.tms.demo.model.Application;
import com.tms.demo.model.Project;
import com.tms.demo.model.Terminal;
import com.tms.demo.model.TerminalGroup;
import com.tms.demo.model.User;

//@Component
public interface TmsService {
	
	public List<Application> findAllApplications() throws DataAccessException;
	
	public Application findApplicationById(int id) throws DataAccessException;
	
	public void SaveApplication(Application application) throws DataAccessException;
	
	public List<Project> findAllProjects() throws DataAccessException;
	
	public Project findProjectById(int id) throws DataAccessException;
	
	public void SaveProject(Project project) throws DataAccessException;
	
	public List<Terminal> findAllTerminals() throws DataAccessException;
	
	public Terminal findByTerminalId() throws DataAccessException;
	
	public void SaveTerminal(Terminal terminal) throws DataAccessException;
	
	public List<TerminalGroup> findAllTerminalGroups() throws DataAccessException;
	
	public TerminalGroup findByTerminalGroupId(int id) throws DataAccessException;
	
	public void SaveTerminalGroup(TerminalGroup terminalGroup) throws DataAccessException;
	
	public List<User> findAllUsers()throws DataAccessException;
	
	public User findById(int id) throws DataAccessException;
	
	public void SaveUser(User user) throws DataAccessException;
}
