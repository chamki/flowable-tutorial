package com.soarswing.flow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soarswing.flow.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Person findByUsername(String username);
}
