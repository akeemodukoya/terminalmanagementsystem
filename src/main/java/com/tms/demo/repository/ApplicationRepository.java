package com.tms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tms.demo.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{
	Application findApplicationById(Long id);
}
