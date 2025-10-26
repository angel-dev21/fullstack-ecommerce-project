package com.example.ecommerceweb.product.entity;

import java.util.List;
import com.example.ecommerceweb.productsku.entity.ProductSkuEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@NotNull
	private long id;
	@NotNull
	private String name;
	private String description;
	private String cover;
		
	@OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY)
	private List<ProductSkuEntity> productSkus;
	
	/*@Column(name = "created_at")
	private Date createdAt;*/
}
