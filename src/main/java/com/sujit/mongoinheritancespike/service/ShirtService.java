package com.sujit.mongoinheritancespike.service;

import com.sujit.mongoinheritancespike.entity.Product;
import com.sujit.mongoinheritancespike.repository.ShirtRepository;
import com.sujit.mongoinheritancespike.request.ShirtSize;
import org.springframework.stereotype.Service;

@Service
public class ShirtService {
    private final ShirtRepository shirtRepository;

    public ShirtService(ShirtRepository shirtRepository) {
        this.shirtRepository = shirtRepository;
    }

    public Product updateShirtSize(int productId, ShirtSize shirtSize) {
        return shirtRepository.findByProductId(productId).map(product -> {
            product.setSize(shirtSize.getSize());
            return shirtRepository.save(product);
        }).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
