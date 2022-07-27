package com.example.validationform.validator;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = PhoneValid.class)
@Documented
public @interface PhoneAnno {
    String message() default "{PhoneValid.isValid}";
    Class<?>[] groups() default{ };
    Class<? extends Payload>[] payload() default {};
}
