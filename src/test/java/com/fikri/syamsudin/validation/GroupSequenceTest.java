package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Payment;
import com.fikri.syamsudin.validation.model.group.PaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupSequenceTest extends AbstractTest{


    @Test
    void orderIdNullTest() {

        Payment payment = new Payment();
        this.validateWithGroup(payment, PaymentGroup.class);
    }

    @Test
    void vaIsNullTest() {
        Payment payment = new Payment();
        payment.setOrderId("okokoko");
        payment.setAmount(1000L);
        payment.setVirtualAccount(null);
        this.validateWithGroup(payment, PaymentGroup.class);

    }
}
