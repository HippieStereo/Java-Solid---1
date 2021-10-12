package eu.jlpc.isp.after.audiobook;

import java.time.LocalDateTime;

import eu.jlpc.isp.after.extend.ParentAudioBook;
import eu.jlpc.isp.after.implement.IBorrowable;

public class AudioBook extends ParentAudioBook implements IBorrowable {

    public String libraryId;
    public String title;
    public String author;
    public int checkOutDurationInDays = 14;
    public String borrower;
    public LocalDateTime borrowDate;
    public int RuntimeInMinutes;

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
