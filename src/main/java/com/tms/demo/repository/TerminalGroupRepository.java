package com.tms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.demo.model.TerminalGroup;

@Repository
public interface TerminalGroupRepository extends JpaRepository<TerminalGroup, Long>{

}
