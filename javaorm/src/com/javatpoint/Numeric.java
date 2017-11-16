package com.javatpoint;

public class Numeric {
private int id;
private String Question;
private String optionA,correct;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return Question;
}

public void setQuestion(String quest) {
	this.Question = quest;
}
public String getoptionA() {
	return optionA;
}                                        //getter and setter function for each column of table and default constructor 
public void setoptionA(String A) {
	this.optionA = A;
}
public String getCorrect() {
	return correct;
}                                        //getter and setter function for each column of table and default constructor 
public void setCorrect(String corr) {
	this.correct = corr;
}
}
