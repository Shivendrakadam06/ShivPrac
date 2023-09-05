package com.bank.service;

import java.util.Scanner;

import com.bank.DAO.BankDAO;
import com.bank.pojo.BankAccount;

public class BankService {
	private Scanner sc;
	private BankAccount barr[];
	private BankDAO bandao;
	
	public BankService() {
		sc=new Scanner(System.in);
		bandao=new BankDAO();
		barr=new BankAccount[2];
	}
	
	public void insert()
	{
		int count=0;
		for(int x=0;x<2;x++)
		{
			BankAccount s=new BankAccount();
			//System.out.println("Enter bank account number ");
			s.setAccno(s.getAccno()+count);
			System.out.println("Enter coountholder name ");
			s.setName(sc.next());
			System.out.println("Enter account type ");
			s.setAcc_type(sc.next());
			System.out.println("Enter account balance ");
			s.setBalance(sc.nextLong());
			System.out.println("Enter address");
			s.setAddress(sc.next());
			barr[x]=s;
			 count++;
		}
		bandao.insert(barr);
	}
	
	public void show()
	{
		bandao.display();
	}
	
	public void deposit() {
		System.out.println("Enter accountno");
		String acc=sc.next();
		System.out.println("Enter amount");
		int amt=sc.nextInt();
		bandao.addmoney(acc, amt);
	}
	
	
}
