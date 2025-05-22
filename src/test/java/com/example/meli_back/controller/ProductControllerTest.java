package com.example.meli_back.controller;

import com.example.meli_back.model.ProductListDTO;
import com.example.meli_back.model.entity.Product;
import com.example.meli_back.util.Database;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import javax.xml.crypto.Data;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getProducts() throws Exception {
        TypeFactory typeFactory = objectMapper.getTypeFactory();

        MvcResult result = mockMvc.perform(get("/product")).andExpect(status().isOk()).andReturn();

        String responseBody = result.getResponse().getContentAsString();
        List<ProductListDTO> listResult = objectMapper.readValue(responseBody, typeFactory.constructCollectionType(List.class, ProductListDTO.class));

        assertEquals(6, listResult.size());
    }

    @Test
    public void getProduct() throws Exception {
        Product product = Database.products.stream().filter(p -> p.getId() == 1L).findFirst().get();

        MvcResult result = mockMvc.perform(get("/product/1")).andExpect(status().isOk()).andReturn();

        String responseBody = result.getResponse().getContentAsString();
        Product resultResponseBody = objectMapper.readValue(responseBody, Product.class);

        assertEquals(product.getId(), resultResponseBody.getId());
        assertEquals(product.getName(), resultResponseBody.getName());
        assertEquals(product.getBlocked(), resultResponseBody.getBlocked());
        assertEquals(product.getImage(), resultResponseBody.getImage());
        assertEquals(product.getPrice(), resultResponseBody.getPrice());
        assertEquals(product.getAvailability(), resultResponseBody.getAvailability());
    }

}