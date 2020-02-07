package com.example.demo.api.services;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface H2DatabaseRepository {

    Integer insertPerson(UUID id, Person person);

    default Integer insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    Integer deletePersonById(UUID id);

    Integer updatePersonById(UUID id, Person person);
}
