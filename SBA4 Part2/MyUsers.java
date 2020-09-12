package com.myboot.mvc.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyUsers {

@Id
String userName;
String password;
String ques1;
String ques2;
String ques3;
String ques4;

public MyUsers()
{
	
}


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getQues1() {
	return ques1;
}
public void setQues1(String ques1) {
	this.ques1 = ques1;
}
public String getQues2() {
	return ques2;
}
public void setQues2(String ques2) {
	this.ques2 = ques2;
}
public String getQues3() {
	return ques3;
}
public void setQues3(String ques3) {
	this.ques3 = ques3;
}
public String getQues4() {
	return ques4;
}
public void setQues4(String ques4) {
	this.ques4 = ques4;
}
public MyUsers(String userName, String password, String ques1, String ques2, String ques3, String ques4) {
	super();
	this.userName = userName;
	this.password = password;
	this.ques1 = ques1;
	this.ques2 = ques2;
	this.ques3 = ques3;
	this.ques4 = ques4;
}
@Override
public String toString() {
	return "MyUsers [userName=" + userName + ", password=" + password + ", ques1=" + ques1 + ", ques2=" + ques2
			+ ", ques3=" + ques3 + ", ques4=" + ques4 + "]";
}









}