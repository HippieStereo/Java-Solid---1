package eu.jlpc.dip.after;

import eu.jlpc.dip.after.impl.ILogger;

public class Logger implements ILogger {

    @Override
	public void log(String message)
    {
        System.out.println(String.format("Write to Console : %s", message));
    }
    
}
