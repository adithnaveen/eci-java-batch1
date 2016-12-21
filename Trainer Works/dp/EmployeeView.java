package com.eci.dp;

public class EmployeeView {

	
	// can have many view for emp 
	
	public void printEmployee(Employee emp){
		System.out.println("----------------------------------------------------------------------");
		System.out.println(emp.getEmpId() +", " + emp.getEmpName() +", " + emp.getEmpSal());
		System.out.println("----------------------------------------------------------------------");		
	}
	
	// more view methods here 
}
