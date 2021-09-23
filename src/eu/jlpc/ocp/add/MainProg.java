package eu.jlpc.ocp.add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProg {

	public static void main(String[] args) {
		
		List<PersonModel> applicants = new ArrayList<PersonModel>(
				Arrays.asList(
						new PersonModel("FirstName-1", "LastName-1", EmployeeType.Executive),
						new PersonModel("FirstName-2", "LastName-2", EmployeeType.Staff),
						new PersonModel("FirstName-3", "LastName-3", EmployeeType.Manager))
				);
		
		List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
		
		Accounts acountProcessor = new Accounts();
		
		for (PersonModel personModel : applicants) {
			
			employees.add(acountProcessor.Create(personModel));
			
		}
		
		for(EmployeeModel emp : employees) {
			
			System.out.println(String.format("%s : %s : %s : Is Manager = %s : Is Executive = %s", 
					emp.firstName, emp.lastName, emp.emailAddress, emp.isManager, emp.isExecutive));
			
		}
			    
	}

}
