package com.mindtree.codingChallenge2.entityDto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ShopDto {

	public ShopDto() {
	}
	private int shopId;
	private String shopName;
	@JsonIgnoreProperties("productShop")
	private List<ProductDto> shopProducts;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<ProductDto> getShopProducts() {
		return shopProducts;
	}
	public void setShopProducts(List<ProductDto> shopProducts) {
		this.shopProducts = shopProducts;
	}
	
}
