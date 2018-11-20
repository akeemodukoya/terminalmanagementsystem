package com.tms.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.tms.demo.service.SecurityService;
import com.tms.demo.service.TmsService;

@Service
public class SecurityServiceImpl implements SecurityService{

	
	private AuthenticationManager authenticationManager=new AuthenticationManager() {
		
		@Override
		public Authentication authenticate(Authentication authentication) throws AuthenticationException {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	@Autowired
	private TmsService tmsService;
	
	private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	@Override
	public String findLoggedInEmail() {
		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		if (userDetails instanceof UserDetails) {
			return ((UserDetails)userDetails).getUsername();
		}
		return null;
	}
	
	@Override
	public  void autologin(String email, String password) {
		UserDetails userDetails = tmsService.findByEmail(email);
		
		UsernamePasswordAuthenticationToken emailPasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
		
		authenticationManager.authenticate(emailPasswordAuthenticationToken);
		
		if (emailPasswordAuthenticationToken.isAuthenticated()) {
			SecurityContextHolder.getContext().setAuthentication(emailPasswordAuthenticationToken);
			logger.debug(String.format("Autologin %s successfully!", email));
		}
	}

	@Override
	public void autologin(String email, String password, String password_confirm) {
		// TODO Auto-generated method stub
		
	}
}
