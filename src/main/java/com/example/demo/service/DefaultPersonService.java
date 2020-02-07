package com.example.demo.service;


import com.example.demo.api.services.H2DatabaseRepository;
import com.example.demo.api.services.PersonService;
import com.example.demo.interfaces.AddPersonRequest;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultPersonService implements PersonService {

    private final H2DatabaseRepository repository;

    @Autowired
    private  DefaultRequestMapper mapper;

    public DefaultPersonService(H2DatabaseRepository repository) {
        this.repository = repository;
    }

    public int addPerson(AddPersonRequest request) {

        final Person person = new Person(request.getId(), request.getName());

        return repository.insertPerson(person);
    }

    public List<Person> getAllPeople() {

        return repository.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return repository.selectPersonById(id);
    }

    public int deletePerson(UUID id) {

        return repository.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person person) {

        return repository.updatePersonById(id, person);
    }


}
