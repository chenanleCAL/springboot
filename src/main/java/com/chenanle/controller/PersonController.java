package com.chenanle.controller;

import com.chenanle.entity.Person;
import com.chenanle.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenanle on 2018/6/8.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }
}
