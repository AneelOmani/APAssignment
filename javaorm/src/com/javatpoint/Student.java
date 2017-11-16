package com.javatpoint;

public class Student {
private int id,score;
private String Name;
private String username,pwd;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getscore()
{
	return score;
}
public void setscore(int Score)
{
  score=Score;	
}
public String getName() {
	return Name;
}

public void setname(String name) {
	this.Name = name;
}
public String getusername() {
	return username;
}                                        //getter and setter function for each column of table and default constructor 
public void setusername(String user) {
	this.username = user;
}
public String getpwd() {
	return pwd;
}
public void setpwd(String psd) {
	this.pwd = psd;
}
}
