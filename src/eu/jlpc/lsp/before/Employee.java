package eu.jlpc.lsp.before;

public class Employee {

	public String firstName;
	public String lastName;
	public Employee manager = null;
	public double salary;

	public void assignManager(Employee manager) throws Exception {
		this.manager = manager;
	}
	
	public void calculatePerHourRate(int rank) {
		
		double baseAmount = 12.50;
		
		this.salary = baseAmount + (rank * 2);
		
	}
	
}
