package com.example.newapi.repository;

import com.example.newapi.data.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

	List<Person> findByNameLike(String name);

}
