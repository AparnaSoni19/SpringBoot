package com.oreilly.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name ="bpd_author")
public class Author implements Serializable {
    @Id
    private long id;
    private String firstName;
    private String lastName;

//    public Author(long id, String firstName, String lastName) {
//        super();
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    public Author(String first_name, String last_name) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
