package eu.jlpc.srp;

import java.util.Scanner;

public class PersonValidator {

	public static boolean validate(Person person) {
		
		Scanner scanner = new Scanner(System.in);

		if ((person.firstName == null || person.firstName.isBlank() || person.firstName.isEmpty())) {

			StandardMessage.displayValidationError("first name");

			person.firstName = scanner.nextLine();
			
			return false;

		}

		if ((person.lastName == null || person.lastName.isBlank() || person.lastName.isEmpty())) {

			StandardMessage.displayValidationError("last name");

			person.lastName = scanner.nextLine();
			
			return false;

		}
		
		return true;

	}

}
