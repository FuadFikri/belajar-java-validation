package com.fikri.syamsudin.validation.model.group;


import jakarta.validation.GroupSequence;
import jakarta.validation.groups.Default;

@GroupSequence( value = {
        Default.class,
        VirtualAccountPaymentGroup.class,
        CreditCardPaymentGroup.class
})
public interface PaymentGroup {
}
