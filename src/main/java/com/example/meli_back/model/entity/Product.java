package com.example.meli_back.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Long id;
    private String name;
    private String ramMemory;
    private String internalMemory;
    private Boolean blocked;
    private Double price;
    private String image;
    private Integer calification;
    private Integer availability;
    private Seller seller;

}
