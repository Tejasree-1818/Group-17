package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//wishlist entity
public class Wishlist {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="buyer_id")
	private Buyer buyerId;

	public Buyer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Buyer buyerId) {
		this.buyerId = buyerId;
	}
	

}
