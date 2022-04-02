package com.thi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.Order_Item;
import com.thi.repository.IOrderItemRepository;

@Service
public class OrderItemService implements IOrderItemService {

	@Autowired
	private IOrderItemRepository repository;

	@Override
	public List<Order_Item> getAllOrderItems() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Order_Item> getOrderItemsByOrderID(int id) {
		// TODO Auto-generated method stub
		return repository.findByOrderid(id);
	}

	@Override
	public Order_Item getOrderItemByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void createOrderItem(Order_Item order_item) {
		// TODO Auto-generated method stub
//		order_item.setQuantity(1);
		repository.save(order_item);
	}

	@Override
	public void updateOrderItemQuantity(Order_Item order_item) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(order_item);
	}

	@Override
	public void deleteOrderItem(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}


	
}
