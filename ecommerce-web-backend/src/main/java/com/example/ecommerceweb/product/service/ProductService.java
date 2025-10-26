package com.example.ecommerceweb.product.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ecommerceweb.product.entity.ProductEntity;
import com.example.ecommerceweb.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	//Agregar reponse entity
	
	public ProductEntity createProduct(ProductEntity product) {
		return productRepository.save(product);
	}
	
	public List<ProductEntity> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Optional<ProductEntity> getProductById(long id){
		return productRepository.findById(id);
	}
	
	public ProductEntity updateProductEntity(ProductEntity product, long id) {
		Optional<ProductEntity> productToUpdate = productRepository.findById(id);
		ProductEntity productUpdated = productToUpdate.get();
		productUpdated.setName(product.getName());
		productUpdated.setDescription(product.getDescription());
		productUpdated.setCover(product.getCover());
		return productUpdated;
	}
	
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}
	
}
