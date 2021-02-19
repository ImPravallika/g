package org.oar.app.model;

public class User {
	private String firstname;
private String lastname;
private String username;
private String password;
private int age;
public User()
{
	
}
public User(String firstname, String lastname, String username, String password, int age) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	this.password = password;
	this.age = age;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
