package com.target.product.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.target.product.model.Product;
import com.target.product.service.ProductService;

@RestController
@Validated
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable @NotBlank String id) throws Exception {
		
		System.out.println("Inside getProduct : ");
		return productService.getProduct(id.toString());
		
		
	}
	
	@PutMapping("/{id}")
	public Product putProduct(@PathVariable String id,
							@Valid @RequestBody Product product) {

		System.out.println("inside putProduct");
		return productService.updateProductPrice(product.getCurrentPrice(), id);
		
		
	}
	

	
}
