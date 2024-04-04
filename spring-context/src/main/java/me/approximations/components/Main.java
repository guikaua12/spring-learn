package me.approximations.components;

import me.approximations.components.config.ProjectConfig;
import me.approximations.components.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            final ProductService productService = context.getBean(ProductService.class);
            productService.addProduct();
        }
    }
}