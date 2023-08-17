package patrickmelo.saborosogourmet.validations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DishSizeValidator.class)
public @interface ValidDishSize {
    String message() default "Invalid dish size!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
