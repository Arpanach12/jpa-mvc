package com.mindtree.codingChallenge2.entityDto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.codingChallenge2.entity.Product;

public class BrandDto {

	public BrandDto() {
		// TODO Auto-generated constructor stub
	}
	private int brandId;
	private String brandName;
	@JsonIgnoreProperties("productBrand")
	private List<ProductDto> brandProducts;
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<ProductDto> getBrandProducts() {
		return brandProducts;
	}
	public void setBrandProducts(List<ProductDto> brandProducts) {
		this.brandProducts = brandProducts;
	}
	
	
}
