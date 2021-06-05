package common;

import java.util.ArrayList;
import java.util.Hashtable;

public class Student extends User {
	private ArrayList<Test> tests = new ArrayList<>();
	private boolean flag = true;

	public Student() {
		flag = false;
	}

	public Student(String ssn, String name, String surName, String email, String userName, String password) {
		super(ssn, name, surName, userName, email, password);
	}

	public String toString() {
		return String.format("Student: %s, %s, %s, %s, %s, %s", getSSN(), getName(), getSurName(), getEmail(),
				getUserName(), getPassword());
	}

	public ArrayList<Test> getTests() {
		return tests;
	}

	public void setTests(ArrayList<Test> tests) {
		this.tests = tests;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
