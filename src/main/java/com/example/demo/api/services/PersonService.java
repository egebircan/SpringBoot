package com.example.demo.api.services;

import com.example.demo.interfaces.AddPersonRequest;
import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonService {


    public int addPerson(AddPersonRequest request);

    public List<Person> getAllPeople();

    public Optional<Person> getPersonById(UUID id);

    public int deletePerson(UUID id);

    public int updatePerson(UUID id, Person person);
}
