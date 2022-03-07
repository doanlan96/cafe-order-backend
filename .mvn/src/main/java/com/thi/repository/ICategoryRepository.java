package com.thi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thi.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category, Short> {

}
