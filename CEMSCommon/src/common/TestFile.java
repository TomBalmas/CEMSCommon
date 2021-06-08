package common;

import java.io.Serializable;

public class TestFile implements Serializable {
	public byte[] byteArray;
	String fileName = null;
	String filePath = null;
	int size = 0;

	public TestFile(String fileName) {
		this.filePath = filePath;
		String[] split = filePath.split(":");
		fileName = split[1].substring(0, split[1].length() - 1);
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
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
