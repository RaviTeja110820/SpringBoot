package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDAO;
import com.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@GetMapping ("/showproduct")
	public List<Product> showProduct(){
		return productDAO.getProducts();
	}
	
	@GetMapping ("/showProdById/{prodId}")
	public Product showProdById(@PathVariable("prodId") int prodId) {
		return productDAO.getProductById(prodId);
	}
	
	@GetMapping ("/showProdByName/{prodName}")
	public Product showProdByName(@PathVariable("prodName") String prodName) {
		return productDAO.getProductByName(prodName);
	}

	@PostMapping ("registerProd")
	public Product registerProd(@RequestBody Product product) {
		return productDAO.registerProduct(product);
	}
	
	@PutMapping ("updateProd")
	public Product updateProd(@RequestBody Product product) {
		return productDAO.updateProduct(product);
	}
	
	@DeleteMapping ("deleteProd/{prodId}")
	public String deleteProd(@PathVariable("prodId") int prodId) {
		productDAO.deleteProduct(prodId);
		return "Product with ProductId: " + prodId + " Deleted Successfully!!!";
	}
//	@RequestMapping("/showproduct")
//	public Product showProduct() {
//		
//		Product product = new Product();
//		
//		product.setProdId(1108);
//		product.setPrice(67.12);
//		product.setProdName("Soap");
//		
//		return product;
//	}
}
