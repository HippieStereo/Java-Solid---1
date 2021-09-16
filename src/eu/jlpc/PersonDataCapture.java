package eu.jlpc;

import java.util.Scanner;

public class PersonDataCapture {
	
	public static Person capture() {
		
		Scanner scanner = new Scanner(System.in);
		
		Person output = new Person();
		
		System.out.print("Enter first name : ");
		
		output.firstName = scanner.nextLine();
		
		System.out.print("Enter last name : ");
		
		output.lastName = scanner.nextLine();
		
		return output;
		
	}

}
