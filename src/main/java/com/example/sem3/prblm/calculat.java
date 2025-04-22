package com.example.sem3.prblm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class calculat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
