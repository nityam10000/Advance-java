package com.project2.projectApp.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

	@ExceptionHandler(ArithmeticException.class)
	public Map<String, String> handleArithmeticException(ArithmeticException ex){
		Map<String, String> errorMap = new HashMap<String, String>();
		
		errorMap.put("ERROR", ex.getMessage());
		
		return errorMap;
	}
	
	@ExceptionHandler(CompanyIdNotFoundException.class)
	public ResponseEntity<Map<String, String>> CompanyNotFound(CompanyIdNotFoundException cs){
		Map<String, String> errorMap = new HashMap<String, String>();
		
		errorMap.put("ERROR", cs.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMap);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> CompanyNotFound(MethodArgumentNotValidException ma){
		Map<String, String> errorMap = new HashMap<String, String>();
		
		ma.getBindingResult().getFieldErrors().forEach( error -> errorMap.put(error.getField(),error.getDefaultMessage()));
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMap);
	}
	
	
	//it will handle all other exception other than above
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, String>> handleAllExcp(Exception ex){
		Map<String, String> errorMap = new HashMap<String, String>();
		errorMap.put("ERROR", ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMap);
		
	}
	
	
}
