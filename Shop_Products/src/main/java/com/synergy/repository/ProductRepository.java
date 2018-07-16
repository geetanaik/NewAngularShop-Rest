package com.synergy.repository;
//import com.synergy.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.synergy.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

	Product findByProductName(String productName);
	
	
}
