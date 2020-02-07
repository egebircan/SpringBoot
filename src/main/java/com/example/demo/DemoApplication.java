package com.example.demo;

import com.example.demo.api.services.H2DatabaseRepository;
import com.example.demo.api.services.PersonService;
import com.example.demo.service.DefaultPersonService;
import com.example.demo.service.DefaultRequestMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public PersonService getPersonService(H2DatabaseRepository repository){
        return new DefaultPersonService(repository);
    }

}
