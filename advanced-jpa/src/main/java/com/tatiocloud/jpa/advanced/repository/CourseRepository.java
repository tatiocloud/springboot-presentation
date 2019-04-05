package com.tatiocloud.jpa.advanced.repository;

import com.tatiocloud.jpa.advanced.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    EntityManager entityManager;


    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }


    public Course save(Course course) {
        return null;
    }

    public void delete(long id) {

    }


}
