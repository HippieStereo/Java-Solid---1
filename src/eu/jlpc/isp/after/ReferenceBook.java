package eu.jlpc.isp.after;

import java.time.LocalDateTime;

import eu.jlpc.isp.after.implement.IBorrowable;

public class ReferenceBook implements IBorrowable {

    public String libraryId;
    public String title;
    public String author;
    public int pages;
    public int checkOutDurationInDays = 0;
    public String borrower;
    public LocalDateTime borrowDate;

    @Override
    public void checkOut(String borrower)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void checkIn()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public LocalDateTime getDueDate()
    {
        throw new UnsupportedOperationException();
    }

}
