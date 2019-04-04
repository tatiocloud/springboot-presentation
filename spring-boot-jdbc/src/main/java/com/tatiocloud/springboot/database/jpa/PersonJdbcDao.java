package com.tatiocloud.springboot.database.jpa;

import com.tatiocloud.springboot.database.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class PersonJdbcDao {

    //Use JDBC Template for Connection and Let Spring provide Instance by Autowired Annotation.
    @Autowired
    JdbcTemplate jdbcTemplate;

    //select * from person
    //this will return all persons as List of Persons.
    public List<Person> findAll() {

        //This will execute the query and now you will have to map this to a ROwMapper,
        // we use default BeanPropertyRowMapper class and pass Person class.
        return jdbcTemplate.query("select * from person",
                        new BeanPropertyRowMapper<>(Person.class));
    }

    //select * from person where id=?
    //this will return a person who matches his id.
    public Person findById(int id) {

        //This will execute the query and now you will have to map this to a ROwMapper,
        // we use default BeanPropertyRowMapper class and pass Person class.
        return jdbcTemplate.queryForObject(
                        "select * from person where id = ?",
                        new Object[] { id },
                        new BeanPropertyRowMapper<>(Person.class));
    }

    //delete a Person from the database whose id = ??
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id = ?", new Object[] { id });
    }

    //delete a Person from the database whose id = ?? and name =??
    public int deleteByIdAndName(int id, String name) {
        return jdbcTemplate.update("delete from person where id = ? and name =?", new Object[] { id, name });
    }

    //now insert person using template
    public int insert(Person person) {
        return jdbcTemplate.update("insert into person(id,name,location,birthday) "
                                   + "values ( ?,?,?,? )",
                        new Object[] { person.getId(),
                                        person.getName(),
                                        person.getLocation(),
                                        person.getBirthday() });
    }

    //now insert person using template
    public int update(Person person) {
        return jdbcTemplate.update("update person set name =?,location=?,birthday=? "
                                   + "where id=?",
                        new Object[] { person.getName(),
                                        person.getLocation(),
                                        new Date(person.getBirthday().getTime()),person.getId() });
    }
}
