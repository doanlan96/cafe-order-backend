package com.thi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thi.entity.User;

public interface IUserRepository extends JpaRepository<User, Short> {

	public User findByUsername(String username);
	
}
