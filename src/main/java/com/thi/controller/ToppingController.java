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
import org.springframework.web.bind.annotation.RestController;

import com.thi.entity.Topping;
import com.thi.service.ToppingService;

@RestController
@RequestMapping(value = "api/v1/toppings")
@CrossOrigin(origins = "http://localhost:8100")
public class ToppingController {
	
	@Autowired
	private ToppingService service;
	
	@GetMapping()
	public List<Topping> getAllToppings() {
		return service.getAllToppings();
	}
	
//	@GetMapping(value = "/orderid/{id}")
//	public List<Order_Item> getOrderItemsByOrderID(@PathVariable(name = "id") int id) {
//		return service.getOrderItemsByOrderID(id);
//	}
	
	@GetMapping(value = "/{id}")
	public Topping getToppingByID(@PathVariable(name = "id") short id) {
		return service.getToppingByID(id);
	}
	
	@PostMapping()
	public Topping createTopping(@RequestBody Topping topping) {
		service.createTopping(topping);
		return topping;
	}
	
	@PutMapping(value = "/{id}")
	public void updateTopping(@PathVariable(name = "id") short id, @RequestBody Topping topping) {
		topping.setId(id);
		service.updateTopping(topping);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteTopping(@PathVariable(name = "id") short id) {
		service.deleteTopping(id);
	}
}
