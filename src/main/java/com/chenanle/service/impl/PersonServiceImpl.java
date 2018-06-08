package com.chenanle.service.impl;

import com.chenanle.dao.PersonRepository;
import com.chenanle.entity.Person;
import com.chenanle.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by chenanle on 2018/6/8.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person addPerson(Person person) {
        person.setCreateTime(new Date());
        person.setUpdateTime(new Date());
        return personRepository.save(person);
    }
}
