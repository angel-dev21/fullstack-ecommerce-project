package com.example.ecommerceweb.productsku.dto;

import java.util.Set;
import com.example.ecommerceweb.product.dto.ProductCatalogDto;
import com.example.ecommerceweb.productattribute.entity.ProductAttribute;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductSkuCatalogDto {

	private double price;
	Set<ProductAttribute> productAttributes;
	ProductCatalogDto productCatalogDto;
	
}
