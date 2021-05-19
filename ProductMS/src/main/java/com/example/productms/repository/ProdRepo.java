package com.example.productms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.productms.entity.ProdEntity;

public interface ProdRepo extends CrudRepository<ProdEntity,String> {
	
    List<ProdEntity> findByProductName(String prodName);
    
    Optional<ProdEntity> findById(String prodId);
	

	List<ProdEntity> findByCategory(String category);
}
