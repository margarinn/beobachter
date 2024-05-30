package com.sateumami.sate;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SateService {
	@Autowired
	private SateRepository productRepository;
	
	public List<Sate> allProducts(){
		return productRepository.findAll();
	}
	
	public Optional<Sate> singleProduct(ObjectId id){
		return productRepository.findById(id);
	}
}