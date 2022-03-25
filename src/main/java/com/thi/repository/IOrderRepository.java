package com.thi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thi.entity.Orderr;

public interface IOrderRepository extends JpaRepository<Orderr, Integer> {
	
}
