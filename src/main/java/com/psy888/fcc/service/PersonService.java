package com.psy888.fcc.service;

import com.psy888.fcc.dao.PersonDao;
import com.psy888.fcc.model.Person;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonService {

    private final PersonDao personDao;

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
