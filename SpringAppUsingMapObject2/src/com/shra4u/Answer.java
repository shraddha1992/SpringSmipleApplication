package com.shra4u;

public class Answer {

	private String answer;

	
	
	public Answer(String answer) {
		super();
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answer=" + answer + "]";
	}
	
	
}
