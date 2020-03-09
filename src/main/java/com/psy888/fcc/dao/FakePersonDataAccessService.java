package com.psy888.fcc.dao;

import com.psy888.fcc.model.Person;

import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }
}
