package eu.jlpc;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Person user = new Person();
		
		System.out.println("Hit \"q\" to quit");			

		System.out.print("Enter first name : ");
		
		user.firstName = scanner.nextLine();
		
		System.out.print("Enter last name : ");
		
		user.lastName = scanner.nextLine();
		
		while((user.firstName == null || 
			user.firstName.isBlank() ||
			user.firstName.isEmpty())) {
			
			System.out.println("You did not give us a valid first name ; try again");
			
			user.firstName = scanner.nextLine();
			
		}

		while((user.lastName == null || 
				user.lastName.isBlank() ||
				user.lastName.isEmpty())) {
				
			System.out.println("You did not give us a valid last name ; try again");
			
			user.lastName = scanner.nextLine();
				
		}
		
		
		System.out.println("Your username is : " + user.firstName.substring(0, 1)
		+ user.lastName + "\n");
		
		scanner.close();

	}

}
