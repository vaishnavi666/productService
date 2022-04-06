package com.target.product.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CurrentPrice {

	@NotNull(message = "value is mandatory")
	private double value;
	
	@NotBlank(message = "currencyCode is mandatory")
	private String currencyCode;
	
	
	public CurrentPrice(double value, String currencyCode) {
		
		this.value = value;
		this.currencyCode = currencyCode;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getCurrency_code() {
		return currencyCode;
	}
	public void setCurrency_code(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
	
	
}
