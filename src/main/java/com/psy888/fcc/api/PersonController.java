package com.psy888.fcc.api;

import com.psy888.fcc.model.Person;
import com.psy888.fcc.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;


@RequiredArgsConstructor
@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void addPerson(@Valid @NotNull @RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void removePersonById(@PathVariable("id") UUID id) {
        personService.removePersonById(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Person personToUpdate){
        personService.updatePerson(id,personToUpdate);
    }

}
