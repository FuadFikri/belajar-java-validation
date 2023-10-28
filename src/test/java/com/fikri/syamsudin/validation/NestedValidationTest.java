package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Address;
import com.fikri.syamsudin.validation.model.Person;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class NestedValidationTest {


    private ValidatorFactory validatorFactory;
    private Validator validator;


    @BeforeEach
    void setUp() {
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @AfterEach
    void tearDown() {
        validatorFactory.close();
    }

    @Test
    void validationFailedTest() {
        Person person = new Person();
        person.setFirstName("FIKRI");
        person.setLastName("Fuad");

        Address address = new Address();
        address.setProvince("Yogyakarta");
        address.setDistrict("");

        person.setAddress(address);

        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        Assertions.assertEquals(1, violations.size());

        for (ConstraintViolation<Person> violation : violations) {
            System.out.println("message : " + violation.getMessage());
            System.out.println("leafBean : " + violation.getLeafBean()); // fieldnya ada dimana
            System.out.println("annotation : " + violation.getConstraintDescriptor().getAnnotation());
            System.out.println("invalid value : " + violation.getInvalidValue());
            System.out.println("path : " + violation.getPropertyPath());

            System.out.println("============");
        }

    }
}
