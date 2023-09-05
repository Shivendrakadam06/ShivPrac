package com.bank.client;

import com.bank.service.BankService;

public class Appmain {
	public static void main(String[] args) {
		BankService bsk= new BankService();
		bsk.insert();
		bsk.show();
	}

}
