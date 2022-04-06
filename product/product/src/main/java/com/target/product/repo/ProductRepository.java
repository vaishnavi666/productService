package com.target.product.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.target.product.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{

}
