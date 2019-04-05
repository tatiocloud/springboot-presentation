package com.tatiocloud.springboot.database.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class Person {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "birthday")
    private Date birthday;

    public Person(){
        //for hibernate use
    }

    public Person(int id, String name, String location, Date birthday) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthday = birthday;
    }

    public Person(String name, String location, Date birthday) {
        super();
        this.name = name;
        this.location = location;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Person))
            return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
               Objects.equals(getLocation(), person.getLocation()) &&
               Objects.equals(getBirthday(), person.getBirthday());
    }

    @Override public int hashCode() {
        return Objects.hash(getName(), getLocation(), getBirthday());
    }

    @Override public String toString() {
        return "Person{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", location='" + location + '\'' +
               ", birthday=" + birthday +
               '}';
    }
}
