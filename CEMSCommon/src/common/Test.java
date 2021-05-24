package common;

import java.util.ArrayList;
import java.util.List;

public class Test extends AbstractTest {

	private String testDuration;
	private String pointsPerQuestion;
	private String instructions;
	private List<String> questions;
	private String teacherInstructions;
	private String field;

	public String getField() {
		return field;
	}

	public Test(int ID, String authorName, String testName, String course, String testDuration,
			String pointsPerQuestion, String instructions, String teacherInstructions, String questions, String field) {
		super(ID, authorName, testName, course);
		this.testDuration = testDuration;
		this.pointsPerQuestion = pointsPerQuestion;
		this.instructions = instructions;
		this.teacherInstructions = teacherInstructions;
		this.field = field;
		String[] arr = questions.split(":");
		this.questions = new ArrayList<>();
		for (String question : arr)
			this.questions.add(question);
	}

	public List<String> getQuestions() {
		return questions;
	}

	@Override
	public String toString() {
		return "Test [ID=" + getID() + ", authorName=" + getAuthorName() + ", testName=" + getTitle() + ", course=" + getCourse()
				+ ", testDuration=" + testDuration + ", pointsPerQuestion=" + pointsPerQuestion + ", instructions="
				+ instructions + ", teacherInstructions=" + teacherInstructions + ", field=" + field + "]";
	}

}
