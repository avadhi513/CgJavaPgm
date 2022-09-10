package org.test;

import com.delta.login.*;

public class ClientDetails extends CourseDetails {
	
	private void cliId() {
		System.out.println("Client Id = 122333");

	}
	
	private void cliName() {
		System.out.println("Client Name = XXX");

	}
	
	private void cliLoc() {
		System.out.println("Client Location = XXX");

	}
	
	public static void main(String[] args) {
		
		ClientDetails cl = new ClientDetails();
		cl.cliId();
		cl.cliName();
		cl.cliLoc();
		
		cl.javaCourse();
		
		
		
		cl.awsCourse();
		
	}

}
