package common;

import java.io.Serializable;

public class TimeExtensionRequest implements Serializable {
	
	String ssn;
	String content;
	String testCode;
	int minutes;
	
	public TimeExtensionRequest(String ssn, String content, String testCode, int minutes) {
		this.content = content;
		this.ssn = ssn;
		this.testCode = testCode;
		this.minutes = minutes;
	}
	
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
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
