package com.eci.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getEmpName().compareTo(o.getEmpName());
	}
	
	
}


public class PriorityEx1 {
	public static void main(String[] args) {
		PriorityQueue<Employee> pEmps = new PriorityQueue<Employee>();
		
		pEmps.add(new Employee(101, "Nagesh"));
		pEmps.add(new Employee(23, "Harish"));
		pEmps.add(new Employee(44, "Abhishek"));
		pEmps.add(new Employee(6, "Prasad"));
		pEmps.add(new Employee(500, "Kumar"));
		pEmps.add(new Employee(223, "Zafrin"));
		pEmps.add(new Employee(1, "Mahesh"));
		
		
		for(Employee temp : pEmps){
			System.out.println(temp);
		}
		
		System.out.println("------------------------------");
		
		
		while(!pEmps.isEmpty()) {
			Employee s=pEmps.poll();
			System.out.println(s );
			}
		
	}
}

























