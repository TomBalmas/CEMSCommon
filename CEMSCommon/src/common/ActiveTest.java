package common;

public class ActiveTest extends AbstractTest {

	private String startingTime;
	private String finishTime;
	private String field;
	private String code;

	public ActiveTest(String id, String authorName, String title, String course, String field, String startingTime,
			String finishTime, String code) {

		super(id, authorName, title, course);
		this.field = field;
		this.startingTime = startingTime;
		this.finishTime = finishTime;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getStartTimeTest() {
		return startingTime;
	}

	public String getField() {
		return field;
	}

	@Override
	public String toString() {
		return getID() + "," + getAuthorName() + "," + getTitle() + "," + getCourse() + "," + field + ","
				+ startingTime + "," + finishTime + "," + code;
	}
}
