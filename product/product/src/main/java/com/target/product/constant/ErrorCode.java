package com.target.product.constant;

public enum ErrorCode {
	   PRODUCT_NOT_FOUND("product_not_found"),
		INTERNAL_SERVER_ERROR("internal_server_error"),
		METHOD_ARGUEMENT_NOT_VALID("method_arguement_not_valid");

	   private final String code;

	   ErrorCode(String code) {
	       this.code = code;
	   }

	   public String getCode() {
	       return this.code;
	   }
}