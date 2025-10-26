package com.example.ecommerceweb.productsku.mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.ecommerceweb.product.dto.ProductCatalogDto;
import com.example.ecommerceweb.product.entity.ProductEntity;
import com.example.ecommerceweb.productattribute.dto.ProductAttributeDto;
import com.example.ecommerceweb.productattribute.entity.ProductAttribute;
import com.example.ecommerceweb.productsku.dto.ProductSkuCatalogDto;
import com.example.ecommerceweb.productsku.entity.ProductSkuEntity;

public class ProductSkuMapper {
	
	public static ProductCatalogDto productEntityToCatalogDto(ProductEntity productEntity) {
		ProductCatalogDto productCatalogDto = new ProductCatalogDto();
		productCatalogDto.setName(productEntity.getName());
		productCatalogDto.setCover(productEntity.getCover());
		return productCatalogDto;
	}
	
	public static List<ProductAttributeDto> productAttributeToDto(ProductSkuEntity productSkuEntity) {
		List<ProductAttribute> productAttribute = productSkuEntity.getProductAttribute();
		List<ProductAttributeDto> productAttributeDto = new ArrayList<ProductAttributeDto>();
		productAttributeDto.stream().map(productAttribute -> productAttribute.setType(productSkuEntity.getProductAttribute())).collect(Collectors.toList()));
		
		/*setType(productSkuEntity.getProductAttribute());
		productAttributeDto.setValue(productSkuEntity.getProductAttribute());*/
		return productAttributeDto;
	}
	
	public static ProductSkuCatalogDto productSkuEntityToCatalogDto(ProductSkuEntity productSkuEntity) {
		ProductSkuCatalogDto productSkuCatalogDto = new ProductSkuCatalogDto();
		productSkuCatalogDto.setPrice(productSkuEntity.getPrice());
		productSkuCatalogDto.setProductAttributes(productAttributeToDto(productSkuEntity.getProductAttribute()));
		productSkuCatalogDto.setProductCatalogDto(productEntityToCatalogDto(productSkuEntity.getProductEntity()));
		return productSkuCatalogDto;
	}
		
}
