package common;

public class ActiveTest extends AbstractTest {
	
	private int ID;
	private String testName;
	private String authorName;
	private String course;
	private String startTimeTest;
	private String endTimeTest;
	private String field;

	public ActiveTest(int ID, String authorName, String testName, String course, String field, String startTimeTest, String endTimeTest) {
		
		super(ID, authorName, testName, course);
		this.ID = ID;
		this.testName = testName;
		this.authorName = authorName;
		this.course = course;
		this.field = field;
		this.startTimeTest = startTimeTest;
		this.endTimeTest = endTimeTest;
	}

	public int getID() {
		return ID;
	}

	public String getTestName() {
		return testName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getCourse() {
		return course;
	}

	public String getStartTimeTest() {
		return startTimeTest;
	}

	public String getEndTimeTest() {
		return endTimeTest;
	}

	public String getField() {
		return field;
	}

	@Override
	public String toString() {
		
		return ID + ":" + testName + ":"+ authorName+course + ":" + startTimeTest + ":" + endTimeTest + ":"+ field;
	}
	
}
