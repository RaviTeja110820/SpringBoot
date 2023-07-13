package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;

@Service
public class ProductDAO {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(int prodID) {
		return productRepository.findById(prodID).orElse(new Product(0,"product not found",0.0)); 
	}
	
	public Product getProductByName(String prodName) {
		return productRepository.findByName(prodName);
	}
	
	public Product registerProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	public void deleteProduct(int prodId) {
		productRepository.deleteById(prodId);
	}
}
