package com.thi.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="categories", catalog ="cafe_order_management")
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "category_name", nullable = false)
	private String name;

	public Category() {
		
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

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
}
