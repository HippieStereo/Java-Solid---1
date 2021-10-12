package eu.jlpc.isp.after.implement;

import java.time.LocalDateTime;

public interface IBorrowable {

	public void checkIn();
	public void checkOut(String borrower);
	public LocalDateTime getDueDate();
    
}
