package common;

import java.util.ArrayList;
import java.util.Hashtable;

public class Student extends User {
	private ArrayList<Test> tests = new ArrayList<>();

	public Student(String ssn, String name, String surName, String email, String userName, String password) {
		super(ssn, name, surName, userName, email, password);
	}

	public String toString() {
		return String.format("Student: %s, %s, %s, %s, %s, %s", getSSN(), getName(), getSurName(), getEmail(),
				getUserName(), getPassword());
	}

}
