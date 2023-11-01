package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Payment;
import com.fikri.syamsudin.validation.model.group.CreditCardPaymentGroup;
import com.fikri.syamsudin.validation.model.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupConstraintTest extends AbstractTest{


    @Test
    void paymentWIthCreditCardTest() {
        Payment payment = new Payment();
        payment.setOrderId("0001");
        payment.setAmount(20_000L);
        payment.setCreditCard("invalidCC");
        this.validateWithGroup(payment, CreditCardPaymentGroup.class);
    }


    @Test
    void paymentWIthVA() {
        Payment payment = new Payment();
        payment.setOrderId("0001");
        payment.setAmount(20_000L);
        payment.setCreditCard("invalidCC"); // tidak akan dicek karena menggunakan group  VirtualAccountPaymentGroup
        this.validateWithGroup(payment, VirtualAccountPaymentGroup.class);
    }
}
