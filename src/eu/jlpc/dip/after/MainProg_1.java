package eu.jlpc.dip.after;

import eu.jlpc.dip.after.extd.People;
import eu.jlpc.dip.after.impl.IChore;

public class MainProg_1 {

	public static void main(String[] args) {

        People owner = Factory.createPerson();
        
        owner.firstName = "Tim";
        owner.lastName = "Corey";
        owner.phoneNumber = "555-1212";
        owner.emailAddress = "tim@iamtimcorey.com";
 
        IChore chore = Factory.createChore();
        
        ((Chore)chore).choreName = "Take out the trash";
        ((Chore)chore).owner = owner;

        chore.performedWork(3);
        chore.performedWork(1.5);
        chore.completeChore();

        chore.performedWork(3);
        chore.performedWork(1.5);
        chore.completeChore();
        
	}

}
