package eu.jlpc.dip.after;

import eu.jlpc.dip.after.extd.People;
import eu.jlpc.dip.after.impl.IMessageSender;

public class Texter implements IMessageSender{

	@Override
	public void sendEmail(People person, String message) {
		
		System.out.println("I am texting " + person.firstName + " to say " + message);
		
	}

}
