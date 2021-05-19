package com.example.dto;

import com.example.entity.Buyer;

public class WishlistDTO {
	
	private Buyer buyerId;
	private String prodId;

	public Buyer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Buyer buyerId) {
		this.buyerId = buyerId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
	
	
	
	@Override
	public String toString()
	{
		return "WishlistDTO [buyerId=" + buyerId + ",prodId" + prodId + "]";
	}
	
	
	

}
