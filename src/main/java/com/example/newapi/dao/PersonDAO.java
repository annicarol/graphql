package com.example.newapi.dao;

import com.example.newapi.data.Person;
import com.example.newapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDAO {

	@Autowired
	private PersonRepository personRepository;

	public Person getPersonById(String id) {
		return personRepository.findById(id).orElse(new Person());
	}

	public List<Person> getPersonsByName(String name) {
		return personRepository.findByNameLike(name);
	}

}
