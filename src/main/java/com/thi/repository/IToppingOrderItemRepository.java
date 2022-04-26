package com.thi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thi.entity.Topping_Order_Item;

public interface IToppingOrderItemRepository extends JpaRepository<Topping_Order_Item, Integer> {
	
	public List<Topping_Order_Item> findByOrderitemid(int id);
	
}
