package com.tms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo="user_types")
public class UserType {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	public UserType() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
