package com.tms.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.anyRequest.authenticate()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}
}
