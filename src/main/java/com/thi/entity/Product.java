package com.thi.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
//import javax.persistence.Entity;
//import javax.persistence.Table;
import lombok.Setter;

@Entity
@Table(name="products", catalog ="cafe_order_management")
@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "product_name", nullable = false)
	private String name;
	
	@Column(name = "picture", nullable = false)
	private String picture;
	
	@Column(name = "price", nullable = false)
	private float price;
	
	@Column(name = "category_id", nullable = false)
	private int category_id;

	public Product() {
		
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", picture=" + picture + ", price=" + price + ", category_id="
				+ category_id + "]";
	}

	
	
}
