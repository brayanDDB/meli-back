package com.example.meli_back.model;

import lombok.Builder;
import lombok.Data;

/**
 * class created to return the information needed in the list of products endpoint
 */
@Builder
@Data
public class ProductListDTO {

    private Long id;
    private String name;
    private Double price;
    private String image;

}
