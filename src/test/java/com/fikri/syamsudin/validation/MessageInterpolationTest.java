package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Customer;
import com.fikri.syamsudin.validation.model.Payment;
import com.fikri.syamsudin.validation.model.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

public class MessageInterpolationTest extends AbstractTest{

    @Test
    void paymentTest() {
        Payment payment = new Payment();
        payment.setOrderId("");
        payment.setAmount(1000L);
        payment.setVirtualAccount("VA123");

        Customer customer = new Customer();
        payment.setCustomer(customer);

        this.validate(payment);
    }
}
