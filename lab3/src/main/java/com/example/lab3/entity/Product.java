package com.example.lab3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private int id;

    private String name;
    private int price ;
    private int rating;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Review>reviews;
}
