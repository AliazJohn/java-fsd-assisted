package com.learningAcademy.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class loginDetails {
@Id
private String email;
private String pswd;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPswd() {
	return pswd;
}
public void setPswd(String pswd) {
	this.pswd = pswd;
}

}
