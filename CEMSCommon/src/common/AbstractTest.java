package common;

import java.io.Serializable;

public abstract class AbstractTest implements Serializable{
	
	private int ID;
	private String authorName;
	private String title;
	private String course;
	
	public int getID() {
		return ID;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCourse() {
		return course;
	}
	
	public AbstractTest(int ID, String authorName, String title, String course) {
		this.ID = ID;
		this.authorName = authorName;
		this.title = title;
		this.course = course;
	}

}
