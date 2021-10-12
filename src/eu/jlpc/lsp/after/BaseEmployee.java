package eu.jlpc.lsp.after;

public abstract class BaseEmployee implements IEmployee {

	public String firstName;
	public String lastName;
	public double salary;

	@Override
	public void calculatePerHourRate(int rank) {
		
		double baseAmount = 12.50;
		
		this.salary = baseAmount + (rank * 2);
		
	}

}
