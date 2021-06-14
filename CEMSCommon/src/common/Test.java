package common;

import java.util.ArrayList;
import java.util.List;

/**
 * this class holds information about the test.
 *
 */
public class Test extends AbstractTest {

	private Integer testDuration;
	private Integer pointsPerQuestion;
	private String studentInstructions;
	private ArrayList<String> questions;
	private String teacherInstructions;
	private String field;
	private boolean flag = true;

	public Test() {
		flag = false;
	}

	public Test(String id, String authorName, String title, String course, Integer testDuration,
			Integer pointsPerQuestion, String studentInstructions, String teacherInstructions, String questionsString,
			String field) {
		super(id, authorName, title, course);
		this.testDuration = testDuration;
		this.pointsPerQuestion = pointsPerQuestion;
		this.studentInstructions = studentInstructions;
		this.teacherInstructions = teacherInstructions;
		this.field = field;
		this.questions = new ArrayList<>();
		String[] questions = questionsString.split("~");
		for (String question : questions)
			this.questions.add(question);
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getField() {
		return field;
	}

	public List<String> getQuestions() {
		return questions;
	}

	public Integer getTestDuration() {
		return testDuration;
	}

	public Integer getPointsPerQuestion() {
		return pointsPerQuestion;
	}

	public String getStudentInstructions() {
		return studentInstructions;
	}

	public String getTeacherInstructions() {
		return teacherInstructions;
	}

	@Override
	public String toString() {
		return "Test [ID=" + getID() + ", authorName=" + getAuthorName() + ", testName=" + getTitle() + ", course="
				+ getCourse() + ", testDuration=" + testDuration + ", pointsPerQuestion=" + pointsPerQuestion
				+ ", instructions=" + studentInstructions + ", teacherInstructions=" + teacherInstructions + ", field="
				+ field + "]";
	}

}
