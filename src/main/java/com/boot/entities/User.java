package com.boot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id // will act as PK in table
    @GeneratedValue // for auto incrementation
    private int id;

    @Column
    private String name;
    private String email;
    private long contact;

    public User(){
    }

    /**
     * Parameterised constructor
     * @param name
     * @param email
     * @param contact
     */
    public User(String name, String email, long contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}

/*
localhost:8091/saveUser -> post request
* {
 "id": 1,
 "name": "sumit",
 "email": "s@gmail.com",
 "contact": "8898784589"
}
*
* */