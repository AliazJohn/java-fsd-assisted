package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedbackEntity {
public FeedbackEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;
private String email;
private String feedback;
public FeedbackEntity(String name, String email, String feedback) {
	super();
	this.name = name;
	this.email = email;
	this.feedback = feedback;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
}
