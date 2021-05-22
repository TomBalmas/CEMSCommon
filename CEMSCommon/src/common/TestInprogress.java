package common;

import java.util.Date;

public class TestInprogress {
	
	private String code;
	private Date submittionTime;
	private Date testOpeningTime;
	private Integer studentCounter;
	private Date testDate;
	private Integer examineesNum;
	private boolean  isLocked ;
	private TestData data;
	private ComputedTest computedTest;
	private ManualTest manualTest;
	
	public TestInprogress(String code, Date submittionTime, Date testOpeningTime, Integer studentCounter, Date testDate,
			Integer examineesNum, boolean isLocked, TestData data, ComputedTest computedTest, ManualTest manualTest) {
		this.code = code;
		this.submittionTime = submittionTime;
		this.testOpeningTime = testOpeningTime;
		this.studentCounter = studentCounter;
		this.testDate = testDate;
		this.examineesNum = examineesNum;
		this.isLocked = isLocked;
		this.data = data;
		this.computedTest = computedTest;
		this.manualTest = manualTest;
	}
}
 