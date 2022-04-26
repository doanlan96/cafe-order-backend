package com.thi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.Topping;
import com.thi.repository.IToppingRepository;

@Service
public class ToppingService {
	@Autowired
	private IToppingRepository repository;
	

	public List<Topping> getAllToppings() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	public Topping getToppingByID(short id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}


//	public Category getProductByName(String name) {
//		// TODO Auto-generated method stub
//		return repository.findByName(name);
//	}


	public void createTopping(Topping topping) {
		// TODO Auto-generated method stub
		repository.save(topping);
	}


	public void updateTopping(Topping topping) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(topping);
	}


	public void deleteTopping(short id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
}
