package com.thi.entity;

public class RegisterForm {

	private String full_name;
	private String username;
	private String password;
	private String confirm_password;
	
	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
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
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	
	@Override
	public String toString() {
		return "RegisterForm [full_name=" + full_name + ", username=" + username + ", password=" + password
				+ ", confirm_password=" + confirm_password + "]";
	}
	
	
	
	
}
