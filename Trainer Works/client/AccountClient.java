package com.eci.client;

import com.eci.beans.Account;

public class AccountClient {
	public static void main(String[] args) {
		Account [] accs = new Account[5];
		
		accs[0] = new Account("Peter", 1000);
		accs[1] = new Account("Harry", 1200);
		accs[2] = new Account("Becky", 3300);
		accs[3] = new Account("Tim", 1400);
		accs[4] = new Account("Poter", 3000);
		
		for(Account temp : accs){
			System.out.println(temp);
		}
	}
}
