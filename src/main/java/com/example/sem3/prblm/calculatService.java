package com.example.sem3.prblm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class calculatService {
    public Long division(Long a, Long b) throws ArithmeticException {


        if (b==0){
            throw new ArithmeticException("No se puede realizar la division entre 0 ");
        }

        return a/b;
    }



}
