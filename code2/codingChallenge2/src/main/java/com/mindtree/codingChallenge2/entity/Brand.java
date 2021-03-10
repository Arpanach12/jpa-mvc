package com.mindtree.codingChallenge2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {

	public Brand() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int brandId;
private String brandName;
@OneToMany(cascade=CascadeType.ALL,mappedBy="productBrand")
private List<Product> brandProducts;
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
public List<Product> getBrandProducts() {
	return brandProducts;
}
public void setBrandProducts(List<Product> brandProducts) {
	this.brandProducts = brandProducts;
}

}
