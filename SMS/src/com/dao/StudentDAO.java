package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.DataConnect;
import com.dto.Student;



public class StudentDAO {
private Connection con;
private PreparedStatement stat;
private Scanner sc;
public StudentDAO()
{
	sc=new Scanner(System.in);
		con=DataConnect.getConnect();
}
	public void insert(Student s) {
		try
		{
		stat=con.prepareStatement("insert into Student values(?,?,?,?)");
		stat.setInt(1,s.getStudentid());
		stat.setString(2, s.getStudentname());
		stat.setInt(3,s.getScore());
		stat.setString(4,s.getAddress());
		int result=stat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data inserted");
		}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	public void deleteData(int studentid) {

		try
		{
		stat=con.prepareStatement("delete from Student where studentid=?");
		stat.setInt(1,studentid);
		int result=stat.executeUpdate();
				if(result>0)
				{
					System.out.println("Data deleted");
				}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void retreiveData()
	{
		try
		{
		stat=con.prepareStatement("select * from student");
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			System.out.println("studenti id is "+result.getInt(1));
			System.out.println("Student name is "+result.getString(2));
			
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	public void updateData(int studid)
	{
		try
		{
		stat=con.prepareStatement("select * from student where studentid=?");
		stat.setInt(1, studid);
		ResultSet result=stat.executeQuery();
		if(result.next())
		{
			System.out.println("Enter updated score ");
			int updatedscore=sc.nextInt();
			stat=con.prepareStatement("update student set score=? where studentid=?");
			stat.setInt(1, updatedscore);
			stat.setInt(2, studid);
			int rows=stat.executeUpdate();
			if(rows>0)
			{
				System.out.println("updated successfully");
			}
			
		}
				
	}
		catch(SQLException ex)
		{
			System.out.println("Exception is "+ex.getMessage());
		}

}}

