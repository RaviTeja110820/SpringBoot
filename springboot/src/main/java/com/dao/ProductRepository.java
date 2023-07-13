package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("from Product p where p.prodName = :prodName")
	Product findByName(@Param("prodName") String prodName);
}
