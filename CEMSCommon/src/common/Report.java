package common;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.util.Pair;

public class Report implements Serializable {
	ArrayList<Pair<String, Integer>> testsAndGrades;
	String id;
	String testId;
	int numberOfStudents;
	double average;
	double median;
	int F; // 0-54.9
	int DMinus; // 55-64
	int DPlus; // 65 - 69
	int CMinus; // 70-74
	int CPlus; // 75-79
	int BMinus; // 80-84
	int BPlus; // 85-89
	int AMinus; // 90-94
	int APlus; // 95-100
	
	/**
	 * report for teacher
	 */
	public Report() {
		
	}

	/**
	 * report for a student
	 */
	public Report(ArrayList<Pair<String, Integer>> testsAndGrades, Double average, Double median) {
		this.testsAndGrades.addAll(testsAndGrades);
		this.average = average;
		this.median = median;
	}

	/**
	 * report for a test
	 */
	public Report(String id, String testId, int numberOfStudents, double average, double median, int f, int dMinus,
			int dPlus, int cMinus, int cPlus, int bMinus, int bPlus, int aMinus, int aPlus) {
		this.id = id;
		this.testId = testId;
		this.numberOfStudents = numberOfStudents;
		this.average = average;
		this.median = median;
		F = f;
		DMinus = dMinus;
		DPlus = dPlus;
		CMinus = cMinus;
		CPlus = cPlus;
		BMinus = bMinus;
		BPlus = bPlus;
		AMinus = aMinus;
		APlus = aPlus;
	}

	public ArrayList<Pair<String, Integer>> getTestsAndGrades() {
		return testsAndGrades;
	}

	public void setTestsAndGrades(ArrayList<Pair<String, Integer>> testsAndGrades) {
		this.testsAndGrades = testsAndGrades;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public int getF() {
		return F;
	}

	public void setF(int f) {
		F = f;
	}

	public int getDMinus() {
		return DMinus;
	}

	public void setDMinus(int dMinus) {
		DMinus = dMinus;
	}

	public int getDPlus() {
		return DPlus;
	}

	public void setDPlus(int dPlus) {
		DPlus = dPlus;
	}

	public int getCMinus() {
		return CMinus;
	}

	public void setCMinus(int cMinus) {
		CMinus = cMinus;
	}

	public int getCPlus() {
		return CPlus;
	}

	public void setCPlus(int cPlus) {
		CPlus = cPlus;
	}

	public int getBMinus() {
		return BMinus;
	}

	public void setBMinus(int bMinus) {
		BMinus = bMinus;
	}

	public int getBPlus() {
		return BPlus;
	}

	public void setBPlus(int bPlus) {
		BPlus = bPlus;
	}

	public int getAMinus() {
		return AMinus;
	}

	public void setAMinus(int aMinus) {
		AMinus = aMinus;
	}

	public int getAPlus() {
		return APlus;
	}

	public void setAPlus(int aPlus) {
		APlus = aPlus;
	}

}
