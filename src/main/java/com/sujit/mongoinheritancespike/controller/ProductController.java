package com.sujit.mongoinheritancespike.controller;

import com.sujit.mongoinheritancespike.entity.Product;
import com.sujit.mongoinheritancespike.request.ShirtSize;
import com.sujit.mongoinheritancespike.service.ProductService;
import com.sujit.mongoinheritancespike.service.ShirtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ShirtService shirtService;

    public ProductController(ProductService productService, ShirtService shirtService) {
        this.productService = productService;
        this.shirtService = shirtService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PostMapping(value = "/{productId}/size", params = "type")
    public Product updateShirtSize(@PathVariable int productId, @RequestParam String type, @RequestBody ShirtSize shirtSize) {
        if (type.equals("shirt")) {
            return shirtService.updateShirtSize(productId, shirtSize);
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }

    }

}
