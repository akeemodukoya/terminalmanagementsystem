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
	
	@ManyToOne
	private Application applications;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "project_id")
	private Set<Project> project = new HashSet<>();

	public User(String email, String first_name, String last_name) {
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
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
	
}
