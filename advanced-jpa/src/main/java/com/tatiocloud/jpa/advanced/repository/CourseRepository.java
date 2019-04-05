package com.tatiocloud.jpa.advanced.repository;

import com.tatiocloud.jpa.advanced.entities.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext
    EntityManager entityManager;


    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }


    /*
    public Course save(Course course) {
        return entityManager.merge(course);

    }

    public void delete(Course course) {
        entityManager.remove(course);
    }
    */


}
