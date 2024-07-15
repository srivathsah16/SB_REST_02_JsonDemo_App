package com.srivath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srivath.databind.Person;

@RestController
public class PersonController {

	@GetMapping("/")
	public Person getPerson() {
		Person person = new Person();
		person.setName("Ram");
		person.setId(1);
		person.setGender("Male");
		person.setEmail("abc@gmail.com");
		return person;
	}
}
