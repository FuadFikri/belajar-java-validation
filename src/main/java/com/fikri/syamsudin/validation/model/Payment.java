package com.fikri.syamsudin.validation.model;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {


    @NotBlank
    private String orderId;

    @Range(min = 1000 , max = 100_000_000, message = "between 1000 and 100000000")
    private Long amount;

    @LuhnCheck( message = " credit card must be valid ")
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
