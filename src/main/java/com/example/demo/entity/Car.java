package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String company;
    private double price;
    private boolean available;
}


