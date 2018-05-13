package com.perbony.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cperbony.models.Person;

@Repository
public interface Personrepository extends JpaRepository<Person, Long>{

}
