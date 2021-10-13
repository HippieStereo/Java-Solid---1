package eu.jlpc.dip.after;

import eu.jlpc.dip.after.extd.Chores;
import eu.jlpc.dip.after.extd.People;
import eu.jlpc.dip.after.impl.IChore;
import eu.jlpc.dip.after.impl.ILogger;
import eu.jlpc.dip.after.impl.IMessageSender;

public class Chore extends Chores implements IChore {

    private ILogger log;
    private IMessageSender messageSender;
    
    public Chore(ILogger logger, IMessageSender messageSender) {
		
    	this.log = logger;
    	this.messageSender = messageSender;
    	
	}

	@Override
	public void performedWork(double hours){
        
    	hoursWorked += hours;
    	
        log.log("Performed work on " + choreName);
        
    }

    @Override
	public void completeChore(){

    	isComplete = true;

        log.log("Completed " +  choreName);

        IMessageSender emailer = new Emailer();
        emailer.sendEmail(owner, String.format("The chore %s is complete.", choreName));
        
    }
    
}
