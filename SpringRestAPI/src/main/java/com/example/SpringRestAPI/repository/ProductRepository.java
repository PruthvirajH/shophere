package com.example.SpringRestAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringRestAPI.document.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
