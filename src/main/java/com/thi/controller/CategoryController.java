package com.thi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thi.entity.Category;
import com.thi.service.CategoryService;

@RestController
@RequestMapping(value = "api/v1/categories")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping()
	public List<Category> getAllCategories() {
		return service.getAllCategories();
	}
	
	@GetMapping(value = "/{id}")
	public Category getCategoryByID(@PathVariable(name = "id") short id) {
		return service.getCategoryByID(id);
	}
	
	@PostMapping()
	public String createCategory(@RequestBody Category category) {
		service.createCategory(category);
		return "{ \"message\":"+"\"Create Successfully\"" + "}";
	}

	@PutMapping(value = "/{id}")
	public void updateCategory(@PathVariable(name = "id") short id, @RequestBody Category category) {
		category.setId(id);
		service.updateCategory(category);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteCategory(@PathVariable(name = "id") short id) {
		service.deleteCategory(id);
	}
}
