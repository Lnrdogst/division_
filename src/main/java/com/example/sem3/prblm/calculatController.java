package com.example.sem3.prblm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculatController {

    @Autowired
    private calculatService service;

    @GetMapping("/division/{a}/{b}")
    public ResponseEntity<?> calculate(@PathVariable Long a, @PathVariable Long b) {
        try {
            // Llamamos al servicio para realizar la división
            Long result = service.division(a, b);
            return ResponseEntity.ok(result);  // Devolvemos el resultado con código HTTP 200
        } catch (ArithmeticException e) {
            // Si ocurre una excepción de división por cero
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());  // Devolvemos un mensaje de error con código HTTP 400
        }
    }
}


