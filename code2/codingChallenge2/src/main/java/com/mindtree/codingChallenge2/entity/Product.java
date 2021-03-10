package com.mindtree.codingChallenge2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int productId;
private String productName;
@ManyToOne(cascade=CascadeType.PERSIST)
private Shop productShop;
@ManyToOne(cascade=CascadeType.PERSIST)
private Brand productBrand;
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
public Shop getProductShop() {
	return productShop;
}
public void setProductShop(Shop productShop) {
	this.productShop = productShop;
}
public Brand getProductBrand() {
	return productBrand;
}
public void setProductBrand(Brand productBrand) {
	this.productBrand = productBrand;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

}
