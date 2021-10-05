package eu.jlpc.ocp.after;

public interface IApplicantModel {

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	IAccounts getAccountProcessor();

	void setAccountProcessor(IAccounts accountProcessor);

}