package com.psy888.fcc.api;

import com.psy888.fcc.model.Person;
import com.psy888.fcc.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
}
