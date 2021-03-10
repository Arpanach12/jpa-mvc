package com.mindtree.codingChallenge2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop {

	public Shop() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int shopId;
private String shopName;
@OneToMany(cascade=CascadeType.ALL,mappedBy="productShop")
private List<Product> shopProducts;
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
public List<Product> getShopProducts() {
	return shopProducts;
}
public void setShopProducts(List<Product> shopProducts) {
	this.shopProducts = shopProducts;
} 

}
