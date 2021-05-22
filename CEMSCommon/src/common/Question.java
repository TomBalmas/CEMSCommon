package common;

import java.util.Hashtable;

public class Question {
	private Integer ID;
	private String author;
	private String questionText;
	private  Hashtable<Question, Integer> rightAnswers = new Hashtable(); 
	private  Hashtable<String, Question> answers = new Hashtable(); 
	private String field;
	
	public Question(Integer id, String author, String questionText,  String field) {
		this.ID = id;
		this.author = author;
		this.questionText = questionText;
		this.field = field;
	}
} 
