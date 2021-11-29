package com.java.springapi.repository;

import com.java.springapi.model.PersonModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPersonRepository extends MongoRepository<PersonModel, String> {
}
