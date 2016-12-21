package com.eci.dp;

public class EmployeeClient {
	public static void main(String[] args) {
	
		
		EmployeeDAO dao = new EmployeeDAO();
		
		// model 
		Employee model = dao.getEmployee();
		
		// view 
		EmployeeView view = new EmployeeView();
		
		EmployeeController controller = new EmployeeController();
		controller.setModel(model);
		controller.setView(view);
		
		
		controller.updateView();
		model = dao.updateEmployee(model, "Barry");
		controller.updateView();
		
		
	}
}
