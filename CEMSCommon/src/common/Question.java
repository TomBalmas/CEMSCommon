package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Question implements Serializable {

	private String id;
	private String author;
	private String questionText;
	private int correctAnswer;
	private ArrayList<String> answers = new ArrayList<>();
	private String field;

	public String getField() {
		return field;
	}

	public String getAuthor() {
		return author;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Question(String id, String author, String questionText, int correctAnswer, String field,
			ArrayList<String> answers) {
		this.id = id;
		this.author = author;
		this.questionText = questionText;
		this.correctAnswer = correctAnswer;
		this.field = field;
		this.answers = answers;
	}

	public String getQuestionText() {
		return questionText;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Question)
			return ((Question) arg0).getID().equals(id);
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
