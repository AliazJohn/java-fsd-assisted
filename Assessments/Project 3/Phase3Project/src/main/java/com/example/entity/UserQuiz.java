package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserQuiz {
/*user quiz id*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int uqid;
/*Administrator quiz id*/
private int quizid;
/*user email*/
private String email;
/*user question id*/
private int qid;
/*user answers */
private String answers;
public int getUqid() {
	return uqid;
}
public void setUqid(int uqid) {
	this.uqid = uqid;
}
public int getQuizid() {
	return quizid;
}
public void setQuizid(int quizid) {
	this.quizid = quizid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getAnswers() {
	return answers;
}
public void setAnswers(String answers) {
	this.answers = answers;
}
}
