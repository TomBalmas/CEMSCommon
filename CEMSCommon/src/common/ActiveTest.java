package common;

public class ActiveTest extends AbstractTest {

	private String startTimeTest;
	private String endTimeTest;
	private String field;

	public ActiveTest(String id, String authorName, String title, String course, String field, String startTimeTest,
			String endTimeTest) {

		super(id, authorName, title, course);
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
		return getID() + ":" + getTitle() + ":" + getAuthorName() + ":" + getCourse() + ":" + startTimeTest + ":"
				+ endTimeTest + ":" + field;
	}

}
