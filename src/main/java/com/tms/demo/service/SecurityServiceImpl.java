package com.tms.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.tms.demo.service.SecurityService;
import com.tms.demo.service.TmsService;

@Service
public class SecurityServiceImpl implements SecurityService{

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private TmsService tmsService;
	
	private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	@Override
	public String findLoggedInEmail() {
		Object userDetails instanceof UserDetails) {
			return ((UserDetails)userDetails).getEmail();
		}
		return null;
	}
	
	@Override
	public void autologin(String email, String password) {
		UserDetails userDetails = tmsService.findByEmail(email);
		EmailPasswordAuthenticationToken emailPasswordAuthenticationToken = new EmailPasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
		
		authenticationManager.authenticate(emailPasswordAuthenticationToken);
		
		if (emailPasswordAuthenticationToken.isAuthenticated()) {
			SecurityContextHolder.getContext().setAuthentication(emailPasswordAuthenticationToken);
			logger.debug(String.format("Autologin %s successfully!", email));
		}
	}
}
