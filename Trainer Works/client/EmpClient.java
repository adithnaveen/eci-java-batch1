package com.eci.client;

import com.eci.beans.Employee;
import com.eci.beans.Name;

public class EmpClient {
	public static void main(String[] args) {
		
//		Runtime.runFinalizersOnExit(true);
		
		Runtime.getRuntime().gc();
		
		
		Employee  emp;
		
		emp = new Employee();
		
		new Employee();
		new Employee();
		new Employee();
		new Employee();
		new Employee();
		Runtime.getRuntime().gc();

		// this should not be done 
//		emp.empId = 111;
//		emp.empSal=-33333;
		Name name = new Name();
		name.setfName("Amit");
		name.setlName("Kothari");
		name.setmName("Raju");
		emp.setEmpId(101);
		emp.setName(name);
		emp.setEmpSal(20000);
		
		
		System.out.println(emp);
		
		// will call toString of Object class 
	}
}
