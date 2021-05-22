package common;

import java.util.Date;
import java.util.Hashtable;

public class Test {
	private int ID;
	private String authorName;
	private String testName;
	private String course;
	private Date testDuration;
	private Hashtable<Question, Integer> pointsPerQuestion = new Hashtable();
	private String examineeInstructions;
	private String teacherInstructions;
	private String field;
	private TestData testData;

	public Test(int iD, String authorName, String testName, String course, Date testDuration,
			Hashtable<Question, Integer> pointsPerQuestion, String examineeInstructions, String teacherInstructions,
			String field) {
		ID = iD;
		this.authorName = authorName;
		this.testName = testName;
		this.course = course;
		this.testDuration = testDuration;
		this.pointsPerQuestion = pointsPerQuestion;
		this.examineeInstructions = examineeInstructions;
		this.teacherInstructions = teacherInstructions;
		this.field = field;
	}

	public boolean finishTest() {
		testData = new TestData();
		return false;

	}

}
