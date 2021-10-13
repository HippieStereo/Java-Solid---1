package eu.jlpc.dip.after;

import eu.jlpc.dip.after.extd.People;
import eu.jlpc.dip.after.impl.IMessageSender;

public class Emailer implements IMessageSender {

    @Override
	public void sendEmail(People person, String message)
    {
        System.out.println("Simulating sending an email to " + person.emailAddress);
    }
    
}
