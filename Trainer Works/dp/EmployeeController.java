package com.eci.dp;

// binder or renderer or updater 
public class EmployeeController {
	private Employee model;
	private EmployeeView view;
	
	
	public Employee getModel() {
		return model;
	}
	public void setModel(Employee model) {
		this.model = model;
	}
	public EmployeeView getView() {
		return view;
	}
	public void setView(EmployeeView view) {
		this.view = view;
	}
	

	public int getEmpId() {
		return model.getEmpId();
	}
	public void setEmpId(int empId) {
		model.setEmpId(empId);
	}
	public String getEmpName() {
		return model.getEmpName();
	}
	public void setEmpName(String empName) {
		model.setEmpName(empName);
	}
	public double getEmpSal() {
		return model.getEmpSal();
	}
	public void setEmpSal(double empSal) {
		model.setEmpSal(empSal);
	}

	public void updateView(){
		view.printEmployee(model);
	}
	
}













