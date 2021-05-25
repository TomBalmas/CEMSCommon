package common;

import java.util.ArrayList;
import java.util.Hashtable;

public class Student extends User {
	private Hashtable<StudentsTest, Test> grades = new Hashtable();
	private ArrayList<Test> tests = new ArrayList<>();

	public Student(String ssn, String name, String surName, String email, String userName, String password) {
		super(ssn, name, surName, userName, email, password);
	}

	public String toString() {
		return String.format("Student: %d, %s, %s, %s, %s, %s", getSSN(), getName(), getSurName(), getEmail(),
				getUserName(), getPassword());
	}

}
