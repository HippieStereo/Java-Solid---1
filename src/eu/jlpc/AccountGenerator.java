package eu.jlpc;

public class AccountGenerator {
	
	public static void createAccount(Person account) {
		
		System.out.println("Your username is : " + account.firstName.substring(0, 1)
		+ account.lastName + "\n");
		
	}

}
