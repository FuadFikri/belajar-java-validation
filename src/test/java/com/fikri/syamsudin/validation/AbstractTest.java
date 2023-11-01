package com.fikri.syamsudin.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Set;

public class AbstractTest {

    protected ValidatorFactory validatorFactory;
    protected Validator validator;


    @BeforeEach
    void setUp() {
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @AfterEach
    void tearDown() {
        validatorFactory.close();
    }


    protected Set<ConstraintViolation<Object>> validate(Object o){
        Set<ConstraintViolation<Object>> violations = validator.validate(o);
        for (ConstraintViolation<Object> violation : violations) {
            System.out.println("message : " + violation.getMessage());
            System.out.println("leafBean : " + violation.getLeafBean()); // fieldnya ada dimana
            System.out.println("annotation : " + violation.getConstraintDescriptor().getAnnotation());
            System.out.println("invalid value : " + violation.getInvalidValue());
            System.out.println("path : " + violation.getPropertyPath());

            System.out.println("============");
        }

        return violations;
    }

    protected Set<ConstraintViolation<Object>> validateWithGroup(Object o, Class<?>... groups){
        Set<ConstraintViolation<Object>> violations = validator.validate(o,groups);
        for (ConstraintViolation<Object> violation : violations) {
            System.out.println("message : " + violation.getMessage());
            System.out.println("leafBean : " + violation.getLeafBean()); // fieldnya ada dimana
            System.out.println("annotation : " + violation.getConstraintDescriptor().getAnnotation());
            System.out.println("invalid value : " + violation.getInvalidValue());
            System.out.println("path : " + violation.getPropertyPath());

            System.out.println("============");
        }

        return violations;
    }
}
