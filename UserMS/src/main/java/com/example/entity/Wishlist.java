package com.example.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


import javax.persistence.Table;

@Entity
@Table(name="wishlist")

public class Wishlist {
	
	@EmbeddedId
	private CompositeKey compositekey;

	public CompositeKey getCompositekey() {
		return compositekey;
	}

	public void setCompositekey(CompositeKey compositekey) {
		this.compositekey = compositekey;
	}
	

	
	
	

}
