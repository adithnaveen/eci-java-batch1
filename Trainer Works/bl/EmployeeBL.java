package com.eci.bl;

public class EmployeeBL {
	
	static{
			try {
				Class.forName("com.eci.beans.Account");
				Class.forName("com.eci.beans.SomeStatic");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	public void insertEmp(){}
}
