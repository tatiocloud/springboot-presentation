package com.tatiocloud.springboot.database;

import com.tatiocloud.springboot.database.entity.Person;
import com.tatiocloud.springboot.database.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override public void run(String... args) throws Exception {

        Person person = new Person("XYZ","London", new Date(10000000L));
        Person insertedPerson = repository.insert(person);
        logger.info("User with id 10001 -> {}", insertedPerson.getId());

        insertedPerson.setLocation("New York");
        Person updatedPerson = repository.update(insertedPerson);
        logger.info("User with id {} -> {}", insertedPerson.getId(), repository.findById(insertedPerson.getId()));
        logger.info("User with idUpdated {} -> {}", updatedPerson.getId(), repository.findById(updatedPerson.getId()));

        logger.info("Deleting person -> {}",updatedPerson.getId());
        repository.deleteById(updatedPerson.getId());
        logger.info("Checking if person has been for id {} -> {}",updatedPerson.getId(), repository.findById(updatedPerson.getId()));

        logger.info("find All Persons -> {}",repository.findAll());


    }
}
