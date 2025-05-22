package com.example.meli_back.service;

import com.example.meli_back.model.entity.Product;
import com.example.meli_back.model.ProductListDTO;

import java.util.List;

public interface ProductService {

    List<ProductListDTO> getProducts();
    Product getProductDetail(Long id);

}