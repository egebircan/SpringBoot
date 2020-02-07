package com.example.demo.service;

import com.example.demo.interfaces.AddPersonRequest;
import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class DefaultRequestMapper {

    public Person mapRequestToPerson(final AddPersonRequest personRequest){
        return new Person(personRequest.getId(),personRequest.getName());
    }
}
