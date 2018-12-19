package com.tms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.demo.model.Terminal;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Long>{
    Terminal findTerminalById(int id);
}
