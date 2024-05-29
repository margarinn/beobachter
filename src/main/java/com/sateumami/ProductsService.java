package com.sateumami;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> allProducts(){
		return productRepository.findAll();
	}
	
	public Optional<Products> singleProduct(ObjectId id){
		return productRepository.findById(id);
	}
}