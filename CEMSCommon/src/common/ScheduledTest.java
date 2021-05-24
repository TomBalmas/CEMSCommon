package common;

import java.sql.Date;
import java.sql.Time;

public class ScheduledTest extends AbstractTest{
	
	private int id;
	private String title;
	private String author;
	private Date date;
	private Time startingTime;
	private int duration;
	private int belongsTo;
	
	public ScheduledTest(int ID, String authorName, String testName, String course) {
		super(ID, authorName, testName, course);
	}
	
	
}
