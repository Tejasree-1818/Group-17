package com.example.dto;

public class BuyerDTO {
	private Integer buyerId;
	private String name;
	private String emailId;
	private Long phoneNumber;
	private String password;
	private Boolean isPrivilaged;
	private Float rewardPoints;
	private Boolean isActive;
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsPrivilaged() {
		return isPrivilaged;
	}
	public void setIsPrivilaged(Boolean isPrivilaged) {
		this.isPrivilaged = isPrivilaged;
	}
	public Float getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(Float rewardPoints) {
		this.rewardPoints = rewardPoints;
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
	result=prime * result +((buyerId==null) ? 0: buyerId.hashCode());
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
	BuyerDTO bDTO= (BuyerDTO) obj;
	if(buyerId==null){
	   if(bDTO.buyerId != null)
	      return false;
	}
	else if (!buyerId.equals(bDTO.buyerId))
	  return false;
	return true;
	
	}
}
