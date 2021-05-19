package com.example.productms.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.productms.entity.CompPrimaryEntity;

@Entity
@Table(name="SubscribedProduct")
public class SubscribedProdEntity {
	@EmbeddedId
    private CompPrimaryEntity compPrimaryKey;
	private int quantity;
	public SubscribedProdEntity(CompPrimaryEntity compPrimaryKey, int quantity) {
		super();
		this.compPrimaryKey = compPrimaryKey;
		this.quantity = quantity;
	}
	public SubscribedProdEntity() {
		super();
		
	}
	public CompPrimaryEntity getCompPrimaryKey() {
		return compPrimaryKey;
	}
	public void setCompPrimaryKey(CompPrimaryEntity compPrimaryKey) {
		this.compPrimaryKey = compPrimaryKey;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
