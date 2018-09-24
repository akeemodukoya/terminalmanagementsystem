package com.tms.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import com.tms.demo.model.Application;
import com.tms.demo.model.Project;
import com.tms.demo.model.Terminal;
import com.tms.demo.model.TerminalGroup;
import com.tms.demo.model.User;
import com.tms.demo.repository.ApplicationRepository;
import com.tms.demo.repository.ProjectRepository;
import com.tms.demo.repository.TerminalGroupRepository;
import com.tms.demo.repository.TerminalRepository;
import com.tms.demo.repository.UserRepository;
import com.tms.demo.service.TmsService;

@Service
public class TmsServiceImpl implements TmsService{
	
	private ApplicationRepository applicationRepository;
	private ProjectRepository projectRepository;
	private TerminalGroupRepository terminalGroupRepository;
	private TerminalRepository terminalRepository;
	private UserRepository userRepository;
	
	@Autowired
	public TmsServiceImpl(ApplicationRepository applicationRepository, ProjectRepository projectRepository,
			TerminalGroupRepository terminalGroupRepository, TerminalRepository terminalRepository,
			UserRepository userRepository) {
		this.applicationRepository = applicationRepository;
		this.projectRepository = projectRepository;
		this.terminalGroupRepository = terminalGroupRepository;
		this.terminalRepository = terminalRepository;
		this.userRepository = userRepository;
	}

	@Override
	public List<Application> findAllApplications() {
		// TODO Auto-generated method stub
		return (List<Application>) applicationRepository.findAll();
	}

	@Override
	public List<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public List<Terminal> findAllTerminals() {
		// TODO Auto-generated method stub
		return (List<Terminal>) terminalRepository.findAll();
	}

	@Override
	public List<TerminalGroup> findAllTerminalGroups() {
		// TODO Auto-generated method stub
		return (List<TerminalGroup>) terminalGroupRepository.findAll();
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Application findApplicationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findProjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terminal findByTerminalId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TerminalGroup findByTerminalGroupId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SaveApplication(Application application) {
		// TODO Auto-generated method stub
		applicationRepository.save(application);
	}

	@Override
	public void SaveProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
	}

	@Override
	public void SaveTerminal(Terminal terminal) {
		// TODO Auto-generated method stub
		terminalRepository.save(terminal);
	}

	@Override
	public void SaveTerminalGroup(TerminalGroup terminalGroup) {
		// TODO Auto-generated method stub
		terminalGroupRepository.save(terminalGroup);
	}

	@Override
	public void SaveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}
	
	
	
}
