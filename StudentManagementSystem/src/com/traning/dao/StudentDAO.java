package com.traning.dao;

import com.traning.pojo.Student;

public class StudentDAO {
	private Student studentarr[];
	public StudentDAO()
	{
		studentarr=new Student[2];
	}
	public void insert(Student storearr[])
	{
		
		for(int counter=0;counter<studentarr.length;counter++)
		{
			studentarr[counter]=storearr[counter];
		}
	}
	
	public void delStudent(int dels) {
		for(Student s:studentarr)
		{
			if(s.getStudentid()==dels)
			{
				studentarr [dels]=null;
				
			}
		}
		
		
	}
	public void display()
	{
		for(Student s:studentarr)
		{
			System.out.println("Studnet name is "+s.getStudentname());
		}
	}
}
