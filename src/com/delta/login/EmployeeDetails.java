package com.delta.login;

public class EmployeeDetails extends CourseDetails {
	
	public void empName() {
		System.out.println("Employee Name = XYZ");

	}
	
	public void empId() {
		System.out.println("Employee ID = 123456");

	}
	
	private void empLoc() {
		System.out.println("Employee Location = XYZ");

	}
	
	public static void main(StringMethods[] args) {
		
		EmployeeDetails emd = new EmployeeDetails();
		
		emd.empId();
		emd.empName();
		emd.empLoc();
		
		emd.javaCourse();
		emd.awsCourse();
	}

}
