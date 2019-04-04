package com.tatiocloud.springboot.database;

import com.tatiocloud.springboot.database.beans.Person;
import com.tatiocloud.springboot.database.jpa.PersonRowMapperJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;

@SpringBootApplication
public class SpringBootRowMapperJdbcApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired PersonRowMapperJdbcDao rowMapperJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRowMapperJdbcApplication.class, args);
    }

    @Override public void run(String... args) throws Exception {

        logger.info("=====================Custom Row Mapper============================");

        logger.info("All Users -> {}", rowMapperJdbcDao.findAll());

        logger.info("Person with id 106 -> {}", rowMapperJdbcDao.findById(106));
        logger.info("Person with id 107 -> {}", rowMapperJdbcDao.findById(107));
        logger.info("Person with id 108 -> {}", rowMapperJdbcDao.findById(108));

        logger.info("Person with id 106 delete -> {}",rowMapperJdbcDao.deleteById(101));


        //logger.info("Person with id and name -> {}",rowMapperJdbcDao.deleteByIdAndName(107,"XYZ"));
        Person personRM = new Person(110, "SridharUpdate", "London", new Timestamp(100000L));
        logger.info("insert person ->, {}" , rowMapperJdbcDao.insert(personRM));

        personRM.setName("XXXX");
        personRM.setLocation("Hyderabad");
        personRM.setBirthday(new Timestamp(100000L*2000L));
        logger.info("update name of a person -> {}", rowMapperJdbcDao.update(personRM));

        logger.info("=====================End of Custom Row Mapper============================");

    }
}
