package com.school.repository;

import com.school.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{
    Person findById(Long id);
}
