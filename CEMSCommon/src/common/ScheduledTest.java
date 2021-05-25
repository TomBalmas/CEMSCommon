package common;

import java.sql.Date;
import java.sql.Time;

public class ScheduledTest extends AbstractTest {

	private String date;
	private String startingTime;
	private int duration;
	private String belongsToID; // id of the teacher that scheduled the test
	private String code;

	public ScheduledTest(String id, String authorName, String title, String course, String date, String startingTime,
			Integer duration, String belongsToID, String code) {
		super(id, authorName, title, course);
		this.date = date;
		this.startingTime = startingTime;
		this.duration = duration;
		this.belongsToID = belongsToID;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getBelongsToID() {
		return belongsToID;
	}

	public void setBelongsToID(String belongsToID) {
		this.belongsToID = belongsToID;
	}

}
