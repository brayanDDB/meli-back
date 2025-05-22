package com.example.meli_back.service;

import com.example.meli_back.model.ProductListDTO;
import com.example.meli_back.model.entity.Product;
import com.example.meli_back.util.Database;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productServiceImpl;

    @Test
    public void getProducts() {
        List<ProductListDTO> listResult = productServiceImpl.getProducts();

        assertEquals(6, listResult.size());
    }

    @Test
    public void getProductDetail() {
        Product product = Database.products.stream().filter(p -> p.getId() == 1L).findFirst().get();

        Product resultResponseBody = productServiceImpl.getProductDetail(1L);

        assertEquals(product.getId(), resultResponseBody.getId());
        assertEquals(product.getName(), resultResponseBody.getName());
        assertEquals(product.getBlocked(), resultResponseBody.getBlocked());
        assertEquals(product.getImage(), resultResponseBody.getImage());
        assertEquals(product.getPrice(), resultResponseBody.getPrice());
        assertEquals(product.getAvailability(), resultResponseBody.getAvailability());
    }

}
