package com.tms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "terminal_group")
public class TerminalGroup {
	@Id
	@GeneratedValue
	private Integer id;
	private String application;
	private String name;
	private Integer terminal_id;
	private String partition_size;
	private String upgrade_type;
	
	@OneToMany
	private Terminal terminal;

	public TerminalGroup(String application, String name, Integer terminal_id, String partition_size,
			String upgrade_type) {
		this.application = application;
		this.name = name;
		this.terminal_id = terminal_id;
		this.partition_size = partition_size;
		this.upgrade_type = upgrade_type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTerminal_id() {
		return terminal_id;
	}

	public void setTerminal_id(Integer terminal_id) {
		this.terminal_id = terminal_id;
	}

	public String getPartition_size() {
		return partition_size;
	}

	public void setPartition_size(String partition_size) {
		this.partition_size = partition_size;
	}

	public String getUpgrade_type() {
		return upgrade_type;
	}

	public void setUpgrade_type(String upgrade_type) {
		this.upgrade_type = upgrade_type;
	}
	
}

