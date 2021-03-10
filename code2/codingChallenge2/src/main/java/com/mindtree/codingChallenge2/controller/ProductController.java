package com.mindtree.codingChallenge2.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.codingChallenge2.entityDto.BrandDto;
import com.mindtree.codingChallenge2.entityDto.ProductDto;
import com.mindtree.codingChallenge2.entityDto.ShopDto;
import com.mindtree.codingChallenge2.exception.ServiceException;
import com.mindtree.codingChallenge2.service.ProductService;
@RestController
public class ProductController {

	public ProductController() {
		
		
	}
	@Autowired 
	ProductService productService;
	@PostMapping("insert/productbyshop")
	public ResponseEntity<ShopDto> registerProduct(@RequestBody ShopDto shopDto) 
	{
		return ResponseEntity.status(HttpStatus.OK).body(productService.addAProductByShop(shopDto));

	}
	@PostMapping("insert/productbybrand")
	public ResponseEntity<BrandDto> registerProduct(@RequestBody BrandDto brandDto) 
	{
		return ResponseEntity.status(HttpStatus.OK).body(productService.addAProductByBrand(brandDto));

	}
	@GetMapping("getAllDoctorSalarybasedSorted")
	public ResponseEntity<Map<String , Object>> getProducts() throws ServiceException
	{
		Map<String ,Object> response=new LinkedHashMap<String, Object>();
		response.put("Header", "Get all doctor sorted based on salary");
		response.put("Error", false);
		response.put("Body",productService.getAllProductByBrandWithPrice());
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}

}
