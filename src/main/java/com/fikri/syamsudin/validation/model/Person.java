package com.fikri.syamsudin.validation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Person {



    @Size(max = 10, message = "max 10 characters first name length ")
    @NotBlank(message = "first name can not be blank")
    private String firstName;

    @NotBlank(message = "last name can not be blank")
    private String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person() {
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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
