package com.startup.startup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.startup.startup.model.Person;

@Repository
public interface PersonRespositories extends JpaRepository<Person, Long>{}
