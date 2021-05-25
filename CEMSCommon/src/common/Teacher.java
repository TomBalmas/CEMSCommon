package common;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
	private String fields;
	private List<ScheduledTest> scheduledTests = new ArrayList<ScheduledTest>();

	public String getFields() {
		return fields;
	}

	/**
	 * adds a test to the scheduled tests list
	 * 
	 * @param test
	 * @return true of test was added
	 * @return false if test wasn't added
	 */
	public boolean addScheduledTest(ScheduledTest test) {
		if (scheduledTests.contains(test))
			return false;
		scheduledTests.add(test);
		return true;
	}

	/**
	 * removes a test from the scheduled tests list
	 * 
	 * @param test
	 * @return true if test was removed
	 * @return false if test was not found
	 */
	public boolean removeScheduledTest(ScheduledTest test) {
		for (ScheduledTest toRemove : scheduledTests)
			if (toRemove.equals(test)) {
				scheduledTests.remove(toRemove);
				return true;
			}
		return false;
	}

	public Teacher(String ssn, String name, String surName, String email, String userName, String password,
			String fields) {
		super(ssn, name, surName, email, userName, password);
		this.fields = fields;
	}

	public String toString() {
		return String.format("Teacher:%d,%s,%s,%s,%s,%s", getSSN(), getName(), getSurName(), getEmail(), getUserName(),
				getPassword());
	}

}
