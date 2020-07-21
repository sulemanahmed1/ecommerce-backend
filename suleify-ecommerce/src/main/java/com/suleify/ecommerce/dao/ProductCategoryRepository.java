package com.suleify.ecommerce.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.suleify.ecommerce.entity.ProductCategory;

@CrossOrigin
@RepositoryRestResource( collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {

	@Override
	public List<ProductCategory> findAll();
}
