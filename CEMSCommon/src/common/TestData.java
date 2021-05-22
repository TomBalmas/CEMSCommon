package common;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

public class TestData {
	private Date date;
	private Date submissionTime;
	private Date testOpeneingTime;
	private Integer examineesNum;
	private Integer average;
	private Integer median;
	private ArrayList<Student> examinees;
	private  Hashtable<String, Question> gradesDistribution = new Hashtable(); 
	private  Hashtable<String, Question> grades = new Hashtable(); 
}
 