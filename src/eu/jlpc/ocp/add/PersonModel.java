package eu.jlpc.ocp.add;

public class PersonModel {

	public String firstName;
	public String lastName;
	public EmployeeType empType;
	
	public PersonModel(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public PersonModel(String firstName, String lastName, EmployeeType empType) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.empType = empType;
		
	}
	
}
