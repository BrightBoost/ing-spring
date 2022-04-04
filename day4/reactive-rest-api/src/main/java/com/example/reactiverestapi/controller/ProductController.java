package com.example.reactiverestapi.controller;

import com.example.reactiverestapi.model.Product;
import com.example.reactiverestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("products")
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("{id}")
    public Mono<Product> getProduct(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @PostMapping
    public Mono<Product> postProduct(@RequestBody Product product)  {
        return productRepository.save(product);
    }


}
