package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.BuyerDTO;
import com.example.dto.SellerDTO;
import com.example.exception.UserException;
import com.example.service.UserService;

@CrossOrigin
@RestController
@RequestMapping
public class UserController {
	
	
	@Autowired
	private UserService userImpl;
	
	@Autowired
	private Environment environment;
	
	
	@RequestMapping(value="/buyerRegister",method=RequestMethod.POST)
	public ResponseEntity<String> registerBuyer(@RequestBody BuyerDTO buyer) throws UserException
	{
		String uName=userImpl.registerBuyer(buyer);
		String message=environment.getProperty("UserController.BUYER_SUCCESSS") + " " + uName +" "+
				environment.getProperty("UserController.BUYER_SUCCESSS");
		return new ResponseEntity<String>(message, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/sellerrRegister",method=RequestMethod.POST)
	public ResponseEntity<String> registerSeller(@RequestBody SellerDTO seller) throws UserException
	{
		String uName=userImpl.registerSeller(seller);
		String message=environment.getProperty("UserController.BUYER_SUCCESSS") + " " + uName +" "+
				environment.getProperty("UserController.BUYER_SUCCESSS");
		return new ResponseEntity<String>(message, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/buyerLogin",method=RequestMethod.POST)
	public ResponseEntity<BuyerDTO> buyerLogin(@RequestBody BuyerDTO buyer) throws UserException
	{
	   BuyerDTO bDTO=userImpl.buyerLogin(buyer.getEmailId(),buyer.getPassword());
	   return new ResponseEntity<BuyerDTO>(bDTO,HttpStatus.OK);
	}
	
	@RequestMapping(value="/sellerLogin",method=RequestMethod.POST)
	public ResponseEntity<SellerDTO> sellerLogin(@RequestBody SellerDTO seller) throws UserException
	{
	   SellerDTO sDTO=userImpl.sellerLogin(seller.getEmailId(),seller.getPassword());
	   return new ResponseEntity<SellerDTO>(sDTO,HttpStatus.OK);
	}
	
	@RequestMapping(value="/buyer/{buyerId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteBuyer(@PathVariable Integer buyerId) throws UserException
	{
		userImpl.deleteBuyer(buyerId);
		String message=environment.getProperty("UserController.DELETE_SUCCESSS");
		 return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping(value="/seller/{sellerId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteSeller(@PathVariable Integer sellerId) throws UserException
	{
		userImpl.deleteSeller(sellerId);
		String message=environment.getProperty("UserController.DELETE_SUCCESSS");
		 return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	
   
	
	
	

}
