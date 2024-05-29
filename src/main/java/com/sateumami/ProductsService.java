package com.sateumami;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> allProducts(){
		return productRepository.findAll();
	}
}
