package com.example.sem3.prblm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")

public class calculatController {
    @Autowired
    private calculatService service;
    @GetMapping ("/resta/{a}/{b}")
    public ResponseEntity<?> calculate(@PathVariable Long a, @PathVariable Long b) {
        try {
            Long result=service.resta(a,b);
            return ResponseEntity.ok(result);

        }catch (calculatService.equalException e){
            return ResponseEntity.badRequest().body("Error: "+e.getMessage());

        }catch (ArithmeticException e){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).
                    body("Error aritmetico: "+ e.getMessage());


        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error: "+ e.getMessage());
        }

    }



}


