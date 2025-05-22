package com.example.meli_back.service;

import com.example.meli_back.exception.ResourceNotFoundException;
import com.example.meli_back.model.entity.Product;
import com.example.meli_back.model.ProductListDTO;
import com.example.meli_back.util.Database;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductListDTO> getProducts() {
        return Database.products
                .stream()
                .map(p -> ProductListDTO
                        .builder()
                        .id(p.getId())
                        .name(p.getName())
                        .price(p.getPrice())
                        .image(p.getImage())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public Product getProductDetail(Long id) {
        return Database.products
                .stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

}
