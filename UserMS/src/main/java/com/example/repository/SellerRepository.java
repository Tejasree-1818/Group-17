package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Seller;



public interface SellerRepository extends CrudRepository<Seller,Integer>{
	public Seller findByContactNummber(String contactNumber);
	public Seller findByEmailId(String emailId);


}
