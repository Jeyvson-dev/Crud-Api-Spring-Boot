package com.startup.startup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.startup.startup.model.Person;

public interface PersonRespositories extends JpaRepository<Person, Long>{}
