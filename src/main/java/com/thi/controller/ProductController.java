package com.thi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.thi.entity.Category;
import com.thi.entity.Product;
import com.thi.service.IProductService;

@RestController
@RequestMapping(value = "api/v1/products")
@CrossOrigin(origins = "http://localhost:8100")
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	@GetMapping()
	public Page<Product> getAllProducts(Pageable pageable) {
		return service.getAllProducts(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public Product getProductByID(@PathVariable(name = "id") short id) {
		return service.getProductByID(id);
	}
	
//	@PostMapping()
//	public String createProduct(@RequestParam String name, 
//								@RequestParam MultipartFile picture, 
//								@RequestParam float price, 
//								@RequestParam int category_id) throws IOException {
//		service.createProduct(name, picture, price, category_id);
//		return "{ \"message\":"+"\"Create Successfully\"" + "}";
//	}
	
	@PostMapping()
	public Product createProduct(@RequestBody Product product) {
		service.createProduct(product);
		return product;
	}

//	@PutMapping(value = "/{id}")
//	public void updateProduct(@PathVariable(name = "id") short id,
//							@RequestParam String name, 
//							@RequestParam MultipartFile picture, 
//							@RequestParam float price, 
//							@RequestParam int category_id) throws IOException {
////		product.setId(id);
//		service.updateProduct(id, name, picture, price, category_id);
//	}
	
	@PutMapping(value = "/{id}")
	public Product updateProduct(@PathVariable(name = "id") short id, @RequestBody Product product) {
		product.setId(id);
		service.updateProduct(product);
		return product;
	}

	@DeleteMapping(value = "/{id}")
	public void deleteProduct(@PathVariable(name = "id") short id) {
		service.deleteProduct(id);
	}
}
