package com.project.university;

public class User {

	int user_id;
	String user_name;
	String password;
	String role;
	public User() {
		super();
	}
	public User(int user_id, String user_name, String password, String role) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.role = role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", role=" + role
				+ ", getUser_id()=" + getUser_id() + ", getUser_name()=" + getUser_name() + ", getPassword()="
				+ getPassword() + ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
