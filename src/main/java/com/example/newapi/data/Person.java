package com.example.newapi.data;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "person")
public class Person {

	@Id
	private String id;

	private String name;

}
