package com.tms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.demo.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
