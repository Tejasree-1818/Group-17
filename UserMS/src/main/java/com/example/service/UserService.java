package com.example.service;

import com.example.dto.BuyerDTO;
import com.example.dto.CartDTO;
import com.example.dto.SellerDTO;
import com.example.dto.WishlistDTO;
import com.example.exception.UserException;

public interface UserService {
	public String registerBuyer(BuyerDTO buyer) throws UserException;
	public String registerSeller(SellerDTO seller) throws UserException;
	public BuyerDTO buyerLogin(String emailId,String password) throws UserException;
	public SellerDTO sellerLogin(String emailId,String password) throws UserException;
	public void deleteBuyer(Integer buyerId) throws UserException;
	public void deleteSeller(Integer sellerId) throws UserException;
	public Integer addProductToWishList(WishlistDTO wishlist) throws UserException;
	public void addToCart(CartDTO cartDTO) throws UserException;
	public void removeCart(CartDTO cartDTO) throws UserException;
	

}
