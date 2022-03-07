package com.thi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.Category;
import com.thi.repository.ICategoryRepository;


@Service
public class CategoryService {
	@Autowired
	private ICategoryRepository repository;
	

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	public Category getCategoryByID(short id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}


//	public Category getProductByName(String name) {
//		// TODO Auto-generated method stub
//		return repository.findByName(name);
//	}


	public void createCategory(Category category) {
		// TODO Auto-generated method stub
		repository.save(category);
	}


	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(category);
	}


	public void deleteCategory(short id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
}
