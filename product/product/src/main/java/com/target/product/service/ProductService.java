package com.target.product.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.product.exception.ProductNotFoundException;
import com.target.product.feign.ProductNameServiceClient;
import com.target.product.model.CurrentPrice;
import com.target.product.model.Product;
import com.target.product.repo.ProductRepository;

@Service
public class ProductService {

	final static Logger logger = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductNameServiceClient productNameServiceClient;
	
	
	public Product getProduct(String id) throws Exception {
		
		logger.info("Fetching Products...");
		
		String name = productNameServiceClient.findProductNamebyId(id);
		
		if(name.equals("fallBack")) {
			throw new Exception("Unable to retrieve Product from redsky");
		}
		
		
		Product prod =  productRepository.findById(Integer.parseInt(id))
				.orElseThrow(() -> new ProductNotFoundException("Product not found with id : " +id));

		prod.setName(name);
		
		return prod;

	}
	
	public Product updateProductPrice(CurrentPrice currentPrice , String id) {
		
		logger.info("updating Product's CurrentPrice ...");
		
		Product existingProduct = productRepository.findById(Integer.parseInt(id))
			.orElseThrow(() -> new ProductNotFoundException("Product not found with id : " +id));
		
		existingProduct.setCurrentPrice(currentPrice);
		 return productRepository.save(existingProduct);
		
	}
	
	
}
