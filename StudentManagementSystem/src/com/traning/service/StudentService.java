package com.traning.service;

import java.util.Scanner;

import com.traning.dao.StudentDAO;
import com.traning.pojo.Student;

public class StudentService {
	private Scanner sc;
	private StudentDAO stdao;
	private Student starr[];
	int noofstudent;
	public StudentService()
	{
		sc=new Scanner(System.in);
		stdao=new StudentDAO();
		
	//	System.out.println("Enter how many student details u want ");
	//noofstudent=sc.nextInt();
	starr=new Student[2];
		
	}
	public void insert()
	{
		for(int x=0;x<2;x++)
		{
			Student s=new Student();
			System.out.println("Enter Student id");
			s.setStudentid(sc.nextInt());
			System.out.println("Enter Student name ");
			s.setStudentname(sc.next());
			System.out.println("Enter Score ");
			s.setScore(sc.nextInt());
			starr[x]=s;
			
		}
		stdao.insert(starr);
	}
	public void show()
	{
		stdao.display();
	}
	
	public void del()
	{
		System.out.println("Enter Student id");
		int dels=sc.nextInt();
		stdao.delStudent(dels);
	}

}


