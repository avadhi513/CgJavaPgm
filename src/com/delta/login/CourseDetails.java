package com.delta.login;

public class CourseDetails implements Arrays1 {
    
	// public
	public void javaCourse() {
		System.out.println("Course = JAVA");

	}
	
	// default
	public void awsCourse() {
		System.out.println("Course = AWS");

	}
	
	// private
	private void seleniumCourse() {
		System.out.println("Course = Selenium");

	}
	
	// protected
	public void apiCourse() {
		System.out.println("Course = API");
	}
	
	// main - ctrl + space
	public static void main(StringMethods[] args) {
		
		// create an object - ClassName objName = new ClassName();
        CourseDetails cou = new CourseDetails(); // heap m/y
		
        // call the method - objName.methodName();
		cou.javaCourse();
		cou.awsCourse();
		cou.seleniumCourse();
		cou.apiCourse();
	}
	
}

