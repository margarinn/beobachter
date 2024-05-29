package com.sateumami.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
