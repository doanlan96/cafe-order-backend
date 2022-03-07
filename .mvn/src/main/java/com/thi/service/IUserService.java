package com.thi.service;

import com.thi.entity.LoginForm;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;

import com.thi.entity.RegisterForm;
import com.thi.entity.User;

public interface IUserService {

//	public Page<User> getAllUser(Pageable pageable);
//
//	public User getUserByID(short id);

	public User login(LoginForm login_form);
	
	public boolean register(RegisterForm register_form);

	
//	public void updateUser(User product);
//
//
//	public void deleteUser(short id);
//
//	public boolean isUserExistsByID(short id);
//
//	public boolean isUserExistsByName(String name);
	
}
