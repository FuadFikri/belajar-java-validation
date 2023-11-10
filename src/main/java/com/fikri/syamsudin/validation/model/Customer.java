package com.fikri.syamsudin.validation.model;

import com.fikri.syamsudin.validation.model.payload.EmailErrorPayload;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Customer {

    @NotBlank(message = "customer name cannot be blank")
    private String name;

    @NotBlank(message = "customer address cannot be blank")
    private String address;

    @NotBlank(message = "email cannot be blank")
    @Email(message = "email is not valid", payload = {EmailErrorPayload.class})
    private String email;

    public Customer() {
    }

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
