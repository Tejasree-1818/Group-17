package com.example.entity;
//seller entity
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sellerId;
	private String name;
	private String emailId;
	private long phoneNumber;
	private String password;
	private Boolean isActive;
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public int hashCode()
	{
	final int prime=31;
	int result=1;
	result=prime * result +((sellerId==null) ? 0: sellerId.hashCode());
	return result;
	}
	
	  @Override
	  public boolean equals(Object obj)
	  {
	      if(this ==obj)
	         return true;
	      if(obj==null)
	         return false;
	      if(getClass()!=obj.getClass())
	         return false;
	      Seller seller= (Seller) obj;
	      if(sellerId==null){
	         if(seller.sellerId != null)
	              return false;
	      }
	      else if (!sellerId.equals(seller.sellerId))
	               return false;
	      return true;

	}

}
