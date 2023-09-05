package com.bank.DAO;

import com.bank.pojo.BankAccount;
import com.traning.pojo.Student;


public class BankDAO {
private BankAccount bkarr[];

public BankDAO() {
	bkarr = new BankAccount[2]; 
}
public void insert(BankAccount barr[] ) {
	for(int counter=0;counter<bkarr.length;counter++) {
		bkarr[counter]=barr[counter];
		
	}
	
}

public void display() {
	for(BankAccount s:bkarr) {
		System.out.println("account name is "+s.getName());
		System.out.println("current account balance "+s.getBalance());
		System.out.println("current account number "+s.getAccno());
		
	}
}
public void addmoney(String acc, int amt) {
	for(BankAccount s:bkarr) {
		s.
	}
	
}

}
