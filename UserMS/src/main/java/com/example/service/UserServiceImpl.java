package com.example.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.BuyerDTO;
import com.example.dto.SellerDTO;
import com.example.entity.Buyer;
import com.example.entity.Seller;
import com.example.exception.UserException;
import com.example.repository.BuyerRepository;
import com.example.repository.SellerRepository;
import com.example.validator.BuyerValidator;
import com.example.validator.SellerValidator;

@Service(value="userImpl")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private BuyerRepository buyerRepository;
	
	@Autowired 
	private SellerRepository sellerRepository;
	
	@Override
	public String registerBuyer(BuyerDTO buyer) throws UserException
	{
		BuyerValidator.validateBuyerRegistration(buyer);
		if(buyerRepository.findByContactNummber(buyer.getPhoneNumber())!=null) {
			throw new UserException("Service.BUYER_ALREDY_EXISTS");
		}
	    
		
		Buyer buyerEntity=new Buyer();
		buyerEntity.setBuyerId(buyer.getBuyerId());
		buyerEntity.setPhoneNumber(buyer.getPhoneNumber());
		buyerEntity.setEmailId(buyer.getEmailId());
		buyerEntity.setIsActive(buyer.getIsActive());
		buyerEntity.setIsPrivilaged(buyer.getIsPrivilaged());
		buyerEntity.setName(buyer.getName());
		buyerEntity.setPassword(buyer.getPassword());
		buyerEntity.setRewardPoints(buyer.getRewardPoints());
		buyerRepository.save(buyerEntity);
		return buyerEntity.getName();
		
	}
	
	
	@Override
	public String registerSeller(SellerDTO seller) throws UserException
	{
		SellerValidator.validateSellerRegistration(seller);
		if(sellerRepository.findByContactNummber(seller.getPhoneNumber())!=null) {
			throw new UserException("Service.SELLER_ALREDY_EXISTS");
		}
	    
		
		Seller sellerEntity=new Seller();
		sellerEntity.setPhoneNumber(seller.getPhoneNumber());
		sellerEntity.setEmailId(seller.getEmailId());
		sellerEntity.setIsActive(seller.getIsActive());
		sellerEntity.setName(seller.getName());
		sellerEntity.setPassword(seller.getPassword());
		sellerEntity.setSellerId(seller.getSellerId());
		sellerRepository.save(sellerEntity);
		return sellerEntity.getName();
	}
	
	@Override
	public BuyerDTO buyerLogin(String email,String password)throws UserException
	{
		Buyer buyer =buyerRepository.findByEmailId(email);
		if(buyer==null)
		{
			throw new UserException("Service.INVALID_CREDENTIALS");
		}
		
		String bPassword=buyer.getPassword();
		if(bPassword!=null)
			if(bPassword.equals(password))
			{
				BuyerDTO bDTO=new BuyerDTO();
				bDTO.setBuyerId(buyer.getBuyerId());
				bDTO.setPhoneNumber(buyer.getPhoneNumber());
				bDTO.setEmailId(buyer.getEmailId());
				bDTO.setIsActive(buyer.getIsActive());
				bDTO.setIsPrivilaged(buyer.getIsPrivilaged());
				bDTO.setName(buyer.getName());
				bDTO.setPassword(buyer.getPassword());
				bDTO.setRewardPoints(buyer.getRewardPoints());
				return bDTO;
				
			}
			else {
				throw new UserException("Service.INVALID_CREDENTIALS");
			}
		else
		{
			throw new UserException("Service.INVALID_CREDENTIALS");
		}
	}
	
	@Override
	public SellerDTO sellerLogin(String email,String password)throws UserException
	{
		Seller seller =sellerRepository.findByEmailId(email);
		if(seller==null)
		{
			throw new UserException("Service.INVALID_CREDENTIALS");
		}
		
		String sPassword=seller.getPassword();
		if(sPassword!=null)
			if(sPassword.equals(password))
			{
				SellerDTO sDTO=new SellerDTO();
				sDTO.setSellerId(seller.getSellerId());
				sDTO.setPhoneNumber(seller.getPhoneNumber());
				sDTO.setName(seller.getName());
				sDTO.setEmailId(seller.getEmailId());
				sDTO.setPassword(seller.getPassword());
				sDTO.setIsActive(seller.getIsActive());
				return sDTO;
				
			}
			else {
				throw new UserException("Service.INVALID_CREDENTIALS");
			}
		else
		{
			throw new UserException("Service.INVALID_CREDENTIALS");
		}
	}
	
	
	public void deleteBuyer(Integer buyerId) throws UserException
	{
		Optional<Buyer> optional=buyerRepository.findById(buyerId);
		optional.orElseThrow(()->new UserException("Service.USER_NOT_FOUND"));
		buyerRepository.deleteById(buyerId);
		
	}
	
	public void deleteSeller(Integer sellerId) throws UserException
	{
		Optional<Seller> optional=sellerRepository.findById(sellerId);
		optional.orElseThrow(()->new UserException("Service.USER_NOT_FOUND"));
		sellerRepository.deleteById(sellerId);
		
	}
	
	
	

}
