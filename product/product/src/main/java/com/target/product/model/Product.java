package com.target.product.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Document(collection="Product")
public class Product {

	@Id
	@NotNull(message = "Id is mandatory")
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@NotNull(message = "currentPrice is mandatory")
	@JsonProperty("current_price")
	private CurrentPrice currentPrice;

	
	
	
	
	public Product(@NotNull(message = "Id is mandatory") Long id, @NotBlank(message = "Name is mandatory") String name,
			@NotNull(message = "currentPrice is mandatory") CurrentPrice currentPrice) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	

	
	
}
