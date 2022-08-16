package com.learningAcademy.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TeacherDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int TeacherID;
	private String TName;
	private int age;
	private int SubID;
	
	
	
public int getTeacherID() {
	return TeacherID;
}
public void setTeacherID(int teacherID) {
	TeacherID = teacherID;
}
public String getTName() {
	return TName;
}
public void setTName(String tName) {
	TName = tName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSubID() {
	return SubID;
}
public void setSubID(int subID) {
	SubID = subID;
}
}
