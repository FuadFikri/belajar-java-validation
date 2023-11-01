package com.fikri.syamsudin.validation.model;

import com.fikri.syamsudin.validation.model.group.CreditCardPaymentGroup;
import com.fikri.syamsudin.validation.model.group.VirtualAccountPaymentGroup;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {


    @NotBlank(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class})
    private String orderId;

    @Range(min = 1000 , max = 100_000_000, message = "between 1000 and 100000000")
    private Long amount;

    @LuhnCheck( message = " credit card must be valid ", groups = {CreditCardPaymentGroup.class})
    private String creditCard;


    public Payment() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}
