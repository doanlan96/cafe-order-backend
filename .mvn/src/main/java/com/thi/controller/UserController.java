package com.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thi.entity.LoginForm;
import com.thi.entity.RegisterForm;
import com.thi.entity.User;
import com.thi.service.IUserService;

@RestController
@RequestMapping(value = "api/v1")
@CrossOrigin(origins = "http://localhost:8100")
public class UserController {

	@Autowired
	private IUserService service;
	
	@PostMapping(value = "/login")
	public User login(@RequestBody LoginForm login_form) {
//		User user =  service.login(login_form);
//		if (user != null) {
//			return user;
//		} else {
//			return null;
//		}
		return service.login(login_form);
	}
	
	@PostMapping(value = "/register")
	public String register(@RequestBody RegisterForm register_form) {
		boolean isOk = service.register(register_form);
		if (isOk) {
		return "{ \"message\":"+"\"Register Successfully\"" + "}";
		} else {
		return "{ \"message\":"+"\"Register Failed\"" + "}";	
		}
	}
}
