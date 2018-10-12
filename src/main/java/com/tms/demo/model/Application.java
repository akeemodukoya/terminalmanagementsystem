package com.tms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Table;

@Entity
@Table( appliesTo = "application")
public class Application {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String file;
	private String version;
	
	@ManyToOne
	private User user;
	
	public Application( String name, String file, String version) {
		this.name = name;
		this.file = file;
		this.version = version;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
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

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
}
