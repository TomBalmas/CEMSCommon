package common;

public class Principle extends User{

	public Principle(int sSN, String name, String surName, String userName, String email, String password) {
		super(sSN, name, surName, userName, email, password);
	}
	
	public String toString() {
		return String.format("Principle:%d,%s,%s,%s,%s,%s", getSSN(), getName(), getSurName(), getEmail(),
				getUserName(), getPassword());
	}


 
}
