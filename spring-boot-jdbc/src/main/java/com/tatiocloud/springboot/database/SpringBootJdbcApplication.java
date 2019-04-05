package com.tatiocloud.springboot.database;

import com.tatiocloud.springboot.database.entity.Person;
import com.tatiocloud.springboot.database.jpa.PersonJdbcDao;
import com.tatiocloud.springboot.database.jpa.PersonRowMapperJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.sql.Timestamp;

//@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao personJdbcDao;

    @Autowired PersonRowMapperJdbcDao rowMapperJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcApplication.class, args);
    }

    @Override public void run(String... args) throws Exception {

        logger.info("All Users -> {}", personJdbcDao.findAll());

        logger.info("Person with id 101 -> {}", personJdbcDao.findById(101));
        logger.info("Person with id 102 -> {}", personJdbcDao.findById(102));
        logger.info("Person with id 103 -> {}", personJdbcDao.findById(103));
        logger.info("Person with id 103 delete -> {}", personJdbcDao.deleteById(103));

        logger.info("Person with id and name -> {}", personJdbcDao.deleteByIdAndName(104, "XYZ"));
        Person person = new Person(105, "Sridhar", "London", new Timestamp(100000000000L));
        logger.info("insert person ->, {}", personJdbcDao.insert(person));

        person.setName("XXXX");
        person.setBirthday(new Timestamp(100000000000L));
        person.setLocation("Hyderabad");
        logger.info("update name of a person -> {}", personJdbcDao.update(person));

    }
}
