package eu.jlpc.ocp;

public class Accounts {
	
	public EmployeeModel Create(PersonModel person) {
		
		EmployeeModel output = new EmployeeModel();
		
		output.firstName = person.firstName;
		output.lastName = person.lastName;
		output.emailAddress = person.firstName.substring(0, 1) + person.lastName + "@acme.com";
		
		return output;
		
	}

}
