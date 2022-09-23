package com.example.catalogue.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.domain.Product;
import com.example.catalogue.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable String id) {
		return service.getProduct(id);
	}

	@GetMapping("/products/category/{category}")
	public List<Product> getProductsByCategory(@PathVariable String category) {
		return service.findByCategory(category);
	} 
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return service.createProduct(product);
	}
	@PutMapping("/products/{id}/availability/{diff}")
	public Product changeAvailability(@PathVariable String id, @PathVariable Integer diff) {
		return service.updateAvailability(id, diff);
	}
	
}
