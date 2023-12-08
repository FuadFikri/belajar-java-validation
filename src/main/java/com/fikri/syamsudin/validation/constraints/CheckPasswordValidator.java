package com.fikri.syamsudin.validation.constraints;

import com.fikri.syamsudin.validation.model.Register;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckPasswordValidator implements ConstraintValidator<CheckPassword, Register> {
    @Override
    public boolean isValid(Register register, ConstraintValidatorContext constraintValidatorContext) {
        if (register.getPassword() == null || register.getReTypePassword() == null) return true;

        return register.getPassword().equals(register.getReTypePassword());
    }
}
