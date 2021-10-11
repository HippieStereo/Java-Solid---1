package eu.jlpc.lsp.before;

public class Manager extends Employee{

	@Override
	public void calculatePerHourRate(int rank) {
		
		double baseAmount = 19.75;
		
		salary = baseAmount + (rank * 4);
		
	}

	public void generatePerformanceReview() {
		System.out.println("I'm a reviewing a direct report's performance.");
	}
	
}
