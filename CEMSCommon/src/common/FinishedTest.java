package common;

public class FinishedTest extends AbstractTest {

	private String teacherSSN;
	private String studentSSN;
	private String date;
	private String startingTime;
	private int grade;
	private String status;

	public FinishedTest(String id, String authorName, String title, String course, String teacherSSN, String studentSSN,
			String date, String startingTime, int grade, String status) {
		super(id, authorName, title, course);
		this.teacherSSN = teacherSSN;
		this.studentSSN = studentSSN;
		this.date = date;
		this.startingTime = startingTime;
		this.grade = grade;
		this.status = status;
	}

	public String getTeacherSSN() {
		return teacherSSN;
	}

	public void setTeacherSSN(String teacherSSN) {
		this.teacherSSN = teacherSSN;
	}

	public String getStudentSSN() {
		return studentSSN;
	}

	public void setStudentSSN(String studentSSN) {
		this.studentSSN = studentSSN;
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
