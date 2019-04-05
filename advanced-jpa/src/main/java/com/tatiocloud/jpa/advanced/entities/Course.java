package com.tatiocloud.jpa.advanced.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Course {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Course(){
        //for hibernate use
    }

    public Course(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Course))
            return false;
        Course course = (Course) o;
        return Objects.equals(getId(), course.getId()) &&
               Objects.equals(getName(), course.getName());
    }

    @Override public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override public String toString() {
        return "Course{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }
}
