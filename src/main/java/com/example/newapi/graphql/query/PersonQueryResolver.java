package com.example.newapi.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.newapi.dao.PersonDAO;
import com.example.newapi.data.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private PersonDAO personDAO;

	public Person person(String id) {
		return personDAO.getPersonById(id);
	}

	public List<Person> personsByName(String name) {
		return personDAO.getPersonsByName(name);
	}

}
