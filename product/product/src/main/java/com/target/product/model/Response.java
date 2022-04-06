package com.target.product.model;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public class Response {
	
	ResponseEntity<Object> responseEntity;

	Map<String, String> map;

	
	
	public Response(ResponseEntity<Object> responseEntity, Map<String, String> map) {
		this.responseEntity = responseEntity;
		this.map = map;
	}

	public Response() {
		// TODO Auto-generated constructor stub
	}

	public ResponseEntity<Object> getResponseEntity() {
		return responseEntity;
	}

	public void setResponseEntity(ResponseEntity<Object> responseEntity) {
		this.responseEntity = responseEntity;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	

}
