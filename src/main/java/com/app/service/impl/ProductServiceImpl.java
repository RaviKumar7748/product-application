package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Product;
import com.app.repo.ProductRepository;
import com.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public String addProduct(Product p) {
		Product save = repo.save(p);
		return "Product "+save.getProductId()+"Saved SucessFully";
	}

	@Override
	public List<Product> viewAllProduct() {
		return repo.findAll();
	}

	@Override
	public String deleteOneProduct(Long id) {
		Optional<Product> findById = repo.findById(id);
		if (findById.isPresent()) {
			repo.deleteById(id);
			return id+ " Deleted Sucessfully";
		}
		return "Id Not Found";
	}

	@Override
	public String updateProduct(Product p) {
		Product save = repo.save(p);
		return "Product "+save.getProductId()+"Updated Sucessfully";
	}

	

}
