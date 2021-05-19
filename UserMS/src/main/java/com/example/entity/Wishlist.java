package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import javax.persistence.Table;

@Entity
@Table(name="wishlist")
@IdClass(CompositeKey.class)
public class Wishlist {
	
	@Id
	private Buyer buyerId;
	@Id
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
	
	

}
