package common;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
	private List<String> fields;
	private List<ScheduledTest> scheduledTests = new ArrayList<ScheduledTest>();

	public List<String> getFields() {
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
		if(scheduledTests.contains(test))
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
		for(ScheduledTest toRemove : scheduledTests)
			if(toRemove.equals(test)) {
				scheduledTests.remove(toRemove);
				return true;
			}
		return false;
	}

	public Teacher(int sSN, String name, String surName, String email, String userName, String password,
			String fields) {
		super(sSN, name, surName, email, userName, password);
		scheduledTests = new ArrayList<ScheduledTest>();
		String[] arr = fields.split(":");
		this.fields = new ArrayList<>();
		for (String field : arr)
			this.fields.add(field);

	}

	public String toString() {
		return String.format("Teacher:%d,%s,%s,%s,%s,%s", getSSN(), getName(), getSurName(), getEmail(), getUserName(),
				getPassword());
	}

}
