package common;

import java.io.Serializable;

public class Course implements Serializable{
	
	private String courseName;
	

	public Course(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	

}
