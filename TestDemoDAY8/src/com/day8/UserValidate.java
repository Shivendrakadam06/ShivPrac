package com.day8;

public class UserValidate {
	
	public boolean checkUSer( String user,String pass) {
		
		if(user.equals("admin")&&pass.equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
