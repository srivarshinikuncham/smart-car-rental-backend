package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;
    private int carId;
    private String status;


}
