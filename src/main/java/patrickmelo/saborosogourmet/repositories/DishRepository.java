package patrickmelo.saborosogourmet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import patrickmelo.saborosogourmet.entities.Dish;

public interface DishRepository extends JpaRepository <Dish, Long> {
}
