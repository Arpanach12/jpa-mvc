package com.mindtree.codingChallenge2.entityDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.codingChallenge2.entity.Brand;
import com.mindtree.codingChallenge2.entity.Shop;

public class ProductDto {

	public ProductDto() {
		// TODO Auto-generated constructor stub
	}
	private int productId;
	private String productName;
	@JsonIgnoreProperties("shopProducts")
	private ShopDto productShop;
	@JsonIgnoreProperties("brandProducts")
	private BrandDto productBrand;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ShopDto getProductShop() {
		return productShop;
	}
	public void setProductShop(ShopDto productShop) {
		this.productShop = productShop;
	}
	public BrandDto getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(BrandDto productBrand) {
		this.productBrand = productBrand;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
