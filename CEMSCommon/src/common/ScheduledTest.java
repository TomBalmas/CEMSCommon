package common;

import java.sql.Date;
import java.sql.Time;

public class ScheduledTest extends AbstractTest {

	private Date date;
	private Time startingTime;
	private int duration;
	private int belongsTo; // id of the teacher that scheduled the test

	public ScheduledTest(int ID, String authorName, String testName, String course, Date date, Time startingTime,
			Integer duration, Integer belongsTo) {
		super(ID, authorName, testName, course);
		this.date = date;
		this.startingTime = startingTime;
		this.duration = duration;
		this.belongsTo = belongsTo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(Time startingTime) {
		this.startingTime = startingTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getBelongsTo() {
		return belongsTo;
	}

	public void setBelongsTo(int belongsTo) {
		this.belongsTo = belongsTo;
	}

}
