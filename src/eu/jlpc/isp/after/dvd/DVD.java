package eu.jlpc.isp.after.dvd;

import java.time.LocalDateTime;
import java.util.List;

import eu.jlpc.isp.after.extend.ParentDVD;
import eu.jlpc.isp.after.implement.IBorrowable;

public class DVD extends ParentDVD implements IBorrowable {

    public String libraryId;
    public String title;
    public int checkOutDurationInDays = 14;
    public String borrower;
    public LocalDateTime borrowDate;
    public List<String> actors;
    public int runtimeInMinutes;

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
