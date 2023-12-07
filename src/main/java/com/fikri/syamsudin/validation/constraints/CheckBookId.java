package com.fikri.syamsudin.validation.constraints;


import com.fikri.syamsudin.validation.model.enums.CaseMode;
import com.fikri.syamsudin.validation.model.group.BookGroup;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.*;



@NotBlank(groups = BookGroup.class)
@CheckCase(groups = BookGroup.class, message = "{book.id.upper}", mode = CaseMode.UPPER_CASE)
@Size(min = 0, max = 8)
@Documented
@Constraint(validatedBy = {})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation // tidak menampilkan error detail. tetapi return error message dari CheckBookId ini
public @interface CheckBookId {

    String message() default "invalid book id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
