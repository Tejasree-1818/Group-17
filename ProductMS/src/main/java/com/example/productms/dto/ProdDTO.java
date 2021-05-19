package com.example.productms.dto;

import java.util.Optional;

import com.example.productms.entity.ProdEntity;

public class ProdDTO {
    private String prodId;
	private String prodName;
	private float price;
	private int stock;
	private String description;
	private String image;
	private String sellerId;
	private String category;
	private String subcategory;
	private float productRating;
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public String getDescription() {
		return description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public float getProductRating() {
		return productRating;
	}
	public void setProductRating(float productRating) {
		this.productRating = productRating;
	}
	public static ProdDTO valueOf(Optional<ProdEntity> prodEntity) {
		ProdDTO pD=new ProdDTO();
		pD.setProdId(prodEntity.get().getProdId());
		pD.setCategory(prodEntity.get().getCategory());
		pD.setDescription(prodEntity.get().getDescription());
		pD.setImage(prodEntity.get().getImage());
		pD.setPrice(prodEntity.get().getPrice());
		pD.setSubcategory(prodEntity.get().getSubcategory());
		pD.setStock(prodEntity.get().getStock());
		pD.setProductRating(prodEntity.get().getProductRating());
		pD.setSellerId(prodEntity.get().getSellerId());
		pD.setProdName(prodEntity.get().getProdName());
		return pD;
	}
}
