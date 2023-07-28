package patrickmelo.saborosogourmet.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import patrickmelo.saborosogourmet.dtos.Message;

@RestController
public class Hello {
    @GetMapping(value = "/hello")
    public ResponseEntity<?> hello () {
        return ResponseEntity.ok(new Message("Bem vindo ao Saboroso Gourmet!"));
    }
}
