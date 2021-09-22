package eu.jlpc.srp;

public class MainProg {

	public static void main(String[] args) {
		
		StandardMessage.welcomeMessage();	
		
		Person user = PersonDataCapture.capture();
		
		boolean isUseValid = PersonValidator.validate(user);
		
		while(isUseValid == false) {
			
			isUseValid = PersonValidator.validate(user);
			
		}
		
		AccountGenerator.createAccount(user);
		
		StandardMessage.endMassage();

	}

}
