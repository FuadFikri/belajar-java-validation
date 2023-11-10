package com.fikri.syamsudin.validation;

import com.fikri.syamsudin.validation.model.Customer;
import com.fikri.syamsudin.validation.model.Payment;
import com.fikri.syamsudin.validation.model.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

import java.util.Locale;

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

    @Test
    void internalizationTest() {
        Locale.setDefault(new Locale("in","ID"));
        Payment payment = new Payment();
        payment.setOrderId("");
        payment.setAmount(1000L);
        payment.setVirtualAccount("VA123");

        Customer customer = new Customer();
        payment.setCustomer(customer);

        this.validate(payment);
    }
}
