package com.java.springapi.controller;

import com.java.springapi.model.PersonModel;
import com.java.springapi.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService _personService;

    @GetMapping
    public ResponseEntity<List<PersonModel>> getAll() {
        return new ResponseEntity<>(_personService.getPeople(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Optional<PersonModel>> getById(@PathVariable String id) {
        return new ResponseEntity<>(_personService.getPersonById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<PersonModel> create(@RequestBody PersonModel person) {
        return new ResponseEntity<>(_personService.createPerson(person), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<PersonModel>> delete(@PathVariable String id) {
        return new ResponseEntity<>(_personService.deletePerson(id), HttpStatus.OK);
    }

    @PutMapping("/update/")
    public ResponseEntity<PersonModel> update(@RequestBody PersonModel person) {
        return new ResponseEntity<>(_personService.updatePerson(person), HttpStatus.OK);
    }
}
