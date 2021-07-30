package com.example.openapidemo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;


    public User() {}

    User(String email, String password, String firstName, String lastName) {

        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }




    public Long getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.email, this.password, this.firstName, this.lastName);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", email='" + this.email + '\'' + ", password='" + this.password + '\'' + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + '}';
    }


}
