package com.thi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thi.entity.Topping_Order_Item;
import com.thi.service.ToppingOrderItemService;

@RestController
@RequestMapping(value = "api/v1/toppingorderitems")
@CrossOrigin(origins = "http://localhost:8100")
public class ToppingOrderItemController {

	@Autowired
	private ToppingOrderItemService service;
	
	@GetMapping()
	public List<Topping_Order_Item> getAllToppingOrderItems() {
		return service.getAllToppingOrderItems();
	}
	
	@GetMapping(value = "/orderitemid/{id}")
	public List<Topping_Order_Item> getOrderItemsByOrderItemID(@PathVariable(name = "id") int id) {
		return service.getToppingOrderItemsByOrderItemID(id);
	}
	
	@GetMapping(value = "/{id}")
	public Topping_Order_Item getToppingOrderItemByID(@PathVariable(name = "id") int id) {
		return service.getToppingOrderItemByID(id);
	}
	
	@PostMapping()
	public Topping_Order_Item createToppingOrderItem(@RequestBody Topping_Order_Item topping_order_item) {
		service.createToppingOrderItem(topping_order_item);
		return topping_order_item;
	}

	@DeleteMapping(value = "/{id}")
	public void deleteToppingOrderItem(@PathVariable(name = "id") int id) {
		service.deleteToppingOrderItem(id);
	}
	
}
