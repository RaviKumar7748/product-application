package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Product;
import com.app.service.ProductService;

@RestController
@CrossOrigin
public class ProductRestController {
	
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	ResponseEntity<String> insertProduct(@RequestBody  Product product){
		String msg = service.addProduct(product);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	ResponseEntity<List<Product>> getAllProduct(){
		List<Product> viewAllProduct = service.viewAllProduct();
		return new ResponseEntity<>(viewAllProduct, HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/product/{id}")
	ResponseEntity<String> deleteOneProduct(@PathVariable Long id){
		String deleteOneProduct = service.deleteOneProduct(id);
		return new ResponseEntity<>(deleteOneProduct, HttpStatus.ACCEPTED);
		 
	}
	@PutMapping("/product") 
	ResponseEntity<String> updateProduct(@RequestBody  Product product){
		String msg = service.updateProduct(product);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	
	
	
	

}
