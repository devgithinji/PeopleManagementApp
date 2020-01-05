package com.densoftdev.PeopleManagement.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person_table")
public class Person {


    public Person() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int id;
    @Column(name = "first_name",length = 60,nullable = false)
    private String firstName;
    @Column(name = "last_name",length = 60,nullable = false)
    private String lastName;
    @Column(name = "email",unique = true)
    private String Email;
    @Column(name = "creation_date")
    private Date creationDate;

    public Person(String firstName, String lastName, String email, Date creationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Person [id="+ id +",firstName = "+ firstName +",lastName = "+ lastName +", creationDate="+creationDate+"]";
    }
}
