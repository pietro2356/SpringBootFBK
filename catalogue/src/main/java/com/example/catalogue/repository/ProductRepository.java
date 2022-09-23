package com.example.catalogue.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.catalogue.domain.Product;


// @EnableMongoRepositories(basePackages = "com.example.catalogue.configuration")
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByCategory(String category);
	List<Product> findByTitle(String titolo);

}