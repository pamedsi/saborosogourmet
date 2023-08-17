package patrickmelo.saborosogourmet.dtos;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.BooleanFlag;
import org.springframework.format.annotation.NumberFormat;
import patrickmelo.saborosogourmet.validations.ValidDishSize;

import java.math.BigDecimal;

public record DishDTO (
        @NotBlank
        String title,
        @ValidDishSize
        String dishSize,
        @NumberFormat
        BigDecimal price,
        @NotBlank
        String pic,
        @BooleanFlag
        Boolean inStock
)
{}
