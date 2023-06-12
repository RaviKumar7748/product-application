package com.app.service;

import java.util.List;

import com.app.entity.Product;

public interface ProductService {
	
	String addProduct(Product p);

	List<Product> viewAllProduct();
	
	String deleteOneProduct(Long id);
	
	String updateProduct(Product p);
	
	
	
}
