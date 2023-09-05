package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.DataConnect;

public class UserDao {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	 public UserDao() {
		 
		 sc=new Scanner(System.in);
			con=DataConnect.getConnect();
	 }



	public void validate(String uname, String upass) throws SQLException {
		boolean flag = false ;
		stat=con.prepareStatement("select * from user" );
		ResultSet rs=stat.executeQuery();  
		while(rs.next()) {  
			if(rs.getString(1).equals(uname) && rs.getString(2).equals(upass)) {
				flag=true;
			}
	}
		if(flag==true) {
			System.out.println("valid user");
		}else {
			System.out.println("invalid user");
		}
	}}
