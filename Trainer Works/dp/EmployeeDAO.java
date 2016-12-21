package com.eci.dp;

public class EmployeeDAO {
	// will hit the DB and get us emp 
	public Employee getEmployee(){
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Harry");
		emp.setEmpSal(12000);
		
		return emp;
	}
	
	
	public Employee updateEmployee(Employee emp, String name){
		
		// hit to db and update  
		Employee temp =  emp;
		temp.setEmpName(name);
		return temp;
	}
	
	
}
