package com.thi.service;

import java.util.List;

import com.thi.entity.Orderr;

public interface IOrderService {

	public List<Orderr> getAllOrders();

	public Orderr getOrderByID(int id);
	
	public void createOrder(Orderr order);
	
	public void updateOrder(Orderr order);

	public void deleteOrder(int id);
	
	public Orderr getLastestOrder();
	
	public Orderr findByTableIdWithState(int table_id);

}
