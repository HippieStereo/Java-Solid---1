package eu.jlpc.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProg {

	public static void main(String[] args) {
		
		List<PersonModel> applicants = new ArrayList<PersonModel>(
				Arrays.asList(
						new PersonModel("FirstName-1", "LastName-1"),
						new PersonModel("FirstName-2", "LastName-2"),
						new PersonModel("FirstName-3", "LastName-3"))
				);
		
		List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
		
		Accounts acountProcessor = new Accounts();
		
		for (PersonModel personModel : applicants) {
			
			employees.add(acountProcessor.Create(personModel));
			
		}
		
		for(EmployeeModel emp : employees) {
			
			System.out.println(String.format("%s %s %s", emp.firstName, emp.lastName, emp.emailAddress));
			
		}
			    
	}

}
