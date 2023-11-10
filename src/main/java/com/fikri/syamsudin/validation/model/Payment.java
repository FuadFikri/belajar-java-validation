package com.fikri.syamsudin.validation.model;

import com.fikri.syamsudin.validation.model.group.CreditCardPaymentGroup;
import com.fikri.syamsudin.validation.model.group.VirtualAccountPaymentGroup;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.ConvertGroup;
import jakarta.validation.groups.Default;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {


    @NotBlank(groups = {Default.class}, message = "{payment.orderId.blank}")
    @Size(min = 1, max = 20,groups = {Default.class}, message = "{payment.orderId.size}")
    private String orderId;

    @NotBlank(groups = { VirtualAccountPaymentGroup.class})
    private String virtualAccount;

    @Range(min = 1000 , max = 100_000_000, message = "between 1000 and 100000000")
    private Long amount;

    @LuhnCheck( message = " credit card must be valid ", groups = {CreditCardPaymentGroup.class})
    private String creditCard;


    @Valid
    @NotNull(message = "customer cannot be null", groups = {VirtualAccountPaymentGroup.class, CreditCardPaymentGroup.class})
    @ConvertGroup(from = VirtualAccountPaymentGroup.class, to = Default.class)
    @ConvertGroup(from = CreditCardPaymentGroup.class, to = Default.class)
    private Customer customer;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

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

    public String getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(String virtualAccount) {
        this.virtualAccount = virtualAccount;
    }
}
