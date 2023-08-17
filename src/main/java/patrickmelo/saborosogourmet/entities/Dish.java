package patrickmelo.saborosogourmet.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import patrickmelo.saborosogourmet.dtos.DishDTO;
import patrickmelo.saborosogourmet.models.DishSize;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.UUID;
@Table
@Entity
@NoArgsConstructor
@Getter
public class Dish {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (updatable = false)
    private Long id;
    @Column (updatable = false, unique = true, nullable = false)
    private String identifier;
    @Column
    private String title;
    @Column
    private DishSize dishSize;
    @Column
    private BigDecimal price;
    @Column
    private String pic;
    @Column
    private Boolean inStock;
    @Column
    private LocalDateTime createdAt;

    public Dish(DishDTO dishDTO) {
        this.identifier = UUID.randomUUID().toString();
        this.title = dishDTO.title();
        this.dishSize = DishSize.valueOf(dishDTO.dishSize());
        this.price = dishDTO.price().setScale(2 , RoundingMode.HALF_UP);
        this.pic = dishDTO.pic();
        if (dishDTO.inStock() == null) this.inStock = true;
        else this.inStock = dishDTO.inStock();
        this.createdAt = LocalDateTime.now();
    }
}
