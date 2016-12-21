package com.eci.threads;

class Account{
	int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	
	public synchronized  void withDraw(int amt){
		if(amt < balance){
			// true condition
			// amt found and deduct 
			// simulating -> to connect db and updating 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = balance - amt;
			
			System.out.println("Amout Request is " + amt +" and Balance after deduction is " + balance);
		}else{
			// false condition 
			// no  amt 
			System.out.println("Sorry No Amount of " + amt);
			System.out.println("Current Balance : " + balance);
		}
	}
}


public class ThreadEx4 implements Runnable{

	Account account;
	int amount;
	public static void main(String[] args) {
		
		Account acc = new Account(1000);
		new ThreadEx4(acc, 500);
		new ThreadEx4(acc, 750);
	}

	public ThreadEx4(Account account, int amount) {
		this.account = account;
		this.amount = amount;
		
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		
		synchronized (account) {
			account.withDraw(amount);
		}
	}
}



















