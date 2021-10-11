package eu.jlpc.lsp.before;

public class MainProg {

	public static void main(String[] args) throws Exception {
		
		Manager accoutingVP = new Manager();
		
		accoutingVP.firstName = "Emma";
		accoutingVP.lastName = "Stone";
		accoutingVP.calculatePerHourRate(4);
		
		Employee emp_1 = new CEO();
		
		emp_1.firstName = "First name";
		emp_1.lastName = "Last lame";
		emp_1.assignManager(accoutingVP);
		emp_1.calculatePerHourRate(2);
		
		System.out.println(emp_1.firstName + " salary is : " + emp_1.salary + "/hour");

	}

}
