package com.tms.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

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
		return (List<Application>) applicationRepository.findAll();
	}

	@Override
	public List<Project> findAllProjects() {
		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public List<Terminal> findAllTerminals() {
		return (List<Terminal>) terminalRepository.findAll();
	}

	@Override
	public List<TerminalGroup> findAllTerminalGroups() {
		return (List<TerminalGroup>) terminalGroupRepository.findAll();
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Application findApplicationById(int id) {
		return null;
	}

	@Override
	public Project findProjectById(int id) {
		return ((TmsService) projectRepository).findProjectById(id);
	}

	@Override
	public Terminal findByTerminalId() {
		return ((TmsService) terminalRepository).findByTerminalId();
	}

	@Override
	public TerminalGroup findByTerminalGroupId(int id) {
		return ((TmsService) terminalGroupRepository).findByTerminalGroupId(id);
	}

	@Override
	public User findById(int id) {
		return ((TmsService) userRepository).findById(id);
	}

	@Override
	public void SaveApplication(Application application) {
		applicationRepository.save(application);
	}

	@Override
	public void SaveProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void SaveTerminal(Terminal terminal) {
		terminalRepository.save(terminal);
	}

	@Override
	public void SaveTerminalGroup(TerminalGroup terminalGroup) {
		terminalGroupRepository.save(terminalGroup);
	}

	@Override
	public void SaveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public long count(Application application) throws DataAccessException {
		return 0;
	}

	@Override
	public long count(Project project) throws DataAccessException {
		return 0;
	}

	@Override
	public long count(Terminal terminal) throws DataAccessException {
		return 0;
	}

	@Override
	public long count(TerminalGroup terminalGroup) throws DataAccessException {
		return 0;
	}

	@Override
	public long count(User user) throws DataAccessException {
		return 0;
	}

	@Override
	public User findByEmail(String email) throws DataAccessException {
		return userRepository.findByEmail(email);
	}
	
	
}
