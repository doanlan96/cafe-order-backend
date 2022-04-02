package com.thi.service;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.Orderr;
import com.thi.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository repository;	
	
	@Override
	public List<Orderr> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Orderr getOrderByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void createOrder(Orderr order) {
		LocalTime current_time = LocalTime.now();
		current_time = LocalTime.of(current_time.getHour(), current_time.getMinute());
		Date date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
		String current_date = date_format.format(date);
		order.setTime_in(current_time);
		order.setTime_out(current_time);
		order.setDay_month_year(current_date);
		order.setState("not paid");
		repository.save(order);
	}

	@Override
	public void updateOrder(Orderr order) {
		LocalTime current_time = LocalTime.now();
		current_time = LocalTime.of(current_time.getHour(), current_time.getMinute());
		order.setTime_out(current_time);	
		repository.saveAndFlush(order);
	}

	@Override
	public void deleteOrder(int id) {
		repository.deleteById(id);
	}

	@Override
	public Orderr getLastestOrder() {
		// TODO Auto-generated method stub
		return repository.findTopByOrderByIdDesc();
	}

	@Override
	public Orderr findByTableIdWithState(int table_id) {
		// TODO Auto-generated method stub
		return repository.findByTableIdWithState(table_id);
	}

}
