package common;

import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;

public class Test implements Serializable {
	@Override
	public String toString() {
		return "Test [ID=" + ID + ", authorName=" + authorName + ", testName=" + testName + ", course=" + course
				+ ", testDuration=" + testDuration + ", pointsPerQuestion=" + pointsPerQuestion + ", instructions="
				+ instructions + ", teacherInstructions=" + teacherInstructions + ", field=" + field + ", testData="
				+ testData + "]";
	}

	private int ID;
	private String authorName;
	private String testName;
	private String course;
	private String testDuration;
	private String pointsPerQuestion;
	private String instructions;
	public int getID() {
		return ID;
	}

	public String getTestName() {
		return testName;
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

	public String getField() {
		return field;
	}

	private String teacherInstructions;
	private String field;
	private TestData testData;

	public Test(int ID, String authorName, String testName, String course, String testDuration,
			String pointsPerQuestion, String instructions, String teacherInstructions, String field) {
		this.ID = ID;
		this.authorName = authorName;
		this.testName = testName;
		this.course = course;
		this.testDuration = testDuration;
		this.pointsPerQuestion = pointsPerQuestion;
		this.instructions = instructions;
		this.teacherInstructions = teacherInstructions;
		this.field = field;
	}

	public boolean finishTest() {
		testData = new TestData();
		return false;

	}

}
