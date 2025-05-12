package com.sujit.mongoinheritancespike.repository;

import com.sujit.mongoinheritancespike.entity.Shirt;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ShirtRepository extends MongoRepository<Shirt, Integer> {
    Optional<Shirt> findByProductId(Integer id);
}
