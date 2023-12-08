package com.fikri.syamsudin.validation;


import com.fikri.syamsudin.validation.model.Register;
import org.junit.jupiter.api.Test;

public class ClassLevelValidationTest extends AbstractTest{

    @Test
    void testClassLevel() {
        Register register = new Register();
        register.setUsername("isna");
        register.setPassword("rahasia");
        register.setReTypePassword("hahaha");
        this.validate(register);
    }
}
