package com.psy888.fcc.service;

import com.psy888.fcc.dao.PersonDao;
import com.psy888.fcc.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


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

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }
}
