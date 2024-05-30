package com.sateumami.model;

public class LoginModel {
	
	private String Login;

	public String getLogin() {
		return Login;
	}

	public void setFeedback(String login) {
		this.Login = login;
	}

	@Override
	public String toString() {
		return "Login [Login=" + Login + "]";
	}

	
	
}