package com.suleify.ecommerce.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.suleify.ecommerce.entity.Product;

@CrossOrigin
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	@Override
	public List<Product> findAll();
}
