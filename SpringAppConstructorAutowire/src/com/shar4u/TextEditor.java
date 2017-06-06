package com.shar4u;

public class TextEditor {

	private SpellChecker checker;
	private String name;
	
	public TextEditor() {
		// TODO Auto-generated constructor stub
	}
	
	public TextEditor(SpellChecker checker, String name) {
		super();
		this.checker = checker;
		this.name = name;
	}
	
	 public void spellCheck() {
		 checker.checkSpelling();
	   }
	
	
}
