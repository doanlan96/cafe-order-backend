package com.thi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thi.entity.Order_Item;


public interface IOrderItemRepository extends JpaRepository<Order_Item, Integer> {
	
	public List<Order_Item> findByOrderid(int id);

}
