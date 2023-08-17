package patrickmelo.saborosogourmet.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patrickmelo.saborosogourmet.dtos.DishDTO;
import patrickmelo.saborosogourmet.dtos.Message;
import patrickmelo.saborosogourmet.entities.Dish;
import patrickmelo.saborosogourmet.services.DishService;

@RestController
@CrossOrigin(origins = {
    "http://localhost:4200",
    "https://saborosofront.vercel.app/"
})

public class DishController {
    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }
    @GetMapping(value = "/get-dishes")
    public ResponseEntity <?> seeDishes() {
        return null;
    }
    @PostMapping(value = "/insert-dish")
    public ResponseEntity <?> insertDish(@RequestBody DishDTO dish) {
        Dish newDish = new Dish(dish);
        System.out.println(newDish);
        return ResponseEntity.ok(newDish);
    }
    @PutMapping(value = "/edit-dish")
    public ResponseEntity <?> editDish() {
        return null;
    }
    @DeleteMapping(value = "/remove-dish")
    public ResponseEntity <?> removeDish() {
        return null;
    }
}
