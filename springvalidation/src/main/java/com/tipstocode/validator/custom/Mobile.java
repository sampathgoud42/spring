package com.tipstocode.validator.custom;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = MobileNumberValidator.class)
@Documented
public @interface Mobile {

  String message() default "Invalid Mobile Number. It should be 10 digit";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}