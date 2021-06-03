package common;

import java.io.Serializable;

public class StudentGrade implements Serializable{
	private String testId;
	private String course;
	private String title;
	private int grade;
	
	public StudentGrade(String testId, String course, String title, int grade) {
		super();
		this.testId = testId;
		this.course = course;
		this.title = title;
		this.grade = grade;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}
