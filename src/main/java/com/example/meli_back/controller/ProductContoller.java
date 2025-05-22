package com.example.meli_back.controller;

import com.example.meli_back.model.entity.Product;
import com.example.meli_back.model.ProductListDTO;
import com.example.meli_back.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class that contains the endpoints
 */
@RestController
@RequestMapping("/product")
public class ProductContoller {

    @Autowired
    private ProductService productService;

    /**
     * endpoint that calls the service to return the products
     * @return List of products
     */
    @GetMapping
    public ResponseEntity<List<ProductListDTO>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    /**
     * endpoint that calls the service to return a specific product
     * @param id id of the product
     * @return the details of the product
     */
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductDetail(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductDetail(id));
    }



}
