package com.cperbony.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cperbony.models.Person;

@RestController
@RequestMapping("/people")
public interface PeopleService {
	
	public Person create(Person person);
	public List<Person> findAll();
	public void remove(Long id);
	

	
	
	
	
}
