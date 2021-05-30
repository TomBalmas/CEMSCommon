package common;

public class TimeExtensionRequest {
	
	String ssn;
	String content;
	String testCode;
	
	public TimeExtensionRequest(String ssn, String content, String testCode) {
		this.content = content;
		this.ssn = ssn;
		this.testCode = testCode;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getTestCode() {
		return testCode;
	}
	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

}
