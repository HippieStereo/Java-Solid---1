package eu.jlpc.ocp.after;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProg {

	public static void main(String[] args) {
		
		List<IApplicantModel> applicants = new ArrayList<IApplicantModel>(
				Arrays.asList(
						new PersonModel("FirstName-1", "LastName-1"),
						new PersonModel("FirstName-2", "LastName-2"),
						new PersonModel("FirstName-3", "LastName-3"))
				);
		
		List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
		
		applicants.forEach(personModel -> {
			
			employees.add(personModel.getAccountProcessor().Create(personModel));
			
		});
		
		for(EmployeeModel emp : employees) {
			
			System.out.println(String.format("%s : %s : %s : Is Manager = %s : Is Executive = %s", 
					emp.firstName, emp.lastName, emp.emailAddress, emp.isManager, emp.isExecutive));
			
		}
			    
	}

}
