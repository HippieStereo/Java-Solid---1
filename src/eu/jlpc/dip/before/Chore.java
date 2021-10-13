package eu.jlpc.dip.before;

public class Chore {

    public String choreName;
    public Person owner;
    public double hoursWorked;
    public boolean isComplete;

    public Chore(String choreName, Person owner) {
		
		this.choreName = choreName;
		this.owner = owner;
		
	}

	public void PerformedWork(double hours){
        
    	hoursWorked += hours;
    	
        Logger log = new Logger();
        log.log("Performed work on " + choreName);
        
    }

    public void CompleteChore(){

    	isComplete = true;

        Logger log = new Logger();
        log.log("Completed " +  choreName);

        Emailer emailer = new Emailer();
        emailer.SendEmail(owner, String.format("The chore %s is complete.", choreName));
        
    }
    
}
