package common;

import java.io.Serializable;

/**
 * contains data about the students grade in a test he took
 *
 */
public class StudentGrade implements Serializable {
	private String testId;
	private String course;
	private String title;
	private int grade;
	private String teacherNotes;
	private boolean flag = true;

	public StudentGrade() {
		flag = false;
	}

	public StudentGrade(String testId, String course, String title, int grade, String teacherNotes) {
		this.testId = testId;
		this.course = course;
		this.title = title;
		this.grade = grade;
		this.teacherNotes = teacherNotes;
	}

	public String getTeacherNotes() {
		return teacherNotes;
	}

	public void setTeacherNotes(String teacherNotes) {
		this.teacherNotes = teacherNotes;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
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

	@Override
	public String toString() {
		return "StudentGrade [testId=" + testId + ", course=" + course + ", title=" + title + ", grade=" + grade + "]";
	}

}
