package com.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		User user =  service.login(login_form);

		return service.login(login_form);
	}
	
	@PostMapping(value = "/register")
	public ResponseEntity<String> register(@RequestBody RegisterForm register_form) {
		boolean isOk = service.register(register_form);
		if (isOk) {
		return new ResponseEntity<>("Register successfully", HttpStatus.OK);
		} else {
		return new ResponseEntity<>("Register failed", HttpStatus.BAD_REQUEST);	
		}
	}
	
	@PutMapping(value = "/changepass/{id}")
	public User changePassword(@PathVariable(name = "id") short id, @RequestBody User user) {
		user.setId(id);
		service.changePassword(user);
		return user;
	}
}
