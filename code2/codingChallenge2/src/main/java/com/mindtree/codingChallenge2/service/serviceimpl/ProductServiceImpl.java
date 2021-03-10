package com.mindtree.codingChallenge2.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.codingChallenge2.entity.Brand;
import com.mindtree.codingChallenge2.entity.Product;
import com.mindtree.codingChallenge2.entity.Shop;
import com.mindtree.codingChallenge2.entityDto.BrandDto;
import com.mindtree.codingChallenge2.entityDto.ProductDto;
import com.mindtree.codingChallenge2.entityDto.ShopDto;
import com.mindtree.codingChallenge2.repository.BrandRepository;
import com.mindtree.codingChallenge2.repository.ProductRepository;
import com.mindtree.codingChallenge2.repository.ShopRepository;
import com.mindtree.codingChallenge2.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
ModelMapper modelMapper=new ModelMapper();
@Autowired
ProductRepository productRepository;
@Autowired
ShopRepository shopRepository;
@Autowired
BrandRepository brandRepository;
	public ProductServiceImpl() {
	}



	@Override
	public List<ProductDto> getAllProductByBrandWithPrice() {
		List<Product> products = productRepository.findAll();
		
	//List<ProductDto> modifyproducts = products.stream().filter(arg0).map(entity->convertEntityToDto(entity)).collect(Collectors.toList());
List<ProductDto> modifyProducts=new ArrayList<ProductDto>();
for(Product product:products)
{
if(product.getProductPrice()>100)
{
ProductDto dto=	convertEntityToDto(product);
modifyProducts.add(dto);
}
}
		return modifyProducts;
	}

	

	private BrandDto convertEntityToDto(Brand brand) {
		return modelMapper.map(brand, BrandDto.class);
	}

	private Brand convertDtoToEntity(BrandDto brandDto) {
		return modelMapper.map(brandDto, Brand.class);

	}
	private ShopDto convertEntityToDto(Shop shop) {
		return modelMapper.map(shop, ShopDto.class);
	}

	private Shop convertDtoToEntity(ShopDto shopDto) {
		return modelMapper.map(shopDto, Shop.class);

	}
	private ProductDto convertEntityToDto(Product product) {
		return modelMapper.map(product, ProductDto.class);
	}

	private Product convertDtoToEntity(ProductDto productDto) {
		return modelMapper.map(productDto, Product.class);

	}
	@Override
	public ShopDto addAProductByShop(ShopDto shopDto) {
		Shop shop=convertDtoToEntity(shopDto);
		for(Product product:shop.getShopProducts())
		{
			product.setProductShop(shop);
		}
		shopRepository.save(shop);
		
		ShopDto dto=convertEntityToDto(shop);
		
		return dto;
	}

	@Override
	public BrandDto addAProductByBrand(BrandDto brandDto) {
		Brand brand=convertDtoToEntity(brandDto);
		
		for(Product product:brand.getBrandProducts())
		{
			product.setProductBrand(brand);
		}
		brandRepository.save(brand);
		BrandDto dto=convertEntityToDto(brand);
		return dto;
	}

	@Override
	public ProductDto addAProduct(ProductDto productDto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
