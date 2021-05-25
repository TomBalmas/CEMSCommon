package common;

public class TestToBeChecked extends AbstractTest {
	
	private String date;
	private String testCode;
	private String pointsPErQuestion;
	private String startingTime;
	
	public TestToBeChecked(String id, String authorName, String title, String course,  String date, String startingTime,
			String testCode, String pointsPErQuestion ) {
		super(id, authorName, title, course);
		
	}

	public String getDate() {
		return date;
	}

	public String getTestCode() {
		return testCode;
	}

	public String getPointsPErQuestion() {
		return pointsPErQuestion;
	}

	public String getStartingTime() {
		return startingTime;
	}
	
	//sdsad

}
