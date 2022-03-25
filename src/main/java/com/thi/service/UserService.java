package com.thi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.ChangePassForm;
import com.thi.entity.LoginForm;
import com.thi.entity.RegisterForm;
import com.thi.entity.User;
import com.thi.repository.IUserRepository;
import com.thi.utils.CryptPasswordUtils;

@Service
public class UserService implements IUserService{
	
//	BCryptPasswordUtils utils = new BCryptPasswordUtils();
	
	@Autowired
	private IUserRepository repository;

	
	@Override
	public User login(LoginForm login_form) {
		boolean isOk = false;
		User user = new User();
		user = repository.findByUsername(login_form.getUsername());
		if (user != null) {
			String user_password = CryptPasswordUtils.decrypt(user.getPassword());
			if (login_form.getPassword().equals(user_password)) {
				isOk = true;
			} else {
				isOk = false;
			}
		} else {
			isOk = false;
		}
		
		if (isOk) {
		return user;
		} else {
		return null;
		}
	}

	@Override
	public boolean register(RegisterForm register_form) {
		
		User user = new User ();
		user = repository.findByUsername(register_form.getUsername());
		if (user != null) {
			return false;
		}
		
		User new_user = new User();
		if (register_form.getPassword().equals(register_form.getConfirm_password())) {
			new_user.setFull_name(register_form.getFull_name());
			new_user.setPassword(CryptPasswordUtils.encrypt(register_form.getPassword()));
			new_user.setUsername(register_form.getUsername());
			new_user.setRole("Staff");
		}
		repository.save(new_user);
		return true;
	}
	
	@Override
	public boolean changePassword(short id, ChangePassForm form) {
		User userr = new User();
		userr = repository.findById(id).get();
		if (userr == null) {
			System.out.println("Alo");
			return false;
		}
		String current_password = CryptPasswordUtils.decrypt(userr.getPassword());
		if (current_password.equals(form.getOld_password())) {
			User user = new User();
			user.setId(id);
			user.setFull_name(userr.getFull_name());
			user.setUsername(userr.getUsername());
			user.setRole(userr.getRole());
			user.setPassword(CryptPasswordUtils.encrypt(form.getNew_password()));
			repository.saveAndFlush(user);
			return true;

		} else {
			return false;			
		}

	}

	@Override
	public User getUserByID(short id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}		
	
}
