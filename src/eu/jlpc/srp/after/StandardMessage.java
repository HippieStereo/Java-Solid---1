package eu.jlpc.srp.after;

public class StandardMessage {
	
	public static void welcomeMessage() {
		
		System.out.println("Hit \"q\" to quit\n");
		
	}
	
	public static void endMassage() {
		
		System.out.print("Bye !!!");
		
		System.exit(0);
		
	}
	
	public static void displayValidationError(String fieldName) {
		
		System.out.println(String.format("You did not give us a valid %s ; try again", fieldName));
		
	}

}
