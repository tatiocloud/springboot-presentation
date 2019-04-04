package com.tatiocloud.springboot.database.jpa;

import com.tatiocloud.springboot.database.beans.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {


    //Connect to Database, Remember you use JDBC Template
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){
        return entityManager.find(Person.class,id);// use JPA
    }
}
