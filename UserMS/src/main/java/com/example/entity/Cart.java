package com.example.entity;
//cart entity

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import javax.persistence.Table;
//comment1
@Table(name="cart")
@Entity
@IdClass(CompositeKey.class)

public class Cart {
	
	@Id
	private Buyer buyerId;
	private Integer quantity;
	@Id
	private String prodId;
	
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
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
	

}
