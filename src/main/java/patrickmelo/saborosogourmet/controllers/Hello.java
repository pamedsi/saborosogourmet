package patrickmelo.saborosogourmet.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patrickmelo.saborosogourmet.dtos.Message;
@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class Hello {
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
}
