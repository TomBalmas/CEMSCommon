package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Question implements Serializable  {
	private Integer ID;
	private String author;
	private String instructionsForTeacher;
	private String instructionsForStudents;
	private String questionText;
	private int correctAnswer;
	private  ArrayList<String> answers = new ArrayList<>();
	private String field;
	public String getAuthor() {
		return author;
	}
	public Question(Integer id, String author,String instructionsForTeacher,String instructionsForStudents,String questionText,
			int correctAnswer,String field,ArrayList<String> answers) {
		this.ID = id;
		this.author = author;
		this.instructionsForTeacher=instructionsForTeacher;
		this.instructionsForStudents=instructionsForStudents;
		this.questionText = questionText;
		this.correctAnswer=correctAnswer;
		this.field = field;
		this.answers=answers;
	}
} 
