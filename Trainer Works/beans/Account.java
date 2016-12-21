package com.eci.beans;

public class Account {
	private int accId;
	private String name;
	private double balance;
	private static int count =100;
	
	
	static{
			// any thing 
		count = 200;
		
		System.out.println("Account Class is loaded with count value " + count);
	}
	
	{
		balance = 1000;
	}	
	private static int myMethod(){
		return 300;
	}


	public Account(String name, double balance) {
		super();
		this.accId = count++;
		this.name = name;
		this.balance = balance;
	}

	public Account(String name) {
		super();
		this.accId = count++;
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccId() {
		return accId;
	}


	public static int getCount() {
		return count;
	}


	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
