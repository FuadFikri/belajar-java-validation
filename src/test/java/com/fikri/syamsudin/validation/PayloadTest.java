package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Customer;
import com.fikri.syamsudin.validation.model.payload.EmailErrorPayload;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class PayloadTest extends AbstractTest {


    @Test
    void emailTest() {
        Customer customer = new Customer();
        customer.setName("fikri");
        customer.setAddress("indonesia");
        customer.setEmail("ooomail--com"); // invalid email
        Set<ConstraintViolation<Object>> constraintViolations = this.validate(customer);
        constraintViolations.forEach(objectConstraintViolation -> {
            objectConstraintViolation.getConstraintDescriptor().getPayload().forEach(aClass -> {
                if (aClass == EmailErrorPayload.class) {
                    EmailErrorPayload payload = new EmailErrorPayload();
                    payload.letMeKnow(objectConstraintViolation);
                }
            });
        });
    }
}
