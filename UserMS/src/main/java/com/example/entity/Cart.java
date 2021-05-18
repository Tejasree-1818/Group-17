package com.example.entity;
//cart entity
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//comment1
@Table
public class Cart {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="buyer_id")
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
