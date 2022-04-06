package com.target.product.handler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.target.product.constant.ErrorCode;
import com.target.product.exception.ProductNotFoundException;
import com.target.product.model.ErrorResponse;

@ControllerAdvice
public class ProductExceptionHandler {

	final static Logger logger = LoggerFactory.getLogger(ProductExceptionHandler.class);
			
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundHandling(ProductNotFoundException exception, WebRequest request){
		
		logger.error(exception.getMessage());
		ErrorResponse response = 
				new ErrorResponse(new Date(), exception.getMessage(), ErrorCode.PRODUCT_NOT_FOUND, request.getDescription(false));
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> methodArgumentNotValidExceptionHandling(MethodArgumentNotValidException exception, WebRequest request){
		
		StringBuilder errorMessage = new StringBuilder("");
	    
	    exception.getBindingResult().getAllErrors().forEach((error) -> {
	        
	    	errorMessage.append(error.getDefaultMessage()+",");
	    	    });
	    
	    logger.error(errorMessage.toString());
        
	    		ErrorResponse response = 
				new ErrorResponse(new Date(), errorMessage.toString(), ErrorCode.METHOD_ARGUEMENT_NOT_VALID, request.getDescription(false));
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> serviceExceptionHandling(Exception exception, WebRequest request){
		
		logger.error(exception.getMessage());
		ErrorResponse response = 
				new ErrorResponse(new Date(), exception.getMessage(), ErrorCode.INTERNAL_SERVER_ERROR, request.getDescription(false));
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
