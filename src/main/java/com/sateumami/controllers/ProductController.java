package com.sateumami.controllers;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sateumami.Products;
import com.sateumami.ProductsService;

@RestController
@RequestMapping("/api/v1/products")

public class ProductController {
	@Autowired
	private ProductsService productService;
	
	@GetMapping
	public ResponseEntity<List<Products>> getAllProducts(){
		return new ResponseEntity<List<Products>>(productService.allProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Products>> getSingleProduct(@PathVariable ObjectId id){
		return new ResponseEntity<Optional<Products>>(productService.singleProduct(id), HttpStatus.OK);
	}

}
