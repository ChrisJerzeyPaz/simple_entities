package com.paz.simple_entities.services;

import com.paz.simple_entities.model.Product;
import org.springframework.stereotype.Service;
import com.paz.simple_entities.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
