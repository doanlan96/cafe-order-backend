package com.thi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thi.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Short>{

	public Product findByName(String name);
}
