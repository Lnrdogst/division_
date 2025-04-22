package com.example.sem3.prblm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class calculatService {
    public Long resta(Long a, Long b) throws equalException{
        if (a==b){
            throw new equalException("'a' y 'b' no pueden ser iguales");
        }

        if (a<b){
            throw new ArithmeticException("'a' no puede ser menor a 'b'");
        }

        return a-b;
    }


public class equalExcepgtion extends RuntimeException{
        public equalException(String message){
            super(message);
        }
}

}
