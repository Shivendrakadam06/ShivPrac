package com.bank.pojo;

public class BankAccount {
	
	   private String accno ="BA1000";  
	    private String name;  
	    private String acc_type;  
	    public String getAccno() {
			return accno;
		}
		public void setAccno(String accno) {
			this.accno = accno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAcc_type() {
			return acc_type;
		}
		public void setAcc_type(String acc_type) {
			this.acc_type = acc_type;
		}
		public long getBalance() {
			return balance;
		}
		public void setBalance(long balance) {
			this.balance = balance;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		private long balance;
	    private String address; 

}
