package com.example.spring_hibernate.repositories;


import com.example.spring_hibernate.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> getPersonByName(String name);
}
