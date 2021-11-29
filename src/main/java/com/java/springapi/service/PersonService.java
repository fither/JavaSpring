package com.java.springapi.service;

import com.java.springapi.model.PersonCreateModel;
import com.java.springapi.model.PersonModel;
import com.java.springapi.repository.IPersonRepository;
import lombok.AllArgsConstructor;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {

    private final IPersonRepository _personRepository;
    private final Mapper _mapper;

    public List<PersonModel> getPeople() {
        return _personRepository.findAll();
    }

    public Optional<PersonModel> getPersonById(String id) {
        return _personRepository.findById(id);
    }

    public PersonModel createPerson(PersonCreateModel person) {
        PersonModel p = _mapper.map(person, PersonModel.class);
        return _personRepository.save(p);
    }

    public Optional<PersonModel> deletePerson(String id) {
        Optional<PersonModel> p = _personRepository.findById(id);
        _personRepository.deleteById(id);

        return p;
    }

    public PersonModel updatePerson(PersonModel person) {
        return _personRepository.save(person);
    }
}
