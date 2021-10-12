package eu.jlpc.isp.before;

import java.time.LocalDateTime;

public class Book implements ILibraryItem {

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
