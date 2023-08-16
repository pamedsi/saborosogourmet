package patrickmelo.saborosogourmet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patrickmelo.saborosogourmet.entities.Dish;
import patrickmelo.saborosogourmet.repositories.DishRepository;

@Service
public class DishService {

    private final DishRepository dishRepository;
    @Autowired
    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public void saveDish (Dish dish) {
        dishRepository.save(dish);
    }
}
