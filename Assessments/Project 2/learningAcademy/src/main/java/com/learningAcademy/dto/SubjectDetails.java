package com.learningAcademy.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SubjectDetails {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int SubID;
private String SubjectName;


public int getSubID() {
	return SubID;
}
public void setSubID(int subID) {
	SubID = subID;
}
public String getSubjectName() {
	return SubjectName;
}
public void setSubjectName(String subjectName) {
	SubjectName = subjectName;
}
}
