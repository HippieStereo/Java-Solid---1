package eu.jlpc.dip.before;

public class MainProg_1 {

	public static void main(String[] args) {

        Person owner = new Person(
            "Tim",
            "Corey",
            "555-1212",
            "tim@iamtimcorey.com"
        );

        Chore chore = new Chore(
            "Take out the trash",
            owner
        );

        chore.PerformedWork(3);
        chore.PerformedWork(1.5);
        chore.CompleteChore();
        
	}

}
