package com.javatpoint;
public class AddMcqs {
private int id;
private String Question;
private String optionA,optionB,optionC,optionD,correct;

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
public String getoptionB() {
	return optionB;
}
public void setoptionB(String B) {
	this.optionB = B;
}
public String getoptionC() {
	return optionC;
}
public void setoptionC(String C) {
	this.optionC = C;
}
public String getoptionD() {
	return optionD;
}
public void setoptionD(String D) {
	this.optionD = D;
}
public String getCorrect() {
	return correct;
}                                                 //for correct variable 
public void setCorrect(String corr) {
	this.correct = corr;
}

}
