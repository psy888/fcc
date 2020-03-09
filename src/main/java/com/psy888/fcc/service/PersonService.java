package com.psy888.fcc.service;

import com.psy888.fcc.dao.PersonDao;
import com.psy888.fcc.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonDao personDao;

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPerson();
    }
}
