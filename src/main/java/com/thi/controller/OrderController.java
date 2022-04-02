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

import com.thi.entity.Orderr;
import com.thi.service.IOrderService;

@RestController
@RequestMapping(value = "api/v1/orders")
@CrossOrigin(origins = "http://localhost:8100")
public class OrderController {

	@Autowired
	private IOrderService service;
	
	@GetMapping()
	public List<Orderr> getAllOrders() {
		return service.getAllOrders();
	}
	
	@GetMapping(value="/lastest")
	public Orderr getLastestOrder() {
		return service.getLastestOrder();
	}
	
	@GetMapping(value = "/tableid/{id}")
	public Orderr getOrderByTableIDWithState(@PathVariable(name = "id") int table_id) {
		return service.findByTableIdWithState(table_id);
	}	
	
	@GetMapping(value = "/{id}")
	public Orderr getOrderByID(@PathVariable(name = "id") int id) {
		return service.getOrderByID(id);
	}
	
	@PostMapping()
	public Orderr createOrder(@RequestBody Orderr order) {
		service.createOrder(order);
		return order;
	}

	@PutMapping(value = "/{id}")
	public void updateOrder(@PathVariable(name = "id") int id, @RequestBody Orderr order) {
		order.setId(id);
		service.updateOrder(order);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteOrder(@PathVariable(name = "id") int id) {
		service.deleteOrder(id);
	}
	
}
