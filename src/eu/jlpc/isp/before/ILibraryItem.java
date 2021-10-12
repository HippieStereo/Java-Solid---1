package eu.jlpc.isp.before;

import java.time.LocalDateTime;

public interface ILibraryItem {

    void checkIn();
    void checkOut(String borrower);
    LocalDateTime getDueDate();
    
}
