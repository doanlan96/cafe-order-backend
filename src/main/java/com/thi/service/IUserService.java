package com.thi.service;

import com.thi.entity.LoginForm;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;

import com.thi.entity.User;
import com.thi.entity.RegisterForm;
import com.thi.entity.ChangePassForm;

public interface IUserService {

//	public Page<User> getAllUser(Pageable pageable);
//
	public User getUserByID(short id);

	public User login(LoginForm login_form);
	
	public boolean register(RegisterForm register_form);

	
	public boolean changePassword(short id, ChangePassForm form);
//
//
//	public void deleteUser(short id);
//
//	public boolean isUserExistsByID(short id);
//
//	public boolean isUserExistsByName(String name);
	
}
