package com.cperbony.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cperbony.models.Person;
import com.cperbony.services.PeopleService;

@RestController
@RequestMapping("/people")
public class PeopleController {
	
	@Autowired
	private PeopleService peopleService;
	
	public PeopleController(PeopleService peopleService) {
		this.peopleService = peopleService;
	}
	
	@GetMapping
	public List<Person> findAll() {
		return this.peopleService.findAll();
	}
	
	@PostMapping
	public Person create(@RequestBody @Valid Person person) {
		return this.peopleService.create(person);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		this.peopleService.remove(id);
	}

}
