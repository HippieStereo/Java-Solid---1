package eu.jlpc.ocp.after;

public class PersonModel implements IApplicantModel {
	
	private String firstName;
	private String lastName;
	private IAccounts accountProcessor = new Accounts();
	
	public PersonModel(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public IAccounts getAccountProcessor() {
		return accountProcessor;
	}
	
	@Override
	public void setAccountProcessor(IAccounts accountProcessor) {
		this.accountProcessor = accountProcessor;
	}
	
}
