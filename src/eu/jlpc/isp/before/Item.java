package eu.jlpc.isp.before;

import java.time.LocalDateTime;

public abstract class Item {

	public String author;
	public LocalDateTime borrowDate;
	public String borrower;
	public int checkOutDurationInDays;
	public String LibraryId;
	public int pages;
	public String title;
	
}
