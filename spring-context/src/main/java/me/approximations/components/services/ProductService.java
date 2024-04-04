package me.approximations.components.services;

import me.approximations.components.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    //    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct() {
        productRepository.addProduct();
    }
}
