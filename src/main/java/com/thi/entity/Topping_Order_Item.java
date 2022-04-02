package com.thi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topping_order_item", catalog ="cafe_order_management")
public class Topping_Order_Item implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "order_item_id", nullable = false)
	private int order_item_id;
	
	@Column(name = "topping_id", nullable = false)
	private int topping_id;
	
	@Column(name = "topping_name", nullable = false)
	private String topping_name;	
	
	@Column(name = "topping_price", nullable = false)
	private float topping_price;

	public Topping_Order_Item() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(int order_item_id) {
		this.order_item_id = order_item_id;
	}

	public int getTopping_id() {
		return topping_id;
	}

	public void setTopping_id(int topping_id) {
		this.topping_id = topping_id;
	}

	public String getTopping_name() {
		return topping_name;
	}

	public void setTopping_name(String topping_name) {
		this.topping_name = topping_name;
	}

	public float getTopping_price() {
		return topping_price;
	}

	public void setTopping_price(float topping_price) {
		this.topping_price = topping_price;
	}

	@Override
	public String toString() {
		return "Topping_Order_Item [id=" + id + ", order_item_id=" + order_item_id + ", topping_id=" + topping_id
				+ ", topping_name=" + topping_name + ", topping_price=" + topping_price + "]";
	}
	
}
