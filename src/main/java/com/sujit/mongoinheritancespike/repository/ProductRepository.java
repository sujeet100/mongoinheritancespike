package com.sujit.mongoinheritancespike.repository;

import com.sujit.mongoinheritancespike.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
