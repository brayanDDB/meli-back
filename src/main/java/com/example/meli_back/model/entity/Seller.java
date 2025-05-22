package com.example.meli_back.model.entity;

import lombok.Builder;
import lombok.Data;

/**
 * entity for seller
 */
@Data
@Builder
public class Seller {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String webSiteUrl;

}
