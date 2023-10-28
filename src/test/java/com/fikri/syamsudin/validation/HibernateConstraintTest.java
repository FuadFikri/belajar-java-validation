package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Payment;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class HibernateConstraintTest extends AbstractTest {


    @Test
    void testHIbernateValidator_VALID() {
        Payment payment = new Payment();
        payment.setOrderId("ORDER_ID 1234");
        payment.setAmount(1000L);
        payment.setCreditCard("4111111111111111");

        Set<ConstraintViolation<Object>> violations =  this.validate(payment);
        Assertions.assertEquals(0, violations.size());

    }


    @Test
    void testHIbernateValidator_INVALID() {
        Payment payment = new Payment();
        payment.setOrderId("ORDER_ID 1234");
        payment.setAmount(900L); // INVALID
        payment.setCreditCard("433"); //invalid

        Set<ConstraintViolation<Object>> violations =  this.validate(payment);
        Assertions.assertEquals(2, violations.size());

    }
}
