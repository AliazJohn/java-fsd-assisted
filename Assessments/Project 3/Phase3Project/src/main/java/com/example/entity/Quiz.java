package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Quiz {
@Id
@Column(name="id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int quizid;
private int questionid1;
private int questionid2;
private int questionid3;
private int questionid4;
private int questionid5;
public int getQuizid() {
	return quizid;
}
public void setQuizid(int quizid) {
	this.quizid = quizid;
}
public int getQuestionid1() {
	return questionid1;
}
public void setQuestionid1(int questionid1) {
	this.questionid1 = questionid1;
}
public int getQuestionid2() {
	return questionid2;
}
public void setQuestionid2(int questionid2) {
	this.questionid2 = questionid2;
}
public int getQuestionid3() {
	return questionid3;
}
public void setQuestionid3(int questionid3) {
	this.questionid3 = questionid3;
}
public int getQuestionid4() {
	return questionid4;
}
public void setQuestionid4(int questionid4) {
	this.questionid4 = questionid4;
}
public int getQuestionid5() {
	return questionid5;
}
public void setQuestionid5(int questionid5) {
	this.questionid5 = questionid5;
}

}
