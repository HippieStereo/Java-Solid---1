package eu.jlpc.dip.before;

public class Emailer {

    public void sendEmail(Person person, String message)
    {
        System.out.println("Simulating sending an email to " + person.emailAddress);
    }
    
}
