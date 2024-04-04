package me.approximations.components.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void addProduct() {
        System.out.println("Product added");
    }
}
