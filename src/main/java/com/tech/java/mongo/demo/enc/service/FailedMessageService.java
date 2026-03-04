package com.tech.java.mongo.demo.enc.service;


import com.tech.java.mongo.demo.enc.model.FailedMessageDoc;
import com.tech.java.mongo.demo.enc.repository.FailedMessageRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class FailedMessageService {

    private final FailedMessageRepository repository;

    public FailedMessageService(FailedMessageRepository repository) {
        this.repository = repository;
    }

    public Mono<FailedMessageDoc> saveMessage(FailedMessageDoc doc) {
        return repository.save(doc);
    }

    public Flux<FailedMessageDoc> getAll() {
        return repository.findAll();
    }

    public Mono<FailedMessageDoc> findById(String id) {
        return repository.findById(id);
    }
}
