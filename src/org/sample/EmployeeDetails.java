package org.sample;

public class EmployeeDetails {

	
	//created method --------method definition
	public void javaCourse() {
		
		System.out.println("Java class ...");
		System.out.println("Army ready");
	}
	
	private void pythonCourse() {
		
		System.out.println("Python Class..");
	}
	
	//create a main method
	public static void main(String[] args) {
		
		EmployeeDetails emp=new EmployeeDetails();
		emp.pythonCourse();
		emp.javaCourse();
		
		
	}
	
}
