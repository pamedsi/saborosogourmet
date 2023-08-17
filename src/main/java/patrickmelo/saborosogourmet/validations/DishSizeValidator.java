package patrickmelo.saborosogourmet.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DishSizeValidator implements ConstraintValidator<ValidDishSize, String> {
    @Override
    public boolean isValid(String dishSize, ConstraintValidatorContext context) {
        return dishSize.equalsIgnoreCase("G") || dishSize.equalsIgnoreCase("P");
    }
}

