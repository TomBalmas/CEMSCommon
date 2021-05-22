package common;

import java.io.File;
import java.util.Date;

public class StudentsTest {

	private Integer grade;
	private String teachersComments;
	private Test testContent;
	private File testWordFile;
	private Date timeTestStarted;
	private Date timeTestEnded;
	public StudentsTest(Integer grade, String teachersComments, Test testContent, File testWordFile,
			Date timeTestStarted, Date timeTestEnded) {
		this.grade = grade;
		this.teachersComments = teachersComments;
		this.testContent = testContent;
		this.testWordFile = testWordFile;
		this.timeTestStarted = timeTestStarted;
		this.timeTestEnded = timeTestEnded;
	}
}
 