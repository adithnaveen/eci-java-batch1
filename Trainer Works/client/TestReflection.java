package com.eci.client;

import com.eci.bl.EmployeeBL;

public class TestReflection {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.eci.beans.Account");
		
		
		EmployeeBL ebl = new EmployeeBL();
	}
}
