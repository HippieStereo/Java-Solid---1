package eu.jlpc.lsp.after;

public class MainProg {

	public static void main(String[] args) throws Exception {

		IManager accoutingVP = new Manager();

		((Manager)accoutingVP).firstName = "Emma";
		((Manager)accoutingVP).lastName = "Stone";
		((Manager)accoutingVP).calculatePerHourRate(4);

		Employee emp_1 = new Employee();

		emp_1.firstName = "First name";
		emp_1.lastName = "Last lame";
		emp_1.assignManager(accoutingVP);
		emp_1.calculatePerHourRate(2);
		
		System.out.println(emp_1.firstName + " salary is : " + emp_1.salary + "/hour");

	}

}
