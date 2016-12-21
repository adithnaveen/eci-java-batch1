package com.eci.beans;

// this will be the bean class 
// private variables 
// public getters and setters 
// default contructor 
public class Employee {
	private int empId;
	private Name name;
	private double empSal;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empSal=" + empSal + "]";
	}
	
	
	
	

}














