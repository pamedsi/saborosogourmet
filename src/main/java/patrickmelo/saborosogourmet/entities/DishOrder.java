package patrickmelo.saborosogourmet.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
public class DishOrder {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (updatable = false)
    private Long id;

}
