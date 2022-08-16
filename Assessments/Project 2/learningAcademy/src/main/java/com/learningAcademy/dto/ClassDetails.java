package com.learningAcademy.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ClassDetails {
@Override
	public String toString() {
		return "ClassDetails [ClassNum=" + ClassNum + ", StudCount=" + StudCount + ", AdvisorName=" + AdvisorName + "]";
	}
@Id
private int ClassNum;
private int StudCount;
private String AdvisorName;
public int getClassNum() {
	return ClassNum;
}
public void setClassNum(int classNum) {
	ClassNum = classNum;
}
public int getStudCount() {
	return StudCount;
}
public void setStudCount(int studCount) {
	StudCount = studCount;
}
public String getAdvisorName() {
	return AdvisorName;
}
public void setAdvisorName(String advisorName) {
	AdvisorName = advisorName;
}

}
