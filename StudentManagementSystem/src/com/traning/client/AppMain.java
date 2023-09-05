package com.traning.client;

import com.traning.service.StudentService;

public class AppMain {
	public static void main(String[] args) {
		StudentService sservice=new StudentService();
		sservice.insert();
		sservice.del();
		sservice.show();
	}


}
