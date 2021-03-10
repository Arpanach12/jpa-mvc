package com.mindtree.codingChallenge2.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.codingChallenge2.exception.ServiceException;

@RestControllerAdvice(assignableTypes= {ProductController.class})
public class GlobalExceptionalHandler {

	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<Map<String , Object>> serviceExceptionalHandler(Exception e, Throwable cause)
	{
		Map<String,Object> response=new LinkedHashMap<String,Object>();
		response.put("HEADER: ", "ERROR MESSAGE");
		response.put("ERROR: ", true);
		response.put("BODY: ",e.getMessage());
		response.put("HTTP STATUS: ", HttpStatus.BAD_REQUEST);
		
		
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST);
		
	}
	

}
