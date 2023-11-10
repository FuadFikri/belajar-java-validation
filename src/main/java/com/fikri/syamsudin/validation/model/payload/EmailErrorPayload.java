package com.fikri.syamsudin.validation.model.payload;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Payload;

public class EmailErrorPayload  implements Payload {

    public void letMeKnow(ConstraintViolation<?> constraintViolation){
        System.out.println("email error : "+ constraintViolation);
        System.out.println("do something");
    }
}
