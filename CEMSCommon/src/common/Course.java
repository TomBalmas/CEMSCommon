package common;

import java.io.Serializable;

public class Course implements Serializable {

	private String id;
	private String name;
	private String field;
	private boolean flag = true;
	
	public Course() {
		flag = false;
	}

	public Course(String id, String name, String field) {
		this.id = id;
		this.name = name;
		this.field = field;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", field=" + field + "]";
	}

}
