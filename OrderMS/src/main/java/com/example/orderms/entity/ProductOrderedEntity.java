package com.example.orderms.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProductOrdered")
public class ProductOrderedEntity {
	
    public ProductOrderedEntity() {
		super();
	}
	public ProductOrderedEntity(CompPrimaryEntity compPrimaryKey, String sellerId, int quantity) {
		super();
		this.compPrimaryKey = compPrimaryKey;
		this.sellerId = sellerId;
		this.quantity = quantity;
	}
	@EmbeddedId
    private CompPrimaryEntity compPrimaryKey;
    private String sellerId;
    private int quantity;
	public CompPrimaryEntity getcompPrimaryKey() {
		return compPrimaryKey;
	}
	public void setcompPrimaryKey(CompPrimaryEntity compPrimaryKey) {
		this.compPrimaryKey = compPrimaryKey;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
}
