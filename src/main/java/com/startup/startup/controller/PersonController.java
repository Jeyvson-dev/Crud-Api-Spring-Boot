package com.startup.startup.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.startup.startup.model.Person;
import com.startup.startup.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices services;

    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person createPerson(@RequestBody Person person){

        return services.createPerson(person);
    } 

    @RequestMapping(method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List findAll(){

        return services.findAll();

    }

    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person updatePerson(@RequestBody Person person){

        return services.updatePerson(person);   
    }

    @RequestMapping(value = "{id}",method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deletePerson(@PathVariable(value = "id") Long id){

        return services.deletePerson(id);

    } 

    @RequestMapping(value = "{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") Long id){

        return services.findById(id) ;
    }

     
}
