package com.tatiocloud.springboot.database.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class Person {

    private int id;
    private String name;
    private String location;
    private Timestamp birthday;

    public Person(){
        //for hibernate use
    }

    public Person(int id, String name, String location, Timestamp birthday) {
        super();
        this.id = id;
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

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
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
