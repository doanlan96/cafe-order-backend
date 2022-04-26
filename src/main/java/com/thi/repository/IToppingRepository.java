package com.thi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thi.entity.Topping;

public interface IToppingRepository extends JpaRepository<Topping, Short> {

}
