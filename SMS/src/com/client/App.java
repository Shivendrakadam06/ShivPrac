package com.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.StudentService;
import com.service.UserService;

public class App {
	private Scanner sc;
	private StudentService sservice;
	private UserService uv;

	public App() {
		sc= new Scanner(System.in);
		sservice=new StudentService();
		uv = new UserService();
	}
	
	public App switchstat() {
		App sh = new App();
		
		System.out.println("press 1 for login"
				+""+ "press 2 for insertion"
				+""+ "press 3 for updation"
				+""+ "press 4 for deletion");
		int st= sc.nextInt();
		switch(st){   
		case 1:
			try {
				uv.uservalidation();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sh.switchstat();
			break;
		case 2:
			sservice.insert();
		sh.switchstat();
			break;
		case 3:
			
		sservice.update();
		sh.switchstat();
		break;
		
		case 4:
			sservice.delete();
			sh.switchstat();
			break;
		
		
		
		
		
		
		
		
		
		}
		return null;
		
		
		
		
	}
	
}
