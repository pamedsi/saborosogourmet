package patrickmelo.saborosogourmet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patrickmelo.saborosogourmet.dtos.Message;
import patrickmelo.saborosogourmet.entities.Dish;
import patrickmelo.saborosogourmet.models.DishSize;
import patrickmelo.saborosogourmet.services.DishService;

import java.math.BigDecimal;

@RestController
@CrossOrigin(origins = {
    "http://localhost:4200",
    "https://saborosofront.vercel.app/"
})

public class Hello {
    private final DishService dishService;

    public Hello(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<?> hello () {
        return ResponseEntity.ok(new Message("Bem vindo ao Saboroso Gourmet!"));
    }

    @GetMapping(value = "/salve")
    public ResponseEntity<?> salve () {
        return ResponseEntity.ok(new Message("salve"));
    }
    @PostMapping(value = "/seeorder")
    public ResponseEntity <?> seeOrder(@RequestBody Object order) {
        return ResponseEntity.ok(new Message("Post deu certo! Olha: " + order.toString()));
    }

    @PostMapping(value = "/dish")
    public ResponseEntity <?> saveDish(@RequestBody Object order) {
        Dish dish = new Dish("peixe", DishSize.G, new BigDecimal(10), "photenha", true);
        dishService.saveDish(dish);
        return ResponseEntity.ok(new Message("Post deu certo! Olha: " + order.toString()));
    }
}
