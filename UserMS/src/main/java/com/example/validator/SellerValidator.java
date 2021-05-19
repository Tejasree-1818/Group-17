package com.example.validator;


import com.example.dto.SellerDTO;
import com.example.exception.UserException;

public class SellerValidator {
	
	public static void validateSellerRegistration(SellerDTO seller) throws UserException
	{
		if(!validName(seller.getName()))
			throw new UserException("Validator.INVALID_NAME_FORMAT");
		
		if(!validEmailId(seller.getEmailId()))
			throw new UserException("Validator.INVALID_EMAILID_FORMAT");
		if(!validContactNumber(seller.getPhoneNumber()))
		    throw new UserException("Validator.INVALID_CONTACTNUMBER_FORMAT");
		if(!validPassword(seller.getPassword()))
			throw new UserException("Validator.INVALID_PASSWORD_FORMAT");
	}
	
	public static void validateSellerLogin(String email,String password)throws UserException
	{
		if(!validEmailId(email))
			throw new UserException("Validator.INVALID_EMAILID_FORMAT");
		if(!validPassword(password))
			throw new UserException("Validator.INVALID_PASSWORD_FORMAT");
	}
	
	
	public static Boolean validName(String name)
	{
		if(name==null || name.trim().length()!=name.length())
			return false;
		return name.matches("[A-Za-z ]+");
		
	}
	
	
	public static Boolean validEmailId(String email)
	{
		if(email==null)
			return false;
		return email.matches("[A-Za-z]+@[A-Za-z]+[.]com");
	}
	public static Boolean validContactNumber(String contactNumber)
	{
		if(contactNumber==null)
			return false;
		Boolean f= false;
		if(contactNumber.matches("[6-9][0-9]{9}"))
			f=true;
		return f;
		
	}
	
	public static Boolean validPassword(String password)
	{
		if(password==null)
			return false;
		Boolean f=false;
		if(password.length()>=7 && password.length()<=28)
			if(password.matches(".*[A-Z]+.*"))
				if(password.matches(".*[a-z]+.*"))
					if(password.matches(".*[0-9]+.*"))
						if(password.matches(".*[!@#$%^&*]+.*"))
							f=true;
		return f;
		
	}

}
