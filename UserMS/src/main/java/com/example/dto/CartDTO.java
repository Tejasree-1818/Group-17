package com.example.dto;

import com.example.entity.Buyer;

public class CartDTO {
	
	private Buyer buyerId;
	private String prodId;
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	private Integer quantity;
	public Buyer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Buyer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		
		
	}
	
	@Override
	public String toString()
	{
		return "CartDTO[buyerId" + buyerId +", prodId=" + prodId + ",quantity=" + quantity
				+ "]";
	}

}
