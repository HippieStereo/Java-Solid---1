package eu.jlpc.dip.after;

import eu.jlpc.dip.after.extd.People;
import eu.jlpc.dip.after.impl.IChore;
import eu.jlpc.dip.after.impl.ILogger;
import eu.jlpc.dip.after.impl.IMessageSender;

public abstract class Factory {

	public static People createPerson() {
		return new Person();
	}
	
    public static IChore createChore(){
        return new Chore(createLogger(), createMessageSender());
    }

    public static ILogger createLogger(){
        return new Logger();
    }

    public static IMessageSender createMessageSender(){
        return new Texter();
    }
    
}
