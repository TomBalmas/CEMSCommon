package common;

import java.io.Serializable;

public class TestFile implements Serializable {
	public byte[] byteArray;
	String fileName = null;
	int size = 0;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public TestFile(String fileName) {
		this.fileName = fileName;
	}

	public void initArray(int size) {
		byteArray = new byte[size];
	}

	public byte[] getByteArray() {
		return byteArray;
	}

	public void setByteArray(byte[] byteArray) {
		this.byteArray = byteArray;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
