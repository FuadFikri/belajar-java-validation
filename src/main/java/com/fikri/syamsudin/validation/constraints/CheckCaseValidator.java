package com.fikri.syamsudin.validation.constraints;

import com.fikri.syamsudin.validation.model.enums.CaseMode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {


    private CaseMode caseMode;


    @Override
    public void initialize(CheckCase constraintAnnotation) {
        caseMode = constraintAnnotation.mode();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) return true; // skip validation

        if (caseMode == CaseMode.LOWER_CASE){
            return value.equals(value.toLowerCase());
        }else if (caseMode == CaseMode.UPPER_CASE){
            return value.equals(value.toUpperCase());
        }

        return false;
    }
}
