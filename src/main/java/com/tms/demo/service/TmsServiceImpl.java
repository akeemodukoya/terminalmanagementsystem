package com.tms.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tms.demo.model.Application;
import com.tms.demo.model.Project;
import com.tms.demo.model.Terminal;
import com.tms.demo.model.TerminalGroup;
import com.tms.demo.model.User;
import com.tms.demo.model.UserType;
import com.tms.demo.repository.ApplicationRepository;
import com.tms.demo.repository.ProjectRepository;
import com.tms.demo.repository.TerminalGroupRepository;
import com.tms.demo.repository.TerminalRepository;
import com.tms.demo.repository.UserRepository;
import com.tms.demo.repository.UserTypeRepository;
import com.tms.demo.service.TmsService;

@Service
public class TmsServiceImpl implements TmsService{
	
	private ApplicationRepository applicationRepository;
	private ProjectRepository projectRepository;
	private TerminalGroupRepository terminalGroupRepository;
	private TerminalRepository terminalRepository;
	private UserRepository userRepository;
	private UserTypeRepository userTypeRepository;
	
	@Autowired
	public TmsServiceImpl(ApplicationRepository applicationRepository, ProjectRepository projectRepository,
			TerminalGroupRepository terminalGroupRepository, TerminalRepository terminalRepository,
			UserRepository userRepository, UserTypeRepository userTypeRepository) {
		this.applicationRepository = applicationRepository;
		this.projectRepository = projectRepository;
		this.terminalGroupRepository = terminalGroupRepository;
		this.terminalRepository = terminalRepository;
		this.userRepository = userRepository;
		this.userTypeRepository = userTypeRepository;
	}
	
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
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
	public void SaveUserType(UserType userType) throws DataAccessException {
		// TODO Auto-generated method stub
		userTypeRepository.save(userType);
	}
	
	@Override
	@Transactional
	public UserDetails findByEmail(String Email) throws DataAccessException {
		User user = userRepository.findByEmail(Email);
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		for (UserType userType : user.getUserTypes()) {
			grantedAuthorities.add(new SimpleGrantedAuthority(userType.getName()));
		}
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthorities);
	}
	
	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setUserTypes(new HashSet<>(userTypeRepository.findAll()));
		userRepository.save(user);
	}
	
}
