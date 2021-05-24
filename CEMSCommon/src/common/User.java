package common;

import java.io.Serializable;

public abstract class User implements Serializable{
	private int SSN;
	private String name;
	private String surName;
	private String email;
	private String userName;
	private String password;
	
	public User(int sSN, String name, String surName,  String email, String userName, String password) {
		SSN = sSN;
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public int getSSN() {
		return SSN;
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	 
	
}
