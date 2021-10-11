package eu.jlpc.lsp.before;

public class CEO extends Employee{

	@Override
	public void assignManager(Employee manager) throws Exception {
		
		throw new Exception("The CEO has no manager");
		
	}

	@Override
	public void calculatePerHourRate(int rank) {
		
		double baseAmount = 150;
		
		salary = baseAmount + rank;
		
	}
	
	public void generatePerformanceReview() {
		System.out.println("I'm a reviewing a direct report's performance.");
	}
	
	public void fireSomeonde() {
		System.out.println("You're fired !!!");
	}

}
