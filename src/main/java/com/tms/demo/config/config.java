package com.tms.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tms.demo.service.TmsService;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter{
	
	@Autowired
	TmsService tmsService;
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/css/**", "/index").permitAll()
				.antMatchers("/bootstrap/**").permitAll()
				.antMatchers("/images/**").permitAll()
				.antMatchers("/scripts/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder tms) throws Exception{
		tms.tmsService(tmsService).passwordEncoder(bCryptPasswordEncoder());
	}
	
}
