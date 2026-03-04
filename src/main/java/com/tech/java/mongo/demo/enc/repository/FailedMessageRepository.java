package com.tech.java.mongo.demo.enc.repository;


import com.tech.java.mongo.demo.enc.model.FailedMessageDoc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FailedMessageRepository extends ReactiveMongoRepository<FailedMessageDoc, String> {
}
