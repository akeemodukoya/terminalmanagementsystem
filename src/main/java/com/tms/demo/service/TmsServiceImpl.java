package com.tms.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.tms.demo.model.Application;
import com.tms.demo.model.Project;
import com.tms.demo.model.Terminal;
import com.tms.demo.model.TerminalGroup;
import com.tms.demo.repository.ApplicationRepository;
import com.tms.demo.repository.ProjectRepository;
import com.tms.demo.repository.TerminalGroupRepository;
import com.tms.demo.repository.TerminalRepository;
import com.tms.demo.service.TmsService;

@Service
public class TmsServiceImpl implements TmsService{
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private TerminalGroupRepository terminalGroupRepository;
	
	@Autowired
	private TerminalRepository terminalRepository;
	
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

	
}
