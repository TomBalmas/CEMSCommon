package common;

import java.util.ArrayList;
import java.util.List;

public class Test extends AbstractTest {

	private Integer testDuration;
	private Integer pointsPerQuestion;
	private String instructions;
	private ArrayList<String> questions;
	private String teacherInstructions;
	private String field;

	public String getField() {
		return field;
	}

	public Test(String id, String authorName, String title, String course, Integer testDuration,
			Integer pointsPerQuestion, String instructions, String teacherInstructions, String questionsString, String field) {
		super(id, authorName, title, course);
		this.testDuration = testDuration;
		this.pointsPerQuestion = pointsPerQuestion;
		this.instructions = instructions;
		this.teacherInstructions = teacherInstructions;
		this.field = field;
		this.questions = new ArrayList<>();
		String[] questions = questionsString.split("~");
		for (String question : questions)
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
