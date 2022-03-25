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

import com.thi.entity.Order_Item;
import com.thi.service.IOrderItemService;

@RestController
@RequestMapping(value = "api/v1/orderitems")
@CrossOrigin(origins = "http://localhost:8100")
public class OrderItemController {

	@Autowired
	private IOrderItemService service;
	
	@GetMapping()
	public List<Order_Item> getAllOrderItems() {
		return service.getAllOrderItems();
	}
	
	@GetMapping(value = "/orderid/{id}")
	public List<Order_Item> getOrderItemsByOrderID(@PathVariable(name = "id") int id) {
		return service.getOrderItemsByOrderID(id);
	}
	
	@GetMapping(value = "/{id}")
	public Order_Item getOrderItemByID(@PathVariable(name = "id") int id) {
		return service.getOrderItemByID(id);
	}
	
	@PostMapping()
	public Order_Item createOrderItem(@RequestBody Order_Item order_item) {
		service.createOrderItem(order_item);
		return order_item;
	}

	@PutMapping(value = "/{id}")
	public void updateOrderItemQuantity(@PathVariable(name = "id") int id, @RequestBody Order_Item order_item) {
		order_item.setId(id);		
		service.updateOrderItemQuantity(order_item);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteOrderItem(@PathVariable(name = "id") int id) {
		service.deleteOrderItem(id);
	}
	
}
