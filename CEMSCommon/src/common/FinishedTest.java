package common;

/**
 * this class contains data about a students scheduled test that is finished.
 * also contains if the student submitted on time or forcedly because time finished
 *
 */
public class FinishedTest extends AbstractTest {

	private String teacherSSN;
	private String studentSSN;
	private String date;
	private String startingTime;
	private int timeTaken;
	private String presentationMethod;
	private int grade;
	private String status;
	private boolean flag = true;

	public FinishedTest() {
		flag = false;
	}

	public FinishedTest(String id, String authorName, String title, String course, String teacherSSN, String studentSSN,
			String date, String startingTime, int timeTaken, String presentationMethod, int grade, String status) {
		super(id, authorName, title, course);
		this.teacherSSN = teacherSSN;
		this.studentSSN = studentSSN;
		this.date = date;
		this.startingTime = startingTime;
		this.timeTaken = timeTaken;
		this.presentationMethod = presentationMethod;
		this.grade = grade;
		this.status = status;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String getPresentationMethod() {
		return presentationMethod;
	}

	public void setPresentationMethod(String presentationMethod) {
		this.presentationMethod = presentationMethod;
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
