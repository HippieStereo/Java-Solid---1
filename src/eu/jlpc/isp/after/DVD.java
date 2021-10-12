package eu.jlpc.isp.after;

import java.time.LocalDateTime;
import java.util.List;

import eu.jlpc.isp.after.implement.IBorrowable;

public class DVD implements IBorrowable {

    public String LibraryId;
    public String Title;
    public String Author = "";
    public int pages = -1;
    public int checkOutDurationInDays = 14;
    public String borrower;
    public LocalDateTime borrowDate;
    public List<String> actors;
    public int runtimeInMinutes;

    @Override
    public void checkOut(String borrower){
    	
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
        
    }

    @Override
    public void checkIn(){
    	
        borrower = "";
        
    }

    @Override
    public LocalDateTime getDueDate(){
		
    	return null;
		
    }
    
}
