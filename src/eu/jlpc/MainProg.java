package eu.jlpc;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Person user = new Person();
		
		String input = "";
		
		System.out.println("Hit \"q\" to quit");
		
		while(input != null && !"q".equalsIgnoreCase(input) && 
				input.isBlank() && input.isEmpty()) {
			
			System.out.print("Enter first name : ");
			
			input = scanner.nextLine();
			
			user.firstName = input;
			
			System.out.print("Enter last name : ");
			
			input = scanner.nextLine();
			
			user.lastName = input;
			
		}
		
		System.out.println("Your username is : " + user.firstName.substring(0, 1)
		+ user.lastName);
		
		input = scanner.nextLine();

	}

}
