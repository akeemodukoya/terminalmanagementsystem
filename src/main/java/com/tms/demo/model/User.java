package com.tms.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "user")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String email;
	private String first_name;
	private String last_name;
	private String password;
	private String password_confirm;
	
	@Transient
	private Set<UserType> userTypes;
	
	@ManyToOne
	private Application applications;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Project> project = new HashSet<>();
	
	
	public User(String email, String first_name, String last_name) {
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
//	@ManyToOne
	public Set<UserType> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(Set<UserType> userTypes) {
		this.userTypes = userTypes;
	}

	public String getPassword_confirm() {
		return password_confirm;
	}

	public void setPassword_confirm(String password_confirm) {
		this.password_confirm = password_confirm;
	}
	
}
