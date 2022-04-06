package com.target.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productName-service" , url = "${productName.service.url}")
public interface ProductNameServiceClient {

	
	@GetMapping("/{id}")
	public String findProductNamebyId(@PathVariable String id);
}
