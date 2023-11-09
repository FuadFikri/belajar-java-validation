package com.fikri.syamsudin.validation;


import com.fikri.syamsudin.validation.model.Customer;
import com.fikri.syamsudin.validation.model.Payment;
import com.fikri.syamsudin.validation.model.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupConversionTest extends AbstractTest {


    @Test
    void conversionTest() {

        Payment payment = new Payment();
        payment.setOrderId("OOO123");
        payment.setAmount(1000L);
        payment.setVirtualAccount("VA1223345");
//        Customer customer = new Customer("Joko","Bandung","joko@mail.com");

        Customer customer = new Customer();
        payment.setCustomer(customer);
        this.validateWithGroup(payment, VirtualAccountPaymentGroup.class);
    }
}
