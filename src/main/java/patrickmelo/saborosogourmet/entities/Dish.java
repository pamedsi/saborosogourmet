package patrickmelo.saborosogourmet.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import patrickmelo.saborosogourmet.models.DishSize;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.UUID;
@Table
@Entity
@NoArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Dish(String title, DishSize dishSize, BigDecimal price, String pic, Boolean inStock) {
        this.identifier = UUID.randomUUID().toString();
        this.title = title;
        this.dishSize = dishSize;
        this.price = price.setScale(2 , RoundingMode.HALF_UP);
        this.pic = pic;
        this.inStock = inStock;
        this.createdAt = LocalDateTime.now();
    }
}
