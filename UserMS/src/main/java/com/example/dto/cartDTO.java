package com.example.dto;

import com.example.entity.Buyer;

public class cartDTO {
	
	private Buyer buyerId;
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

}
