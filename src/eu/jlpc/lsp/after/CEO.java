package eu.jlpc.lsp.after;

public class CEO extends Employee implements IEmployee{

	@Override
	public void assignManager(IEmployee manager) throws Exception {
		
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
