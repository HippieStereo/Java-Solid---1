package eu.jlpc.isp.after.book;

import java.time.LocalDateTime;

import eu.jlpc.isp.after.extend.ParentBook;
import eu.jlpc.isp.after.implement.IBorrowable;

public class Book extends ParentBook implements IBorrowable{

    public String libraryId;
    public String title;
    public String author;
    public int pages;
    public int checkOutDurationInDays = 14;
    public String borrower;
    public LocalDateTime borrowDate;

    @Override
    public void checkOut(String borrower)
    {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public void checkIn()
    {
        borrower = "";
    }

    @Override
    public LocalDateTime getDueDate()
    {
        return borrowDate.plusDays(checkOutDurationInDays);
    }
	
}
