package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class score {

@Id
private String email;


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getQuizid() {
	return quizid;
}
public void setQuizid(int quizid) {
	this.quizid = quizid;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
private int quizid;
private int score;
}
