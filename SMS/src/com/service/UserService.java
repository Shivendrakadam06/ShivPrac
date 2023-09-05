package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.UserDao;

public class UserService {
	private Scanner sc;
	private UserDao udao;

	public UserService() {
		sc= new Scanner(System.in);
		udao= new UserDao();
	}
	
	
	public void uservalidation() throws SQLException {
		System.out.println("enter user name");
		String uname=sc.next();
		System.out.println("enter password");
		String upass=sc.next();
		udao.validate(uname,upass);
		
	}

}
