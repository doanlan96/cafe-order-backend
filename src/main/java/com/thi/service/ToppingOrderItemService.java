package com.thi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.Topping_Order_Item;
import com.thi.repository.IToppingOrderItemRepository;

@Service
public class ToppingOrderItemService {
	@Autowired
	private IToppingOrderItemRepository repository;
	

	public List<Topping_Order_Item> getAllToppingOrderItems() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	public List<Topping_Order_Item> getToppingOrderItemsByOrderItemID(int id) {
		// TODO Auto-generated method stub
		return repository.findByOrderitemid(id);
	}


	public Topping_Order_Item getToppingOrderItemByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}


//	public Category getProductByName(String name) {
//		// TODO Auto-generated method stub
//		return repository.findByName(name);
//	}


	public void createToppingOrderItem(Topping_Order_Item topping) {
		// TODO Auto-generated method stub
		repository.save(topping);
	}


	public void updateToppingOrderItem(Topping_Order_Item topping) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(topping);
	}


	public void deleteToppingOrderItem(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
}
