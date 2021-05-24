package common;

import java.util.ArrayList;

public class Teacher extends User {
	private ArrayList<String> fields = new ArrayList<>();
	
	public ArrayList<String> getFields() {
		return fields;
	}

	public Teacher(int sSN, String name, String surName, String email, String userName, String password,String fields) {
		super(sSN, name, surName, email, userName, password);
		String[] arr = fields.split(":");
		this.fields=new ArrayList<String>();
		for(String field: arr)
			this.fields.add(field);
	}
	
	public String toString() {
		return String.format("Teacher:%d,%s,%s,%s,%s,%s", getSSN(), getName(), getSurName(), getEmail(),
				getUserName(), getPassword());
	}

}
 