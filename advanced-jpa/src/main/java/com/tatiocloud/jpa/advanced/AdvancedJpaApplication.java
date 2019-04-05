package com.tatiocloud.jpa.advanced;

import com.tatiocloud.jpa.advanced.entities.Course;
import com.tatiocloud.jpa.advanced.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvancedJpaApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AdvancedJpaApplication.class, args);
    }

    @Override public void run(String... args) throws Exception {

        Course courseReturned = repository.findById(101);
        logger.info("Course with id {} -> {}",courseReturned.getId(),courseReturned.getName());

    }
}
