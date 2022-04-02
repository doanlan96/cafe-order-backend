package com.thi.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "order_item", catalog = "cafe_order_management")
public class Order_Item implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="orderid", nullable = false)
	private int orderid;
	
	@Column(name="product_id", nullable = false)
	private int product_id;
	
	@Column(name="product_name", nullable = false)
	private String product_name;
	
	@Column(name="product_price", nullable = false)
	private float product_price;	
	
	@Column(name="quantity", nullable = false)
	private int quantity;

	public Order_Item() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int order_id) {
		this.orderid = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order_Item [id=" + id + ", order_id=" + orderid + ", product_id=" + product_id + ", quantity="
				+ quantity + "]";
	}
	
	
}
