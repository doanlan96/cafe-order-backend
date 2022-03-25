package com.thi.service;

import java.util.List;
import com.thi.entity.Order_Item;

public interface IOrderItemService {

	public List<Order_Item> getAllOrderItems();
	
	public List<Order_Item> getOrderItemsByOrderID(int id);

	public Order_Item getOrderItemByID(int id);
	
	public void createOrderItem(Order_Item order_item);
	
	public void updateOrderItemQuantity(Order_Item order_item);

	public void deleteOrderItem(int id);
	
}
