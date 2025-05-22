package com.example.meli_back.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductListDTO {

    private Long id;
    private String name;
    private Double price;
    private String image;

}
