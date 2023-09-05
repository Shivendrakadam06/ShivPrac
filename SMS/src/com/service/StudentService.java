package com.service;

import java.util.Scanner;

import com.dao.StudentDAO;
import com.dto.Student;
import com.dto.User;


public class StudentService {
	private Scanner sc;
	private StudentDAO studentdao;
	public StudentService()
	{
		sc=new Scanner(System.in);
		studentdao=new StudentDAO();
	}
	public void insert()
	{
		System.out.println("Enter no of records u want to enter");
		int noofstudent=sc.nextInt();
		for(int x=1;x<=noofstudent;x++)
		{
			Student s=new Student();
			System.out.println("Enter student id ");
			s.setStudentid(sc.nextInt());
			System.out.println("Enter Student name ");
			s.setStudentname(sc.next());
			System.out.println("Enter Score ");
			s.setScore(sc.nextInt());
			System.out.println("Enter Address ");
			s.setAddress(sc.next());
			studentdao.insert(s);
			
		}
	}
	public void delete()
	{
		System.out.println("Enter Student id which u want to delete");
		int studentid=sc.nextInt();
		studentdao.deleteData(studentid);
	}
	public void show()
	{
		studentdao.retreiveData();
	}
	public void update()
	{
		System.out.println("Enter Student id which u want to update");
		int studentid=sc.nextInt();
		studentdao.updateData(studentid);
	}
	
	
}