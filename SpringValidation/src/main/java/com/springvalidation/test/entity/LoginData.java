package com.springvalidation.test.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
@NotBlank(message="user name can not be null...")
@Size(min = 3, max = 12, message="user name must be between 3 to 12 charactors")
private String username;

@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="invalid email !!")
private String email;

@AssertTrue(message="must agree terms and condition...")
private boolean agreed;

public boolean isAgreed() {
	return agreed;
}
public void setAgreed(boolean agreed) {
	this.agreed = agreed;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "LoginData [username=" + username + ", email=" + email + "]";
}
}
