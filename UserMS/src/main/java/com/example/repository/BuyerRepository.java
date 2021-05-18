package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Buyer;

public interface BuyerRepository  extends CrudRepository<Buyer,Integer>{
	public Buyer findByContactNummber(String contactNumber);
	public Buyer findByEmailId(String emailId);

}
