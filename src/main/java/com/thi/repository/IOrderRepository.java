package com.thi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thi.entity.Orderr;


public interface IOrderRepository extends JpaRepository<Orderr, Integer> {
	public Orderr findTopByOrderByIdDesc();
	
	@Query(value = "SELECT * FROM orderr WHERE table_id = ?1 AND state = 'not paid' LIMIT 1", nativeQuery = true)
	public Orderr findByTableIdWithState(int table_id);

	@Query(value = "SELECT * FROM orderr WHERE form = ?1", nativeQuery = true)
	public List<Orderr> findByForm(String form);
	
}
