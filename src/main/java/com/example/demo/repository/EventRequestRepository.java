package com.example.demo.repository;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.EventRequest;

// TODO: Borrar la dependencia jpa del pom.xml

public interface EventRequestRepository extends MongoRepository<EventRequest, String> {
    public void save(Optional<EventRequest> eventRequestNew);
}
