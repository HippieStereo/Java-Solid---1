package eu.jlpc.isp.after;

import java.time.LocalDateTime;

import eu.jlpc.isp.after.implement.IBorrowable;

public class Book implements IBorrowable {

    public String LibraryId;
    public String Title;
    public String Author;
    public int pages;
    public int checkOutDurationInDays = 14;
    public String borrower;
    public LocalDateTime borrowDate;
    
	@Override
	public void checkIn() {
		
		borrower = "";
		
	}

	@Override
	public void checkOut(String borrower) {
		
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
        
	}

	@Override
	public LocalDateTime getDueDate() {
		
		return borrowDate.plusDays(checkOutDurationInDays);
		
	}

}
