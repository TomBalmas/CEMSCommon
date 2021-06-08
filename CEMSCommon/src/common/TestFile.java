package common;

import java.io.Serializable;

public class TestFile implements Serializable {
	private byte[] byteArray;
	private String fileName = null;
	private String filePath = null;
	private int size = 0;
	private boolean flag = true;

	public TestFile() {

	}

	public TestFile(String filePath) {
		this.filePath = filePath;
		fileName = filePath.substring(filePath.lastIndexOf("/"), filePath.length()-1);
	}
	

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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
