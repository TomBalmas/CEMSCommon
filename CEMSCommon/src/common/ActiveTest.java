package common;

public class ActiveTest extends AbstractTest {
	
	private String startTimeTest;
	private String endTimeTest;
	private String field;

	public ActiveTest(int ID, String authorName, String testName, String course, String field, String startTimeTest, String endTimeTest) {
		
		super(ID, authorName, testName, course);
		this.field = field;
		this.startTimeTest = startTimeTest;
		this.endTimeTest = endTimeTest;
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
