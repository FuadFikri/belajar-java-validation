package com.fikri.syamsudin.validation.model;

import com.fikri.syamsudin.validation.constraints.CheckPassword;
import jakarta.validation.constraints.NotBlank;



@CheckPassword( message = "password and re type password must same")
public class Register {


    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String reTypePassword;


    public Register() {
    }


    @Override
    public String toString() {
        return "Register{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", reTypePassword='" + reTypePassword + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReTypePassword() {
        return reTypePassword;
    }

    public void setReTypePassword(String reTypePassword) {
        this.reTypePassword = reTypePassword;
    }
}
