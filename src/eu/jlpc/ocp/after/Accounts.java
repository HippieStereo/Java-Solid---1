package eu.jlpc.ocp.after;

public class Accounts implements IAccounts {
	
	@Override
	public EmployeeModel Create(IApplicantModel person) {
		
		EmployeeModel output = new EmployeeModel();
		
		output.firstName = person.getFirstName();
		output.lastName = person.getLastName();
		output.emailAddress = person.getFirstName().substring(0, 1) + person.getLastName() + "@acme.com";
		
		return output;
		
	}

}
