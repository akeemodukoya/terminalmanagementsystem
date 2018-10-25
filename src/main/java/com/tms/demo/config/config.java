package com.tms.demo.config;


@EnableWebSecurity
public class config extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.anyRequest.authenticate()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll();
	}
}
