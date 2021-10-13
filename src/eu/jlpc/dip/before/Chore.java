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

	public void performedWork(double hours){
        
    	hoursWorked += hours;
    	
        Logger log = new Logger();
        log.log("Performed work on " + choreName);
        
    }

    public void completeChore(){

    	isComplete = true;

        Logger log = new Logger();
        log.log("Completed " +  choreName);

        Emailer emailer = new Emailer();
        emailer.sendEmail(owner, String.format("The chore %s is complete.", choreName));
        
    }
    
}
