package patrickmelo.saborosogourmet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patrickmelo.saborosogourmet.dtos.DishDTO;
import patrickmelo.saborosogourmet.dtos.DishToFrontDTO;
import patrickmelo.saborosogourmet.entities.Dish;
import patrickmelo.saborosogourmet.repositories.DishRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishService {

    private final DishRepository dishRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public DishService(DishRepository dishRepository, ModelMapper modelMapper) {

        this.dishRepository = dishRepository;
        this.modelMapper = modelMapper;
    }
    public void saveDish (DishDTO dish) {
        Dish newDish = new Dish(dish);
        dishRepository.save(newDish);
    }
    public List<DishToFrontDTO> getAllDishes () {
        List<Dish> dishList = dishRepository.findAll();
        return dishList.stream()
                .map(DishToFrontDTO::new)
                .collect(Collectors.toList());
    }

}
