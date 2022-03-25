package com.thi.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="user", catalog ="cafe_order_management")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "full_name", nullable = false)
	private String full_name;
	
	@Column(name="role", nullable = false)
	private String role;
	
	@Column(name="username", nullable = false)
	private String username;
	
	@Column(name="password", nullable = false)
	private String password;

	public User() {
		
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", full_name=" + full_name + ", role=" + role + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}
