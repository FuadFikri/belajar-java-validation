package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Person;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class MethodValidationTest extends AbstractTest {


    @Test
    void sayHelloTest() throws NoSuchMethodException {
        Person person = new Person();

        String herName = "";

        Method method = Person.class.getMethod("sayHello", String.class);

        Set<ConstraintViolation<Person>> constraintViolations = executableValidator.validateParameters(person, method, new Object[]{herName});

        constraintViolations.forEach(violation -> {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
        });

    }

    @Test
    void fullNameTest() throws NoSuchMethodException {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        String herName = "";

        Method method = Person.class.getMethod("fullName");

        String returnValue = person.fullName();

        Set<ConstraintViolation<Person>> constraintViolations = executableValidator.validateReturnValue(person, method, returnValue);

        constraintViolations.forEach(violation -> {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
        });
    }
}
