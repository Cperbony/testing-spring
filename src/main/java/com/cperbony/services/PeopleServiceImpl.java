package com.cperbony.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cperbony.models.Person;
import com.cperbony.repositories.PersonRepository;

@Service
public class PeopleServiceImpl implements PeopleService{
	
	@Autowired
	private PersonRepository personRepository;
	
	public PeopleServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person create(Person person) {
		return this.personRepository.save(person);
	}

	@Override
	public List<Person> findAll() {
		return this.personRepository.findAll();
	}

	@Override
	public void remove(Long id) {
		//Efetuar uma busca para checar a existência antes da deleção
		if (this.personRepository.existsById(id)) {
			this.personRepository.deleteById(id);
		}
	}
	
}
