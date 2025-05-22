package com.example.meli_back.util;

import com.example.meli_back.model.entity.Product;
import com.example.meli_back.model.entity.Seller;

import java.util.List;

/**
 * class that contains the static data for the application
 */
public class Database {

    public static List<Product> products;
    public static List<Seller> sellers;

    static {
        sellers = List.of(
                Seller.builder()
                        .id(1L)
                        .name("Samsung store")
                        .email("samsung@gmail.com")
                        .phone("+87 871566456")
                        .webSiteUrl("www.samsung.com")
                        .build(),
                Seller.builder()
                        .id(2L)
                        .name("Iphone store")
                        .email("iphone@gmail.com")
                        .phone("+56 8466454546")
                        .webSiteUrl("www.iphone.com")
                        .build(),
                Seller.builder()
                        .id(3L)
                        .name("Huawei store")
                        .email("huawei@gmail.com")
                        .phone("+12 3243232434")
                        .webSiteUrl("www.huawei.com")
                        .build()
        );
        products = List.of(
                Product.builder()
                        .id(1L)
                        .name("Samsung galaxy A55")
                        .ramMemory("6 GB")
                        .internalMemory("256 GB")
                        .blocked(false)
                        .price(439.0)
                        .image("samsung-galaxy-a55")
                        .calification(4)
                        .availability(10)
                        .seller(sellers.get(0))
                        .build(),
                Product.builder()
                        .id(2L)
                        .name("Samsung galaxy S24")
                        .ramMemory("8 GB")
                        .internalMemory("128 GB")
                        .blocked(true)
                        .price(354.0)
                        .image("samsung-galaxy-s24")
                        .calification(2)
                        .availability(1)
                        .seller(sellers.get(0))
                        .build(),
                Product.builder()
                        .id(3L)
                        .name("Iphone 15 Pro Max")
                        .ramMemory("6 GB")
                        .internalMemory("256 GB")
                        .blocked(false)
                        .price(500.0)
                        .image("iphone-15-pro-max")
                        .calification(5)
                        .availability(100)
                        .seller(sellers.get(1))
                        .build(),
                Product.builder()
                        .id(4L)
                        .name("Iphone 11 Pro")
                        .ramMemory("4 GB")
                        .internalMemory("128 GB")
                        .blocked(false)
                        .price(310.0)
                        .image("iphone-11-pro")
                        .calification(3)
                        .availability(17)
                        .seller(sellers.get(1))
                        .build(),
                Product.builder()
                        .id(5L)
                        .name("Iphone 13")
                        .ramMemory("6 GB")
                        .internalMemory("256 GB")
                        .blocked(true)
                        .price(400.0)
                        .image("iphone-13")
                        .calification(2)
                        .availability(200)
                        .seller(sellers.get(1))
                        .build(),
                Product.builder()
                        .id(6L)
                        .name("HUAWEI Pura 70")
                        .ramMemory("5 GB")
                        .internalMemory("128 GB")
                        .blocked(false)
                        .price(330.0)
                        .image("huawei-pura-70")
                        .calification(3)
                        .availability(101)
                        .seller(sellers.get(2))
                        .build()
        );
    }

}
