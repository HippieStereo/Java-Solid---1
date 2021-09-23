package eu.jlpc.ocp.add;

public class Accounts {
	
	public EmployeeModel Create(PersonModel person) {
		
		EmployeeModel output = new EmployeeModel();
		EmployeeType empType = person.empType;
		
		output.firstName = person.firstName;
		output.lastName = person.lastName;
		output.emailAddress = person.firstName.substring(0, 1) + person.lastName + "@acme.com";
		
		
		switch (empType) {
		
		case Manager:
			
			output.isManager = true;
			output.isExecutive = true;
			
			break;
			
		case Executive:
			
			output.isExecutive = true;
			
			break;
			
		default:
			
			break;
			
		}
		
		return output;
		
	}

}
