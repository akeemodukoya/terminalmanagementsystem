package com.tms.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.demo.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>{
	UserType findByName(String name);
	List<UserType> findAll();
}
