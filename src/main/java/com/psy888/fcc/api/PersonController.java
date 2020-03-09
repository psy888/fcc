package com.psy888.fcc.api;

import com.psy888.fcc.model.Person;
import com.psy888.fcc.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonService personService;

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
