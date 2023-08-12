package com.startup.startup.services;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.startup.startup.model.Person;
import com.startup.startup.repositories.PersonRespositories;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {
    
    @Autowired
    private PersonRespositories repositories;

    private static final Logger logger = Logger.getLogger(Person.class.getName());


    
    public Person findById(Long id){

        logger.info("Finding a person where id: "+ id);
        return repositories.findById(id)
                .orElseThrow(NoSuchElementException::new);       
    }

    public List findAll(){

        logger.info("Find All Persons");
        return repositories.findAll();

    }

    public Person createPerson(Person person){

        logger.info("Creating a Person");
        repositories.save(person);

        return person;

    }

    public Person updatePerson(Person person){

        logger.info("Updating a Person");
        Person personUpdated = repositories.findById(person.getId()).orElseThrow(NoSuchElementException::new);
        
        personUpdated.setFirstName(person.getFirstName());
        personUpdated.setLastName(person.getLastName());
        personUpdated.setAddres(person.getAddres());
        personUpdated.setGender(person.getGender());
        
        repositories.save(personUpdated);

        return personUpdated;

    }
    public String deletePerson(Long id){

        logger.info("Deleting a Person");
        repositories.deleteById(id);

        return "Person deleted with sucess!!";
    }

}
