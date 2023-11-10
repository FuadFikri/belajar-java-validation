package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Address;
import com.fikri.syamsudin.validation.model.Person;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Set;

public class ConstructorValidationTest extends AbstractTest {

    @Test
    void validateConstructorReturnValue() throws NoSuchMethodException {

        String firstName = "";
        String lastName = "";
        Address address = new Address();

        Person person = new Person(firstName, lastName, address);

        Constructor<Person> constructor = Person.class.getConstructor(String.class, String.class, Address.class);

        Set<ConstraintViolation<Person>> constraintViolations = executableValidator.validateConstructorReturnValue(constructor, person);
        constraintViolations.forEach(violation -> {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
        });


    }

    @Test
    void validateConstructor() throws NoSuchMethodException {

        String firstName = "";
        String lastName = "";
        Address address = new Address();

        Constructor<Person> constructor = Person.class.getConstructor(String.class, String.class, Address.class);

        Set<ConstraintViolation<Person>> constraintViolations = executableValidator.validateConstructorParameters(constructor, new Object[]{firstName, lastName, address});
        constraintViolations.forEach(violation -> {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
        });


    }
}
