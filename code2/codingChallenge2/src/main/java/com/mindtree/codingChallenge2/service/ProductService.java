package com.mindtree.codingChallenge2.service;

import java.util.List;

import com.mindtree.codingChallenge2.entity.Product;
import com.mindtree.codingChallenge2.entityDto.BrandDto;
import com.mindtree.codingChallenge2.entityDto.ProductDto;
import com.mindtree.codingChallenge2.entityDto.ShopDto;

public interface ProductService {

	ProductDto addAProduct(ProductDto productDto);

	List<ProductDto> getAllProductByBrandWithPrice();

	ShopDto addAProductByShop(ShopDto shopDto);

	BrandDto addAProductByBrand(BrandDto brandDto);

}
